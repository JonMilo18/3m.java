package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class AltakAdmin extends JFrame {

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
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_17;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_30;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AltakAdmin frame = new AltakAdmin();
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
	public AltakAdmin() {
		setTitle("3M| AltakADM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 75, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 786, 463);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 600, 300);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Bezeroak", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Izena:");
		lblNewLabel.setBounds(20, 31, 45, 13);
		panel_1.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(106, 28, 107, 19);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Abizena:");
		lblNewLabel_1.setBounds(20, 60, 55, 13);
		panel_1.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(106, 57, 107, 19);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Jaiotze-data:");
		lblNewLabel_2.setBounds(20, 89, 83, 13);
		panel_1.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(106, 86, 34, 19);
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(150, 86, 27, 19);
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(190, 86, 27, 19);
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Helbidea:");
		lblNewLabel_3.setBounds(20, 147, 83, 13);
		panel_1.add(lblNewLabel_3);
		
		textField_5 = new JTextField();
		textField_5.setBounds(106, 115, 107, 19);
		panel_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Herria:");
		lblNewLabel_4.setBounds(20, 118, 45, 13);
		panel_1.add(lblNewLabel_4);
		
		textField_6 = new JTextField();
		textField_6.setBounds(106, 144, 107, 19);
		panel_1.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Korreoa:");
		lblNewLabel_5.setBounds(259, 31, 83, 13);
		panel_1.add(lblNewLabel_5);
		
		textField_7 = new JTextField();
		textField_7.setBounds(377, 28, 156, 19);
		panel_1.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Telefonoa:");
		lblNewLabel_6.setBounds(259, 60, 83, 13);
		panel_1.add(lblNewLabel_6);
		
		textField_8 = new JTextField();
		textField_8.setBounds(377, 57, 72, 19);
		panel_1.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(377, 86, 156, 19);
		panel_1.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Erabiltailea:");
		lblNewLabel_7.setBounds(259, 89, 83, 13);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Pasahitza:");
		lblNewLabel_8.setBounds(259, 118, 83, 13);
		panel_1.add(lblNewLabel_8);
		
		textField_10 = new JTextField();
		textField_10.setBounds(377, 115, 156, 19);
		panel_1.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Kontu korrontea:");
		lblNewLabel_9.setBounds(259, 147, 121, 13);
		panel_1.add(lblNewLabel_9);
		
		textField_11 = new JTextField();
		textField_11.setBounds(377, 144, 156, 19);
		panel_1.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton = new JButton("Alta eman");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Connection conexion = null;
			    PreparedStatement preparedStatement = null;
 
			    try {
			        // Establecer la conexión
			        conexion = DriverManager.getConnection(URL, USER, PASSWORD);
 
			        // Crear la consulta SQL con un PreparedStatement para evitar inyecciones SQL
			        String sql = "INSERT INTO Bezeroak (izena, abizena, helbidea, korreoa, telefonoa, kontuKorrontea, erabiltzailea, pasahitza, jaiotzeData, lanPostua) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			        
			        preparedStatement = conexion.prepareStatement(sql);
			        
			        // Establecer los parámetros de la consulta
			        preparedStatement.setString(1, textField.getText());
			        preparedStatement.setString(2, textField_1.getText());
			        preparedStatement.setString(3, textField_2.getText());
			        preparedStatement.setString(4, textField_5.getText());
			        preparedStatement.setString(5, textField_6.getText());
			        preparedStatement.setString(6, textField_7.getText());
			        preparedStatement.setString(7, textField_8.getText());
			        preparedStatement.setString(8, textField_9.getText());
			        preparedStatement.setString(9, textField_10.getText());
			        preparedStatement.setString(10, textField_11.getText());
 
			        // Ejecutar la consulta SQL
			        int rowsAffected = preparedStatement.executeUpdate();
			        
			        if (rowsAffected > 0) {
			            JOptionPane.showMessageDialog(null, "DATUAK GORDE DIRA.", "Verificación", JOptionPane.INFORMATION_MESSAGE);
			        }
 
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    } finally {
			        // Cerrar la conexión y el preparedStatement en el bloque finally
			        try {
			            if (preparedStatement != null) {
			                preparedStatement.close();
			            }
			            if (conexion != null) {
			                conexion.close();
			            }
			        } catch (SQLException ex) {
			            ex.printStackTrace();
			        }
			    }
			}
		});
		btnNewButton.setBounds(20, 210, 93, 21);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Garbitu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField_5.setText("");
				textField_6.setText("");
				textField_7.setText("");
				textField_8.setText("");
				textField_9.setText("");
				textField_10.setText("");
				textField_11.setText("");
			}
		});
		btnNewButton_1.setBounds(257, 210, 85, 21);
		panel_1.add(btnNewButton_1);
		
		JLabel lblNewLabel_32 = new JLabel("Urtea");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.PLAIN, 7));
		lblNewLabel_32.setBounds(106, 75, 37, 13);
		panel_1.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("Hillabetea");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.PLAIN, 7));
		lblNewLabel_33.setBounds(150, 74, 45, 13);
		panel_1.add(lblNewLabel_33);
		
		JLabel lblNewLabel_34 = new JLabel("Eguna");
		lblNewLabel_34.setFont(new Font("Tahoma", Font.PLAIN, 7));
		lblNewLabel_34.setBounds(190, 74, 45, 13);
		panel_1.add(lblNewLabel_34);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Langileak", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Izena:");
		lblNewLabel_10.setBounds(20, 60, 45, 13);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("NAN:");
		lblNewLabel_11.setBounds(20, 31, 45, 13);
		panel_2.add(lblNewLabel_11);
		
		textField_12 = new JTextField();
		textField_12.setBounds(106, 26, 96, 19);
		panel_2.add(textField_12);
		textField_12.setColumns(10);
		
		textField_13 = new JTextField();
		textField_13.setBounds(106, 57, 96, 19);
		panel_2.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Abizena:");
		lblNewLabel_12.setBounds(20, 89, 55, 13);
		panel_2.add(lblNewLabel_12);
		
		textField_14 = new JTextField();
		textField_14.setBounds(106, 86, 96, 19);
		panel_2.add(textField_14);
		textField_14.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Herria:");
		lblNewLabel_13.setBounds(20, 118, 45, 13);
		panel_2.add(lblNewLabel_13);
		
		textField_15 = new JTextField();
		textField_15.setBounds(106, 115, 96, 19);
		panel_2.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Helbidea:");
		lblNewLabel_14.setBounds(20, 147, 55, 13);
		panel_2.add(lblNewLabel_14);
		
		textField_16 = new JTextField();
		textField_16.setBounds(106, 144, 125, 19);
		panel_2.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Korreoa:");
		lblNewLabel_15.setBounds(259, 31, 81, 13);
		panel_2.add(lblNewLabel_15);
		
		textField_18 = new JTextField();
		textField_18.setBounds(377, 25, 125, 19);
		panel_2.add(textField_18);
		textField_18.setColumns(10);
		
		JLabel lblNewLabel_16 = new JLabel("Telefonoa:");
		lblNewLabel_16.setBounds(259, 60, 71, 13);
		panel_2.add(lblNewLabel_16);
		
		textField_19 = new JTextField();
		textField_19.setBounds(377, 57, 81, 19);
		panel_2.add(textField_19);
		textField_19.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Kontu korrontea:");
		lblNewLabel_26.setBounds(20, 176, 81, 13);
		panel_2.add(lblNewLabel_26);
		
		textField_17 = new JTextField();
		textField_17.setBounds(106, 173, 96, 19);
		panel_2.add(textField_17);
		textField_17.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Erabiltzailea:");
		lblNewLabel_27.setBounds(259, 89, 81, 13);
		panel_2.add(lblNewLabel_27);
		
		textField_20 = new JTextField();
		textField_20.setBounds(377, 83, 96, 19);
		panel_2.add(textField_20);
		textField_20.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Pasahitza:");
		lblNewLabel_28.setBounds(259, 118, 81, 13);
		panel_2.add(lblNewLabel_28);
		
		textField_21 = new JTextField();
		textField_21.setBounds(377, 112, 96, 19);
		panel_2.add(textField_21);
		textField_21.setColumns(10);
		
		JLabel lblNewLabel_29 = new JLabel("Jaiotze data:");
		lblNewLabel_29.setBounds(259, 147, 81, 13);
		panel_2.add(lblNewLabel_29);
		
		textField_22 = new JTextField();
		textField_22.setHorizontalAlignment(SwingConstants.CENTER);
		textField_22.setColumns(10);
		textField_22.setBounds(377, 144, 37, 19);
		panel_2.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setHorizontalAlignment(SwingConstants.CENTER);
		textField_23.setColumns(10);
		textField_23.setBounds(421, 144, 27, 19);
		panel_2.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setHorizontalAlignment(SwingConstants.CENTER);
		textField_24.setColumns(10);
		textField_24.setBounds(461, 144, 27, 19);
		panel_2.add(textField_24);
		
		JLabel lblNewLabel_30 = new JLabel("Lan postua:");
		lblNewLabel_30.setBounds(259, 176, 81, 13);
		panel_2.add(lblNewLabel_30);
		
		textField_25 = new JTextField();
		textField_25.setBounds(377, 170, 96, 19);
		panel_2.add(textField_25);
		textField_25.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Alta eman");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Connection conexion = null;
			    PreparedStatement preparedStatement = null;
	 
			    try {
			        // Establecer la conexión
			        conexion = DriverManager.getConnection(URL, USER, PASSWORD);
	 
			        // Crear la consulta SQL con un PreparedStatement para evitar inyecciones SQL
			        String sql = "INSERT INTO langileak (nan, izena, abizena, herria, helbidea, kontuKorrontea, korreoa, telefonoa, erabiltzailea, pasahitza, jaiotzeData, lanPostua) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			        
			        preparedStatement = conexion.prepareStatement(sql);
			        
			        // Establecer los parámetros de la consulta
			        preparedStatement.setString(1, textField_12.getText());//nan
			        preparedStatement.setString(2, textField_13.getText());//izena
			        preparedStatement.setString(3, textField_14.getText());//abizena
			        preparedStatement.setString(4, textField_15.getText());//herria
			        preparedStatement.setString(5, textField_16.getText());//helbidea
			        preparedStatement.setString(6, textField_17.getText());//kontu korrontea
			        preparedStatement.setString(7, textField_18.getText());//korreoa
			        preparedStatement.setString(8, textField_19.getText());//telefonoa
			        preparedStatement.setString(9, textField_20.getText());//erabiltzailea
			        preparedStatement.setString(10, textField_21.getText());//pasahitza
			        preparedStatement.setString(11, textField_22.getText() + "-" + textField_23.getText() + "-" + textField_24.getText());//jaiotze data
			        preparedStatement.setString(12, textField_25.getText());//lan postua
	 
			        // Ejecutar la consulta SQL
			        int rowsAffected = preparedStatement.executeUpdate();
			        
			        if (rowsAffected > 0) {
			            JOptionPane.showMessageDialog(null, "DATUAK GORDE DIRA.", "Verificación", JOptionPane.INFORMATION_MESSAGE);
			        }
	 
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    } finally {
			        // Cerrar la conexión y el preparedStatement en el bloque finally
			        try {
			            if (preparedStatement != null) {
			                preparedStatement.close();
			            }
			            if (conexion != null) {
			                conexion.close();
			            }
			        } catch (SQLException ex) {
			            ex.printStackTrace();
			        }
			    }
			}
		});
		btnNewButton_4.setBounds(20, 210, 93, 21);
		panel_2.add(btnNewButton_4);
		
		JButton btnNewButton_1_1 = new JButton("Garbitu");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_12.setText("");
				textField_13.setText("");
				textField_14.setText("");
				textField_15.setText("");
				textField_16.setText("");
				textField_17.setText("");
				textField_18.setText("");
				textField_19.setText("");
				textField_20.setText("");
				textField_21.setText("");
				textField_22.setText("");
				textField_23.setText("");
				textField_24.setText("");
				textField_25.setText("");
			}
		});
		btnNewButton_1_1.setBounds(257, 210, 85, 21);
		panel_2.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_32_1 = new JLabel("Urtea");
		lblNewLabel_32_1.setFont(new Font("Tahoma", Font.PLAIN, 7));
		lblNewLabel_32_1.setBounds(377, 131, 37, 13);
		panel_2.add(lblNewLabel_32_1);
		
		JLabel lblNewLabel_33_1 = new JLabel("Hillabetea");
		lblNewLabel_33_1.setFont(new Font("Tahoma", Font.PLAIN, 7));
		lblNewLabel_33_1.setBounds(421, 130, 45, 13);
		panel_2.add(lblNewLabel_33_1);
		
		JLabel lblNewLabel_34_1 = new JLabel("Eguna");
		lblNewLabel_34_1.setFont(new Font("Tahoma", Font.PLAIN, 7));
		lblNewLabel_34_1.setBounds(461, 130, 45, 13);
		panel_2.add(lblNewLabel_34_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Produktuak", null, panel_3, null);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_17 = new JLabel("Izena:");
		lblNewLabel_17.setBounds(20, 31, 60, 13);
		panel_3.add(lblNewLabel_17);
		
		textField_26 = new JTextField();
		textField_26.setBounds(106, 28, 107, 19);
		panel_3.add(textField_26);
		textField_26.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Kategoria:");
		lblNewLabel_18.setBounds(20, 60, 60, 13);
		panel_3.add(lblNewLabel_18);
		
		textField_27 = new JTextField();
		textField_27.setBounds(106, 57, 107, 19);
		panel_3.add(textField_27);
		textField_27.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Kolorea:");
		lblNewLabel_19.setBounds(20, 89, 60, 13);
		panel_3.add(lblNewLabel_19);
		
		textField_28 = new JTextField();
		textField_28.setBounds(106, 86, 107, 19);
		panel_3.add(textField_28);
		textField_28.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Prezioa:");
		lblNewLabel_20.setBounds(20, 118, 60, 13);
		panel_3.add(lblNewLabel_20);
		
		textField_29 = new JTextField();
		textField_29.setBounds(106, 115, 41, 19);
		panel_3.add(textField_29);
		textField_29.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Kopurua:");
		lblNewLabel_21.setBounds(266, 31, 60, 13);
		panel_3.add(lblNewLabel_21);
		
		textField_31 = new JTextField();
		textField_31.setBounds(331, 28, 41, 19);
		panel_3.add(textField_31);
		textField_31.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("XS");
		lblNewLabel_22.setBounds(266, 60, 20, 13);
		panel_3.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("S");
		lblNewLabel_23.setBounds(266, 89, 20, 13);
		panel_3.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("M");
		lblNewLabel_24.setBounds(266, 118, 20, 13);
		panel_3.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("L");
		lblNewLabel_25.setBounds(266, 147, 20, 13);
		panel_3.add(lblNewLabel_25);
		
		textField_32 = new JTextField();
		textField_32.setBounds(331, 57, 41, 19);
		panel_3.add(textField_32);
		textField_32.setColumns(10);
		
		textField_33 = new JTextField();
		textField_33.setBounds(331, 86, 41, 19);
		panel_3.add(textField_33);
		textField_33.setColumns(10);
		
		textField_34 = new JTextField();
		textField_34.setBounds(331, 115, 41, 19);
		panel_3.add(textField_34);
		textField_34.setColumns(10);
		
		textField_35 = new JTextField();
		textField_35.setBounds(331, 144, 41, 19);
		panel_3.add(textField_35);
		textField_35.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 255, 255));
		panel_4.setBounds(235, 10, 207, 172);
		panel_3.add(panel_4);
		
		JButton btnNewButton_2 = new JButton("Alta eman");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			    Connection conexion = null;
			    PreparedStatement preparedStatement = null;
	 
			    try {
			        // Establecer la conexión
			        conexion = DriverManager.getConnection(URL, USER, PASSWORD);
	 
			        // Crear la consulta SQL con un PreparedStatement para evitar inyecciones SQL
			        String sql = "INSERT INTO langileak (nan, izena, abizena, herria, helbidea, kontuKorrontea, korreoa, telefonoa, erabiltzailea, pasahitza, jaiotzeData, lanPostua) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			        
			        preparedStatement = conexion.prepareStatement(sql);
			        
			        // Establecer los parámetros de la consulta
			        preparedStatement.setString(1, textField_12.getText());//nan
			        preparedStatement.setString(2, textField_13.getText());//izena
			        preparedStatement.setString(3, textField_14.getText());//abizena
			        preparedStatement.setString(4, textField_15.getText());//herria
			        preparedStatement.setString(5, textField_16.getText());//helbidea
			        preparedStatement.setString(6, textField_17.getText());//kontu korrontea
			        preparedStatement.setString(7, textField_18.getText());//korreoa
			        preparedStatement.setString(8, textField_19.getText());//telefonoa
			        preparedStatement.setString(9, textField_20.getText());//erabiltzailea
			        preparedStatement.setString(10, textField_21.getText());//pasahitza
			        preparedStatement.setString(11, textField_22.getText() + "-" + textField_23.getText() + "-" + textField_24.getText());//jaiotze data
			        preparedStatement.setString(12, textField_25.getText());//lan postua
	 
			        // Ejecutar la consulta SQL
			        int rowsAffected = preparedStatement.executeUpdate();
			        
			        if (rowsAffected > 0) {
			            JOptionPane.showMessageDialog(null, "DATUAK GORDE DIRA.", "Verificación", JOptionPane.INFORMATION_MESSAGE);
			        }
	 
			    } catch (SQLException ex) {
			        ex.printStackTrace();
			    } finally {
			        // Cerrar la conexión y el preparedStatement en el bloque finally
			        try {
			            if (preparedStatement != null) {
			                preparedStatement.close();
			            }
			            if (conexion != null) {
			                conexion.close();
			            }
			        } catch (SQLException ex) {
			            ex.printStackTrace();
			        }
			    }
			}
		});
		btnNewButton_2.setBounds(20, 210, 93, 21);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Garbitu");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField_26.setText("");
				textField_27.setText("");
				textField_28.setText("");
				textField_29.setText("");
				textField_30.setText("");
				textField_31.setText("");
				textField_32.setText("");
				textField_33.setText("");
				textField_34.setText("");
				textField_35.setText("");
			}
		});
		btnNewButton_3.setBounds(257, 210, 85, 21);
		panel_3.add(btnNewButton_3);
		
		JLabel lblNewLabel_31 = new JLabel("Irudia:");
		lblNewLabel_31.setBounds(20, 147, 45, 13);
		panel_3.add(lblNewLabel_31);
		
		textField_30 = new JTextField();
		textField_30.setBounds(106, 144, 65, 19);
		panel_3.add(textField_30);
		textField_30.setColumns(10);
	}
}
