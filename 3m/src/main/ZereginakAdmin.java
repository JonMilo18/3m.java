package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ZereginakAdmin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;

    protected static final String URL = "jdbc:mysql://localhost/3m";
    protected static final String USER = "root";
    protected static final String PASSWORD = "1WMG2023";

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ZereginakAdmin frame = new ZereginakAdmin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ZereginakAdmin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 962, 593);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        textField = new JTextField();
        textField.setBounds(75, 119, 96, 19);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JLabel lblNewLabel = new JLabel("Zeregina");
        lblNewLabel.setBounds(75, 96, 96, 13);
        contentPane.add(lblNewLabel);
        
        JLabel lblNewLabel_1 = new JLabel("Egilea");
        lblNewLabel_1.setBounds(219, 96, 96, 13);
        contentPane.add(lblNewLabel_1);
        
        textField_1 = new JTextField();
        textField_1.setBounds(219, 119, 96, 19);
        contentPane.add(textField_1);
        textField_1.setColumns(10);
        
        JLabel lblNewLabel_2 = new JLabel("Hasiera ordua:");
        lblNewLabel_2.setBounds(348, 96, 96, 13);
        contentPane.add(lblNewLabel_2);
        
        textField_2 = new JTextField();
        textField_2.setBounds(348, 119, 96, 19);
        contentPane.add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setBounds(471, 119, 96, 19);
        contentPane.add(textField_3);
        textField_3.setColumns(10);
        
        JLabel lblNewLabel_3 = new JLabel("Bukaera ordua:");
        lblNewLabel_3.setBounds(471, 96, 96, 13);
        contentPane.add(lblNewLabel_3);
        
        JButton btnNewButton = new JButton("Bidali");
        btnNewButton.setBounds(647, 118, 85, 21);
        contentPane.add(btnNewButton);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String zeregina = textField.getText();
                int egilea = Integer.parseInt(textField_1.getText()); // Suponiendo que 'Egilea' es un número
                String hasieraOrdua = textField_2.getText();
                String bukaeraOrdua = textField_3.getText();

                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                    String query = "INSERT INTO zereginak (zeregina, egilea, hasieraOrdua, bukaeraOrdua) VALUES (?, ?, ?, ?)";
                    try (PreparedStatement statement = connection.prepareStatement(query)) {
                        statement.setString(1, zeregina);
                        statement.setInt(2, egilea);
                        statement.setString(3, hasieraOrdua);
                        statement.setString(4, bukaeraOrdua);

                        int rowsInserted = statement.executeUpdate();
                        if (rowsInserted > 0) {
                            System.out.println("Inserción exitosa.");
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.out.println("Error en la inserción: " + ex.getMessage());
                }
            }
        });
    }
}
