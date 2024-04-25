package main;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AldaketakAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	protected static final String URL = "jdbc:mysql://localhost:3306/3m";
    protected static final String USER = "root";
    protected static final String PASSWORD = "1WMG2023";
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_25;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_40;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_49;
	private JTextField textField_50;
	private JTextField textField_51;
	private JTextField textField_52;
	private JTextField textField_53;
	private JTextField textField_54;
	private JTextField textField_55;
	private JTextField textField_56;
	private JTextField textField_57;
	private JTextField textField_58;
	private JTextField textField_59;
	private JTextField textField_60;
	private JTextField textField_61;
	private JTextField textField_62;
	private JTextField textField_63;
	private JTextField textField_64;
	private JTextField textField_65;
	private JTextField textField_66;
	private JTextField textField_67;
	private JTextField textField_68;
	private JTextField textField_69;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_73;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AldaketakAdmin frame = new AldaketakAdmin();
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
	public AldaketakAdmin() {
		setTitle("3M|AldaketakADM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1284, 682);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1326, 635);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1266, 625);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Bezeroak", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5_1 = new JLabel("Id-a:");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1.setBounds(10, 52, 132, 13);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Izena:");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setBounds(10, 75, 132, 13);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Abizena:");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setBounds(10, 98, 132, 13);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Jaiotze data:");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1.setBounds(10, 121, 132, 13);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Herria:");
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_1.setBounds(10, 144, 132, 13);
		panel_2.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Helbidea:");
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7_1.setBounds(10, 167, 132, 13);
		panel_2.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Korreoa:");
		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8_1.setBounds(10, 190, 132, 13);
		panel_2.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Telefonoa:");
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9_1.setBounds(10, 213, 132, 13);
		panel_2.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Erabiltzailea:");
		lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1.setBounds(10, 236, 132, 13);
		panel_2.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("Pasahitza:");
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1.setBounds(10, 259, 132, 13);
		panel_2.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("Kontu korrontea:");
		lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12_1.setBounds(10, 282, 132, 13);
		panel_2.add(lblNewLabel_12_1);
		
		textField_25 = new JTextField();
		textField_25.setEditable(false);
		textField_25.setColumns(10);
		textField_25.setBounds(152, 279, 96, 19);
		panel_2.add(textField_25);
		
		textField_28 = new JTextField();
		textField_28.setEditable(false);
		textField_28.setColumns(10);
		textField_28.setBounds(152, 256, 96, 19);
		panel_2.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setEditable(false);
		textField_29.setColumns(10);
		textField_29.setBounds(152, 233, 96, 19);
		panel_2.add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setEditable(false);
		textField_30.setColumns(10);
		textField_30.setBounds(152, 210, 65, 19);
		panel_2.add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setEditable(false);
		textField_31.setColumns(10);
		textField_31.setBounds(152, 187, 96, 19);
		panel_2.add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setEditable(false);
		textField_32.setColumns(10);
		textField_32.setBounds(152, 164, 96, 19);
		panel_2.add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setEditable(false);
		textField_33.setColumns(10);
		textField_33.setBounds(152, 141, 96, 19);
		panel_2.add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setEditable(false);
		textField_34.setColumns(10);
		textField_34.setBounds(152, 118, 38, 19);
		panel_2.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setEditable(false);
		textField_35.setColumns(10);
		textField_35.setBounds(200, 118, 27, 19);
		panel_2.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setEditable(false);
		textField_36.setColumns(10);
		textField_36.setBounds(237, 118, 27, 19);
		panel_2.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setEditable(false);
		textField_37.setColumns(10);
		textField_37.setBounds(152, 95, 96, 19);
		panel_2.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setEditable(false);
		textField_38.setColumns(10);
		textField_38.setBounds(152, 72, 96, 19);
		panel_2.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setBounds(152, 49, 38, 19);
		panel_2.add(textField_39);
		textField_39.setColumns(10);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Izena:");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_2.setBounds(345, 75, 132, 13);
		panel_2.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Abizena:");
		lblNewLabel_3_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_2.setBounds(345, 98, 132, 13);
		panel_2.add(lblNewLabel_3_1_2);
		
		JLabel lblNewLabel_4_1_2 = new JLabel("Jaiotze data:");
		lblNewLabel_4_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_2.setBounds(345, 121, 132, 13);
		panel_2.add(lblNewLabel_4_1_2);
		
		JLabel lblNewLabel_6_1_1 = new JLabel("Herria:");
		lblNewLabel_6_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_6_1_1.setBounds(345, 144, 132, 13);
		panel_2.add(lblNewLabel_6_1_1);
		
		JLabel lblNewLabel_7_1_2 = new JLabel("Helbidea:");
		lblNewLabel_7_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7_1_2.setBounds(345, 167, 132, 13);
		panel_2.add(lblNewLabel_7_1_2);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("Korreoa:");
		lblNewLabel_8_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8_1_2.setBounds(345, 190, 132, 13);
		panel_2.add(lblNewLabel_8_1_2);
		
		JLabel lblNewLabel_9_1_2 = new JLabel("Telefonoa:");
		lblNewLabel_9_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9_1_2.setBounds(345, 213, 132, 13);
		panel_2.add(lblNewLabel_9_1_2);
		
		JLabel lblNewLabel_10_1_2 = new JLabel("Erabiltzailea:");
		lblNewLabel_10_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_2.setBounds(345, 236, 132, 13);
		panel_2.add(lblNewLabel_10_1_2);
		
		JLabel lblNewLabel_11_1_2 = new JLabel("Pasahitza:");
		lblNewLabel_11_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_2.setBounds(345, 259, 132, 13);
		panel_2.add(lblNewLabel_11_1_2);
		
		JLabel lblNewLabel_12_1_2 = new JLabel("Kontu korrontea:");
		lblNewLabel_12_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12_1_2.setBounds(345, 282, 132, 13);
		panel_2.add(lblNewLabel_12_1_2);
		
		textField_40 = new JTextField();
		textField_40.setColumns(10);
		textField_40.setBounds(487, 279, 96, 19);
		panel_2.add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(487, 256, 96, 19);
		panel_2.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(487, 233, 96, 19);
		panel_2.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(487, 210, 65, 19);
		panel_2.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(487, 187, 96, 19);
		panel_2.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(487, 164, 96, 19);
		panel_2.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(487, 141, 96, 19);
		panel_2.add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(487, 118, 38, 19);
		panel_2.add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(535, 118, 27, 19);
		panel_2.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(572, 118, 27, 19);
		panel_2.add(textField_49);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(487, 95, 96, 19);
		panel_2.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(487, 72, 96, 19);
		panel_2.add(textField_51);
		
		JButton btnNewButton_2 = new JButton("Bilatu");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                // IDa lortu
                int id = Integer.parseInt(textField_39.getText());
                // Produktuaren datuak bilatu
                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
                    String query = "SELECT * FROM bezeroak WHERE id = ?";
                    try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                        preparedStatement.setInt(1, id);
                        try (ResultSet resultSet = preparedStatement.executeQuery()) {
                            if (resultSet.next()) {
                                // Emaitzak erakutsi
                                textField_38.setText(resultSet.getString("izena"));
                                textField_51.setText(resultSet.getString("izena"));
                                textField_37.setText(resultSet.getString("abizena"));
                                textField_50.setText(resultSet.getString("abizena"));
                                textField_34.setText(resultSet.getString("jaiotzeData"));
                                textField_47.setText(resultSet.getString("jaiotzeData"));
                                textField_33.setText(resultSet.getString("herria"));
                                textField_46.setText(resultSet.getString("herria"));
                                textField_32.setText(resultSet.getString("helbidea"));
                                textField_45.setText(resultSet.getString("helbidea"));
                                textField_31.setText(resultSet.getString("korreoa"));
                                textField_44.setText(resultSet.getString("korreoa"));
                                textField_30.setText(resultSet.getString("telefonoa"));
                                textField_43.setText(resultSet.getString("telefonoa"));
                                textField_29.setText(resultSet.getString("erabiltzailea"));
                                textField_42.setText(resultSet.getString("erabiltzailea"));
                                textField_28.setText(resultSet.getString("pasahitza"));
                                textField_41.setText(resultSet.getString("pasahitza"));
                                textField_25.setText(resultSet.getString("kontuKorrontea"));
                                textField_40.setText(resultSet.getString("kontuKorrontea"));
                                
                            }
                        }
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
		});
		btnNewButton_2.setBounds(200, 48, 76, 21);
		panel_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Gorde");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
			        String updateQuery = "UPDATE bezeroak SET izena = ?, abizena = ?, jaiotzeData = ?, herria = ?, helbidea = ?, korreoa = ?, telefonoa = ?, erabiltzailea = ?, pasahitza = ?, kontuKorrontea = ? WHERE id = ?";
			        try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
			            updateStatement.setString(1, textField_51.getText());
			            updateStatement.setString(2, textField_50.getText());
			            updateStatement.setString(3, textField_47.getText());
			            updateStatement.setString(4, textField_46.getText());
			            updateStatement.setString(5, textField_45.getText());
			            updateStatement.setString(6, textField_44.getText());
			            updateStatement.setString(7, textField_43.getText());
			            updateStatement.setString(8, textField_42.getText());
			            updateStatement.setString(9, textField_41.getText());
			            updateStatement.setString(10, textField_40.getText());
			            updateStatement.setString(11, textField_39.getText());
			            
			            
			            int affectedRows = updateStatement.executeUpdate();
			            if (affectedRows > 0) {
			                JOptionPane.showMessageDialog(null, "Bezeroaren datuak eguneratu dira.", "Verificación", JOptionPane.INFORMATION_MESSAGE);
			            } else {
			                JOptionPane.showMessageDialog(null, "Errorea bezeroaren datuak eguneratzean.", "Verificación", JOptionPane.ERROR_MESSAGE);
			            }
			        }
			    } catch (SQLException ex) {
			        JOptionPane.showMessageDialog(null, "Errorea bezeroaren datuak eguneratzean: " + ex.getMessage(), "Errorea", JOptionPane.ERROR_MESSAGE);
			        ex.printStackTrace();
			    }
			}
 
		});
		btnNewButton_3.setBounds(487, 48, 96, 21);
		panel_2.add(btnNewButton_3);
		
		JLabel lblNewLabel_2 = new JLabel("Momentuko datuak:");
		lblNewLabel_2.setBounds(10, 10, 118, 13);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Datu berriak:");
		lblNewLabel_1_1.setBounds(345, 10, 85, 13);
		panel_2.add(lblNewLabel_1_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Langileak", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Id-a:");
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1_1.setBounds(10, 37, 132, 13);
		panel_3.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Izena:");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setBounds(10, 84, 132, 13);
		panel_3.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Abizena:");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1.setBounds(10, 107, 132, 13);
		panel_3.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Jaiotze data:");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1.setBounds(10, 130, 132, 13);
		panel_3.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Helbidea:");
		lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7_1_1.setBounds(10, 156, 132, 13);
		panel_3.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Korreoa:");
		lblNewLabel_8_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8_1_1.setBounds(10, 179, 132, 13);
		panel_3.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Telefonoa:");
		lblNewLabel_9_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9_1_1.setBounds(10, 202, 132, 13);
		panel_3.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("Erabiltzailea:");
		lblNewLabel_10_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_1.setBounds(10, 225, 132, 13);
		panel_3.add(lblNewLabel_10_1_1);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Pasahitza:");
		lblNewLabel_11_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1.setBounds(10, 248, 132, 13);
		panel_3.add(lblNewLabel_11_1_1);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("Kontu korrontea:");
		lblNewLabel_12_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12_1_1.setBounds(10, 271, 132, 13);
		panel_3.add(lblNewLabel_12_1_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(152, 268, 96, 19);
		panel_3.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(152, 245, 96, 19);
		panel_3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(152, 222, 96, 19);
		panel_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(152, 199, 65, 19);
		panel_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(152, 176, 96, 19);
		panel_3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(152, 153, 96, 19);
		panel_3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setEditable(false);
		textField_6.setColumns(10);
		textField_6.setBounds(152, 127, 38, 19);
		panel_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setColumns(10);
		textField_7.setBounds(200, 127, 27, 19);
		panel_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setEditable(false);
		textField_8.setColumns(10);
		textField_8.setBounds(237, 127, 27, 19);
		panel_3.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBounds(152, 104, 96, 19);
		panel_3.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setEditable(false);
		textField_10.setColumns(10);
		textField_10.setBounds(152, 81, 96, 19);
		panel_3.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(152, 34, 27, 19);
		panel_3.add(textField_11);
		
		JLabel lblNewLabel_25 = new JLabel("NAN:");
		lblNewLabel_25.setBounds(10, 61, 45, 13);
		panel_3.add(lblNewLabel_25);
		
		textField_12 = new JTextField();
		textField_12.setEditable(false);
		textField_12.setColumns(10);
		textField_12.setBounds(152, 58, 96, 19);
		panel_3.add(textField_12);
		
		JLabel lblNewLabel_26 = new JLabel("Lan postua:");
		lblNewLabel_26.setBounds(10, 294, 132, 13);
		panel_3.add(lblNewLabel_26);
		
		textField_13 = new JTextField();
		textField_13.setEditable(false);
		textField_13.setColumns(10);
		textField_13.setBounds(152, 291, 96, 19);
		panel_3.add(textField_13);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Izena:");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1.setBounds(434, 87, 132, 13);
		panel_3.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Abizena:");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1_1.setBounds(434, 110, 132, 13);
		panel_3.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Jaiotze data:");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1.setBounds(434, 133, 132, 13);
		panel_3.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("Helbidea:");
		lblNewLabel_7_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7_1_1_1.setBounds(434, 159, 132, 13);
		panel_3.add(lblNewLabel_7_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("Korreoa:");
		lblNewLabel_8_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8_1_1_1.setBounds(434, 182, 132, 13);
		panel_3.add(lblNewLabel_8_1_1_1);
		
		JLabel lblNewLabel_9_1_1_1 = new JLabel("Telefonoa:");
		lblNewLabel_9_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9_1_1_1.setBounds(434, 205, 132, 13);
		panel_3.add(lblNewLabel_9_1_1_1);
		
		JLabel lblNewLabel_10_1_1_1 = new JLabel("Erabiltzailea:");
		lblNewLabel_10_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_1_1.setBounds(434, 228, 132, 13);
		panel_3.add(lblNewLabel_10_1_1_1);
		
		JLabel lblNewLabel_11_1_1_1 = new JLabel("Pasahitza:");
		lblNewLabel_11_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1_1.setBounds(434, 251, 132, 13);
		panel_3.add(lblNewLabel_11_1_1_1);
		
		JLabel lblNewLabel_12_1_1_1 = new JLabel("Kontu korrontea:");
		lblNewLabel_12_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12_1_1_1.setBounds(434, 274, 132, 13);
		panel_3.add(lblNewLabel_12_1_1_1);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(576, 271, 96, 19);
		panel_3.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(576, 248, 96, 19);
		panel_3.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(576, 225, 96, 19);
		panel_3.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(576, 202, 65, 19);
		panel_3.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(576, 179, 96, 19);
		panel_3.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(576, 156, 96, 19);
		panel_3.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(576, 130, 38, 19);
		panel_3.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(624, 130, 27, 19);
		panel_3.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(661, 130, 27, 19);
		panel_3.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(576, 107, 96, 19);
		panel_3.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(576, 84, 96, 19);
		panel_3.add(textField_24);
		
		JLabel lblNewLabel_25_1 = new JLabel("NAN:");
		lblNewLabel_25_1.setBounds(434, 64, 45, 13);
		panel_3.add(lblNewLabel_25_1);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(576, 61, 96, 19);
		panel_3.add(textField_26);
		
		JLabel lblNewLabel_26_1 = new JLabel("Lan postua:");
		lblNewLabel_26_1.setBounds(434, 297, 132, 13);
		panel_3.add(lblNewLabel_26_1);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(576, 294, 96, 19);
		panel_3.add(textField_27);
		
		JLabel lblNewLabel = new JLabel("Momentuko datuak:");
		lblNewLabel.setBounds(10, 10, 118, 13);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Datu berriak:");
		lblNewLabel_1.setBounds(434, 10, 85, 13);
		panel_3.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Bilatu");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
	                // IDa lortu
	                int id = Integer.parseInt(textField_11.getText());
	                // Produktuaren datuak bilatu
	                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
	                    String query = "SELECT * FROM langileak WHERE id = ?";
	                    try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	                        preparedStatement.setInt(1, id);
	                        try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                            if (resultSet.next()) {
	                                // Emaitzak erakutsi
	                            	textField_12.setText(resultSet.getString("nan"));
	                                textField_26.setText(resultSet.getString("nan"));
	                                textField_10.setText(resultSet.getString("izena"));
	                                textField_24.setText(resultSet.getString("izena"));
	                                textField_9.setText(resultSet.getString("abizena"));
	                                textField_23.setText(resultSet.getString("abizena"));
	                                textField_6.setText(resultSet.getString("jaiotzeData"));
	                                textField_20.setText(resultSet.getString("jaiotzeData"));
	                                textField_7.setText(resultSet.getString("herria"));
	                                textField_8.setText(resultSet.getString("herria"));
	                                textField_5.setText(resultSet.getString("helbidea"));
	                                textField_19.setText(resultSet.getString("helbidea"));
	                                textField_4.setText(resultSet.getString("korreoa"));
	                                textField_18.setText(resultSet.getString("korreoa"));
	                                textField_3.setText(resultSet.getString("telefonoa"));
	                                textField_17.setText(resultSet.getString("telefonoa"));
	                                textField_2.setText(resultSet.getString("erabiltzailea"));
	                                textField_16.setText(resultSet.getString("erabiltzailea"));
	                                textField_1.setText(resultSet.getString("pasahitza"));
	                                textField_15.setText(resultSet.getString("pasahitza"));
	                                textField.setText(resultSet.getString("kontuKorrontea"));
	                                textField_14.setText(resultSet.getString("kontuKorrontea"));
	                                textField_13.setText(resultSet.getString("lanPostua"));
	                                textField_27.setText(resultSet.getString("lanPostua"));
	                                
	                            }
	                        }
	                    }
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            }
			}
		});
		btnNewButton.setBounds(281, 33, 85, 21);
		panel_3.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Gorde");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
			        String updateQuery = "UPDATE langileak SET nan = ?, izena = ?, abizena = ?, jaiotzeData = ?, herria = ?, helbidea = ?, korreoa = ?, telefonoa = ?, erabiltzailea = ?, pasahitza = ?, kontuKorrontea = ?, lanPostua = ? WHERE id = ?";
			        try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
			            updateStatement.setString(1, textField_26.getText());
			            updateStatement.setString(2, textField_24.getText());
			            updateStatement.setString(3, textField_23.getText());
			            updateStatement.setString(4, textField_20.getText());
			            updateStatement.setString(5, textField_8.getText());
			            updateStatement.setString(6, textField_19.getText());
			            updateStatement.setString(7, textField_18.getText());
			            updateStatement.setString(8, textField_17.getText());
			            updateStatement.setString(9, textField_16.getText());
			            updateStatement.setString(10, textField_15.getText());
			            updateStatement.setString(11, textField_14.getText());
			            updateStatement.setString(12, textField_27.getText());
			            updateStatement.setString(13, textField_11.getText());
			            
			            int affectedRows = updateStatement.executeUpdate();
			            if (affectedRows > 0) {
			                JOptionPane.showMessageDialog(null, "Langileen datuak eguneratu dira.", "Verificación", JOptionPane.INFORMATION_MESSAGE);
			            } else {
			                JOptionPane.showMessageDialog(null, "Errorea langileen datuak eguneratzean.", "Verificación", JOptionPane.ERROR_MESSAGE);
			            }
			        }
			    } catch (SQLException ex) {
			        JOptionPane.showMessageDialog(null, "Errorea langileen datuak eguneratzean: " + ex.getMessage(), "Errorea", JOptionPane.ERROR_MESSAGE);
			        ex.printStackTrace();
			    }
			}
		});
		btnNewButton_1.setBounds(698, 33, 85, 21);
		panel_3.add(btnNewButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Produktuak", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Id-a:");
		lblNewLabel_5_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1_1_1.setBounds(10, 41, 132, 13);
		panel_1.add(lblNewLabel_5_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Izena:");
		lblNewLabel_2_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1.setBounds(10, 64, 132, 13);
		panel_1.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Kolorea:");
		lblNewLabel_3_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1_1_1.setBounds(10, 111, 132, 13);
		panel_1.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1 = new JLabel("Prezioa:");
		lblNewLabel_4_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1.setBounds(10, 134, 132, 13);
		panel_1.add(lblNewLabel_4_1_1_1_1);
		
		JLabel lblNewLabel_7_1_1_1_1 = new JLabel("Kopurua:");
		lblNewLabel_7_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7_1_1_1_1.setBounds(10, 160, 132, 13);
		panel_1.add(lblNewLabel_7_1_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1_1 = new JLabel("KopuruaXS");
		lblNewLabel_8_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8_1_1_1_1.setBounds(10, 183, 132, 13);
		panel_1.add(lblNewLabel_8_1_1_1_1);
		
		JLabel lblNewLabel_9_1_1_1_1 = new JLabel("KopuruaS:");
		lblNewLabel_9_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9_1_1_1_1.setBounds(10, 206, 132, 13);
		panel_1.add(lblNewLabel_9_1_1_1_1);
		
		JLabel lblNewLabel_10_1_1_1_1 = new JLabel("KopuruaM:");
		lblNewLabel_10_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_1_1_1.setBounds(10, 229, 132, 13);
		panel_1.add(lblNewLabel_10_1_1_1_1);
		
		JLabel lblNewLabel_11_1_1_1_1 = new JLabel("KopuruaL:");
		lblNewLabel_11_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1_1_1.setBounds(10, 252, 132, 13);
		panel_1.add(lblNewLabel_11_1_1_1_1);
		
		JLabel lblNewLabel_12_1_1_1_1 = new JLabel("KopuruaXL:");
		lblNewLabel_12_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12_1_1_1_1.setBounds(10, 275, 132, 13);
		panel_1.add(lblNewLabel_12_1_1_1_1);
		
		textField_52 = new JTextField();
		textField_52.setEditable(false);
		textField_52.setColumns(10);
		textField_52.setBounds(152, 272, 96, 19);
		panel_1.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setEditable(false);
		textField_53.setColumns(10);
		textField_53.setBounds(152, 249, 96, 19);
		panel_1.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setEditable(false);
		textField_54.setColumns(10);
		textField_54.setBounds(152, 226, 96, 19);
		panel_1.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setEditable(false);
		textField_55.setColumns(10);
		textField_55.setBounds(152, 203, 65, 19);
		panel_1.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setEditable(false);
		textField_56.setColumns(10);
		textField_56.setBounds(152, 180, 96, 19);
		panel_1.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setEditable(false);
		textField_57.setColumns(10);
		textField_57.setBounds(152, 157, 96, 19);
		panel_1.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setEditable(false);
		textField_58.setColumns(10);
		textField_58.setBounds(152, 131, 38, 19);
		panel_1.add(textField_58);
		
		textField_59 = new JTextField();
		textField_59.setEditable(false);
		textField_59.setColumns(10);
		textField_59.setBounds(152, 108, 96, 19);
		panel_1.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setEditable(false);
		textField_60.setColumns(10);
		textField_60.setBounds(152, 85, 96, 19);
		panel_1.add(textField_60);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(152, 38, 27, 19);
		panel_1.add(textField_61);
		
		JLabel lblNewLabel_25_1_1 = new JLabel("Kategoria:");
		lblNewLabel_25_1_1.setBounds(10, 87, 123, 13);
		panel_1.add(lblNewLabel_25_1_1);
		
		textField_62 = new JTextField();
		textField_62.setEditable(false);
		textField_62.setColumns(10);
		textField_62.setBounds(152, 62, 96, 19);
		panel_1.add(textField_62);
		
		JLabel lblNewLabel_3 = new JLabel("Momentuko datuak:");
		lblNewLabel_3.setBounds(10, 10, 118, 13);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Datu berriak:");
		lblNewLabel_1_2.setBounds(290, 10, 85, 13);
		panel_1.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Izena:");
		lblNewLabel_2_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1_1_1.setBounds(290, 67, 132, 13);
		panel_1.add(lblNewLabel_2_1_1_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1_1_1 = new JLabel("Kolorea:");
		lblNewLabel_3_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1_1_1_1.setBounds(290, 114, 132, 13);
		panel_1.add(lblNewLabel_3_1_1_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1_1_1 = new JLabel("Prezioa:");
		lblNewLabel_4_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1_1_1.setBounds(290, 137, 132, 13);
		panel_1.add(lblNewLabel_4_1_1_1_1_1);
		
		JLabel lblNewLabel_7_1_1_1_1_1 = new JLabel("Kopurua:");
		lblNewLabel_7_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7_1_1_1_1_1.setBounds(290, 163, 132, 13);
		panel_1.add(lblNewLabel_7_1_1_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1_1_1 = new JLabel("KopuruaXS");
		lblNewLabel_8_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8_1_1_1_1_1.setBounds(290, 186, 132, 13);
		panel_1.add(lblNewLabel_8_1_1_1_1_1);
		
		JLabel lblNewLabel_9_1_1_1_1_1 = new JLabel("KopuruaS:");
		lblNewLabel_9_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9_1_1_1_1_1.setBounds(290, 209, 132, 13);
		panel_1.add(lblNewLabel_9_1_1_1_1_1);
		
		JLabel lblNewLabel_10_1_1_1_1_1 = new JLabel("KopuruaM:");
		lblNewLabel_10_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_1_1_1_1.setBounds(290, 232, 132, 13);
		panel_1.add(lblNewLabel_10_1_1_1_1_1);
		
		JLabel lblNewLabel_11_1_1_1_1_1 = new JLabel("KopuruaL:");
		lblNewLabel_11_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1_1_1_1.setBounds(290, 255, 132, 13);
		panel_1.add(lblNewLabel_11_1_1_1_1_1);
		
		JLabel lblNewLabel_12_1_1_1_1_1 = new JLabel("KopuruaXL:");
		lblNewLabel_12_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12_1_1_1_1_1.setBounds(290, 278, 132, 13);
		panel_1.add(lblNewLabel_12_1_1_1_1_1);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(432, 275, 96, 19);
		panel_1.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(432, 252, 96, 19);
		panel_1.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(432, 229, 96, 19);
		panel_1.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(432, 206, 65, 19);
		panel_1.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(432, 183, 96, 19);
		panel_1.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(432, 160, 96, 19);
		panel_1.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(432, 134, 38, 19);
		panel_1.add(textField_69);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(432, 111, 96, 19);
		panel_1.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(432, 88, 96, 19);
		panel_1.add(textField_71);
		
		JLabel lblNewLabel_25_1_1_1 = new JLabel("Kategoria:");
		lblNewLabel_25_1_1_1.setBounds(290, 90, 123, 13);
		panel_1.add(lblNewLabel_25_1_1_1);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(432, 65, 96, 19);
		panel_1.add(textField_73);
		
		JButton btnNewButton_4 = new JButton("Bilatu");
		btnNewButton_4.setBounds(189, 37, 78, 21);
		panel_1.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
	                // IDa lortu
	                int id = Integer.parseInt(textField_61.getText());
	                // Produktuaren datuak bilatu
	                try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
	                    String query = "SELECT * FROM produktuak WHERE id = ?";
	                    try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
	                        preparedStatement.setInt(1, id);
	                        try (ResultSet resultSet = preparedStatement.executeQuery()) {
	                            if (resultSet.next()) {
	                                // Emaitzak erakutsi
	                         
	                                textField_62.setText(resultSet.getString("izena"));
	                                textField_73.setText(resultSet.getString("izena"));
	                                textField_60.setText(resultSet.getString("kategoria"));
	                                textField_71.setText(resultSet.getString("kategoria"));
	                                textField_59.setText(resultSet.getString("kolorea"));
	                                textField_70.setText(resultSet.getString("kolorea"));
	                                textField_58.setText(resultSet.getString("prezioa"));
	                                textField_69.setText(resultSet.getString("prezioa"));
	                                textField_57.setText(resultSet.getString("kopurua"));
	                                textField_68.setText(resultSet.getString("kopurua"));
	                                textField_56.setText(resultSet.getString("kopuruaxs"));
	                                textField_67.setText(resultSet.getString("kopuruaxs"));
	                                textField_55.setText(resultSet.getString("kopuruas"));
	                                textField_66.setText(resultSet.getString("kopuruas"));
	                                textField_54.setText(resultSet.getString("kopuruam"));
	                                textField_65.setText(resultSet.getString("kopuruam"));
	                                textField_53.setText(resultSet.getString("kopurual"));
	                                textField_64.setText(resultSet.getString("kopurual"));
	                                textField_52.setText(resultSet.getString("kopuruaxl"));
	                                textField_63.setText(resultSet.getString("kopuruaxl"));
	                            
	                                
	                            }
	                        }
	                    }
	                } catch (SQLException ex) {
	                    ex.printStackTrace();
	                }
	            }
			}
		});
		
		JButton btnNewButton_5 = new JButton("Gorde");
		btnNewButton_5.setBounds(432, 37, 96, 21);
		panel_1.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD)) {
			        String updateQuery = "UPDATE produktuak SET izena = ?, kategoria = ?, kolorea = ?, prezioa = ?, kopurua = ?, kopuruaxs = ?, kopuruas = ?, kopuruam = ?, kopurual = ?, kopuruaxl = ? WHERE id = ?";
			        try (PreparedStatement updateStatement = connection.prepareStatement(updateQuery)) {
			            updateStatement.setString(1, textField_73.getText());
			            updateStatement.setString(2, textField_71.getText());
			            updateStatement.setString(3, textField_70.getText());
			            updateStatement.setString(4, textField_69.getText());
			            updateStatement.setString(5, textField_68.getText());
			            updateStatement.setString(6, textField_67.getText());
			            updateStatement.setString(7, textField_66.getText());
			            updateStatement.setString(8, textField_65.getText());
			            updateStatement.setString(9, textField_64.getText());
			            updateStatement.setString(10, textField_63.getText());
			            updateStatement.setString(11, textField_61.getText());
			            
			            
			            int affectedRows = updateStatement.executeUpdate();
			            if (affectedRows > 0) {
			                JOptionPane.showMessageDialog(null, "Produktuen datuak eguneratu dira.", "Verificación", JOptionPane.INFORMATION_MESSAGE);
			            } else {
			                JOptionPane.showMessageDialog(null, "Errorea produktuen datuak eguneratzean.", "Verificación", JOptionPane.ERROR_MESSAGE);
			            }
			        }
			    } catch (SQLException ex) {
			        JOptionPane.showMessageDialog(null, "Errorea produktuen datuak eguneratzean: " + ex.getMessage(), "Errorea", JOptionPane.ERROR_MESSAGE);
			        ex.printStackTrace();
			    }
			}
		});
	}

	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
