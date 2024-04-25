package main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class BajakAdmin extends JFrame {

    private static final long serialVersionUID = 1L;
    private static final String URL = "jdbc:mysql://localhost:3306/3m";
    private static final String USER = "root";
    private static final String PASSWORD = "1WMG2023";
    private JPanel contentPane;
    private JTable table;
    private JTextField textField;
    private JTable table_1;
    private JTextField textField_1;
    private JTable table_3;
    private JTextField textField_2;
    private int searchedId = -1;  // Variable para almacenar el ID buscado

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    BajakAdmin frame = new BajakAdmin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public BajakAdmin() {
        setTitle("3M| BajakADM");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 75, 1214, 675);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 1200, 648);
        contentPane.add(panel);
        panel.setLayout(null);

        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
        tabbedPane.setBounds(0, 0, 838, 564);
        panel.add(tabbedPane);

        // Bezeroak panel
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(new Color(255, 255, 255));
        tabbedPane.addTab("Bezeroak", null, panel_3, null);
        panel_3.setLayout(null);

        table = new JTable();
        table.setBorder(new LineBorder(new Color(0, 0, 0)));
        table.setBounds(65, 320, 617, 176);
        panel_3.add(table);

        textField = new JTextField();
        textField.setBounds(152, 18, 45, 19);
        panel_3.add(textField);
        textField.setColumns(10);

        JLabel lblNewLabel = new JLabel("Id-a:");
        lblNewLabel.setBounds(97, 21, 45, 13);
        panel_3.add(lblNewLabel);

        JButton btnNewButton = new JButton("Bilatu");
        btnNewButton.addActionListener(e -> {
            int id = Integer.parseInt(textField.getText());
            searchedId = id;
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                String query = "SELECT * FROM bezeroak WHERE id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    table.setModel(buildTableModel(resultSet));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
        btnNewButton.setBounds(207, 17, 72, 21);
        panel_3.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Ezabatu");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (searchedId != -1) {
                    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                        String query = "DELETE FROM bezeroak WHERE id = ?";
                        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                            preparedStatement.setInt(1, searchedId);
                            preparedStatement.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Bezeroa ezabatu da", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            searchedId = -1;
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ez dago bezeroa bilatu", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnNewButton_1.setBounds(289, 17, 72, 21);
        panel_3.add(btnNewButton_1);

        // Langileak panel
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 255, 255));
        tabbedPane.addTab("Langileak", null, panel_2, null);
        panel_2.setLayout(null);

        table_1 = new JTable();
        table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
        table_1.setBounds(57, 302, 655, 192);
        panel_2.add(table_1);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(161, 11, 45, 19);
        panel_2.add(textField_1);

        JLabel lblNewLabel_1 = new JLabel("Id-a:");
        lblNewLabel_1.setBounds(106, 14, 45, 13);
        panel_2.add(lblNewLabel_1);

        JButton btnNewButton_2 = new JButton("Bilatu");
        btnNewButton_2.addActionListener(e -> {
            int id = Integer.parseInt(textField_1.getText());
            searchedId = id;
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                String query = "SELECT * FROM langileak WHERE id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    table_1.setModel(buildTableModel(resultSet));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
        btnNewButton_2.setBounds(216, 10, 72, 21);
        panel_2.add(btnNewButton_2);

        JButton btnNewButton_1_1 = new JButton("Ezabatu");
        btnNewButton_1_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (searchedId != -1) {
                    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                        String query = "DELETE FROM langileak WHERE id = ?";
                        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                            preparedStatement.setInt(1, searchedId);
                            preparedStatement.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Langilea ezabatu da", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            searchedId = -1;
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ez dago langilea bilatu", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnNewButton_1_1.setBounds(298, 10, 72, 21);
        panel_2.add(btnNewButton_1_1);

        // Produktuak panel
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        tabbedPane.addTab("Produktuak", null, panel_1, null);
        panel_1.setLayout(null);

        table_3 = new JTable();
        table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
        table_3.setBounds(74, 313, 617, 176);
        panel_1.add(table_3);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(161, 11, 45, 19);
        panel_1.add(textField_2);

        JLabel lblNewLabel_2 = new JLabel("Id-a:");
        lblNewLabel_2.setBounds(106, 14, 45, 13);
        panel_1.add(lblNewLabel_2);

        JButton btnNewButton_3 = new JButton("Bilatu");
        btnNewButton_3.addActionListener(e -> {
            int id = Integer.parseInt(textField_2.getText());
            searchedId = id;
            try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                String query = "SELECT * FROM produktuak WHERE id = ?";
                try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                    preparedStatement.setInt(1, id);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    table_3.setModel(buildTableModel(resultSet));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        });
        btnNewButton_3.setBounds(216, 10, 72, 21);
        panel_1.add(btnNewButton_3);

        JButton btnNewButton_1_2 = new JButton("Ezabatu");
        btnNewButton_1_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (searchedId != -1) {
                    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                        String query = "DELETE FROM produktuak WHERE id = ?";
                        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                            preparedStatement.setInt(1, searchedId);
                            preparedStatement.executeUpdate();
                            JOptionPane.showMessageDialog(null, "Produktua ezabatu da", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                            searchedId = -1;
                        }
                    } catch (SQLException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Ez dago produktua bilatu", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnNewButton_1_2.setBounds(298, 10, 72, 21);
        panel_1.add(btnNewButton_1_2);
    }

    // Método para convertir ResultSet a DefaultTableModel
    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();

        // Nombres de columnas
        Vector<String> columnNames = new Vector<>();
        int columnCount = metaData.getColumnCount();
        for (int column = 1; column <= columnCount; column++) {
            columnNames.add(metaData.getColumnName(column));
        }

        // Datos de la tabla
        Vector<Vector<Object>> data = new Vector<>();
        while (rs.next()) {
            Vector<Object> vector = new Vector<>();
            for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                vector.add(rs.getObject(columnIndex));
            }
            data.add(vector);
        }

        return new DefaultTableModel(data, columnNames);
    }
}
