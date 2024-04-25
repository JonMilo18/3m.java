package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class BajakAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final String URL = "jdbc:mysql://localhost:3306/3m";
    protected static final String USER = "root";
    protected static final String PASSWORD = "1WMG2023";
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTable table_1;
	private JTextField textField_1;
	private JTable table_2;
	private JTable table_3;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
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
		btnNewButton.setBounds(207, 17, 72, 21);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Ezabatu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(289, 17, 72, 21);
		panel_3.add(btnNewButton_1);
		
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
		btnNewButton_2.setBounds(216, 10, 72, 21);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("Ezabatu");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textField_2.getText());
                // Produktua ezabatu
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                    String query = "DELETE FROM langileak WHERE id = ?";
                    try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                        preparedStatement.setInt(1, id);
                        preparedStatement.executeUpdate();

                        // Erabiltzaileari mezu bat erakutsi
                      
                        System.out.println("Langilea ezabatu da");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
			}
		});
		btnNewButton_1_1.setBounds(298, 10, 72, 21);
		panel_2.add(btnNewButton_1_1);
		
		table_2 = new JTable();
		table_2.setBounds(26, 302, 797, 225);
		panel_2.add(table_2);
		
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
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(216, 10, 72, 21);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_1_2 = new JButton("Ezabatu");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(textField_2.getText());
                // Produktua ezabatu
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                    String query = "DELETE FROM produktuak WHERE id = ?";
                    try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                        preparedStatement.setInt(1, id);
                        preparedStatement.executeUpdate();

                        // Erabiltzaileari mezu bat erakutsi
                      
                        System.out.println("Produktua ezabatu da");
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
			}
		});
		btnNewButton_1_2.setBounds(298, 10, 72, 21);
		panel_1.add(btnNewButton_1_2);
	}
}
