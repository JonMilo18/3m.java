package main;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class ZereginakB extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTable table;
    private DefaultTableModel model;

    protected static final String URL = "jdbc:mysql://localhost/3m";
    protected static final String USER = "root";
    protected static final String PASSWORD = "1WMG2023";

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ZereginakB frame = new ZereginakB();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ZereginakB() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 792, 539);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Zein da zure id-a?");
        lblNewLabel.setBounds(52, 53, 103, 13);
        contentPane.add(lblNewLabel);
        
        textField = new JTextField();
        textField.setBounds(52, 76, 96, 19);
        contentPane.add(textField);
        textField.setColumns(10);
        
        JButton btnNewButton = new JButton("Zereginak bilatu");
        btnNewButton.setBounds(188, 75, 132, 21);
        contentPane.add(btnNewButton);
        
        model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Zeregina");
        model.addColumn("Egilea");
        model.addColumn("Hasiera Ordua");
        model.addColumn("Bukaera Ordua");
        
        table = new JTable(model);
        table.setBounds(24, 214, 479, 257);
        contentPane.add(table);

        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int egilea = Integer.parseInt(textField.getText());

                model.setRowCount(0); // Limpiar la tabla
                
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                    String query = "SELECT * FROM zereginak WHERE egilea = ?";
                    try (PreparedStatement statement = connection.prepareStatement(query)) {
                        statement.setInt(1, egilea);
                        
                        ResultSet resultSet = statement.executeQuery();
                        while (resultSet.next()) {
                         
                            String zeregina = resultSet.getString("zeregina");
                  
                            String hasieraOrdua = resultSet.getString("hasieraOrdua");
                            String bukaeraOrdua = resultSet.getString("bukaeraOrdua");
                            
                            model.addRow(new Object[]{zeregina, hasieraOrdua, bukaeraOrdua});
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                    System.out.println("Error en la consulta: " + ex.getMessage());
                }
            }
        });
    }
}
