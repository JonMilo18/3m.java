package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Login extends JFrame {

    private static final long serialVersionUID = 1L;
    protected static final String URL = "jdbc:mysql://localhost/3m";
    protected static final String USER = "root";
    protected static final String PASSWORD = "1WMG2023";
    private JPanel contentPane;
    private JTextField textField;
    private JPasswordField passwordField;
    private JLabel lblNewLabel_2;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Login frame = new Login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Login() {
        setTitle("3M| Logina");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 75, 1214, 675);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(192, 192, 192));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Erabiltzailea");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(502, 333, 213, 36);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Pasahitza");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 30));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(502, 431, 213, 37);
        contentPane.add(lblNewLabel_1);
        
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        textField.setBounds(502, 379, 213, 42);
        contentPane.add(textField);
        textField.setColumns(10);
        
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordField.setBounds(502, 478, 213, 42);
        contentPane.add(passwordField);
        
        JButton btnNewButton = new JButton("Logeatu");
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnNewButton.setForeground(new Color(0, 0, 0));
        btnNewButton.setBackground(new Color(240, 240, 240));
        btnNewButton.setBounds(457, 553, 157, 36);
        contentPane.add(btnNewButton);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String erabiltzailea = textField.getText();
                String pasahitza = new String(passwordField.getPassword());

                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                    String query = "SELECT * FROM langileak WHERE erabiltzailea = ? AND pasahitza = ?";
                    try (PreparedStatement statement = connection.prepareStatement(query)) {
                        statement.setString(1, erabiltzailea);
                        statement.setString(2, pasahitza);

                        ResultSet resultSet = statement.executeQuery();

                        if (resultSet.next()) {
                            // Credenciales correctas
                            String lanPostua = resultSet.getString("lanPostua");
                            if ("Jabea".equalsIgnoreCase(lanPostua)) {
                                MenuAdmin oforma = new MenuAdmin();
                                oforma.setVisible(true);
                            } else {
                                MenuB oforma = new MenuB();
                                oforma.setVisible(true);
                            }
                            dispose();  // Cierra la ventana de login
                        } else {
                            // Credenciales incorrectas
                            JOptionPane.showMessageDialog(null, "Erabiltzailea edo pasahitza okerrak.", "Errorea", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Errorea datu basearekin konexioa egiterakoan: " + ex.getMessage(), "Errorea", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });
        
        lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Jon\\Downloads\\3M (1).png"));
        lblNewLabel_2.setBounds(457, 10, 375, 313);
        contentPane.add(lblNewLabel_2);
        
        JButton btnNewButton_1 = new JButton("Garbitu");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
                passwordField.setText("");
            }
        });
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnNewButton_1.setBounds(624, 553, 157, 36);
        contentPane.add(btnNewButton_1);
    }
}
