package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.CardLayout;
import java.awt.FlowLayout;

public class KontsultakAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
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
	private JTextField textField_25;
	private JTable table;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField txtAbizenarenTartekoIzkiak;
	private JTextField textField_32;
	private JTextField textField_31;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_45;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_40;
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
	private JTable table_1;
	private JTextField textField_70;
	private JTextField textField_71;
	private JTextField textField_72;
	private JTextField textField_73;
	private JTextField textField_74;
	private JTextField textField_75;
	private JTextField textField_76;
	private JTextField textField_79;
	private JTextField textField_80;
	private JTextField textField_81;
	private JTextField textField_82;
	private JTextField textField_77;
	private JTextField textField_83;
	private JTextField textField_85;
	private JTextField textField_91;
	private JTextField textField_96;
	private JTextField textField_97;
	private JTextField textField_98;
	private JTextField textField_103;
	private JTextField textField_78;
	private JTextField textField_84;
	private JTextField textField_86;
	private JTextField textField_87;
	private JTextField textField_88;
	private JTextField textField_89;
	private JTextField textField_90;
	private JTextField textField_92;
	private JTextField textField_93;
	private JTextField textField_94;
	private JTextField textField_95;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KontsultakAdmin frame = new KontsultakAdmin();
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
	public KontsultakAdmin() {
		setTitle("3M| KontsultakADM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 75, 1350, 675);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1336, 650);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 1326, 640);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Bezeroak", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ikusiko diren zutabeak:");
		lblNewLabel.setBounds(10, 10, 147, 13);
		panel_2.add(lblNewLabel);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Id-a");
		chckbxNewCheckBox.setBounds(10, 29, 123, 21);
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Izena");
		chckbxNewCheckBox_1.setBounds(10, 52, 123, 21);
		panel_2.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Abizena");
		chckbxNewCheckBox_2.setBounds(10, 75, 123, 21);
		panel_2.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Jaiotze-data");
		chckbxNewCheckBox_3.setBounds(10, 98, 123, 21);
		panel_2.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Herria");
		chckbxNewCheckBox_4.setBounds(10, 121, 123, 21);
		panel_2.add(chckbxNewCheckBox_4);
		
		JCheckBox chckbxNewCheckBox_5 = new JCheckBox("Helbidea");
		chckbxNewCheckBox_5.setBounds(10, 144, 123, 21);
		panel_2.add(chckbxNewCheckBox_5);
		
		JCheckBox chckbxNewCheckBox_6 = new JCheckBox("Korreoa");
		chckbxNewCheckBox_6.setBounds(10, 167, 123, 21);
		panel_2.add(chckbxNewCheckBox_6);
		
		JCheckBox chckbxNewCheckBox_7 = new JCheckBox("Telefonoa");
		chckbxNewCheckBox_7.setBounds(10, 190, 123, 21);
		panel_2.add(chckbxNewCheckBox_7);
		
		JCheckBox chckbxNewCheckBox_8 = new JCheckBox("Erabiltzailea");
		chckbxNewCheckBox_8.setBounds(10, 213, 123, 21);
		panel_2.add(chckbxNewCheckBox_8);
		
		JCheckBox chckbxNewCheckBox_9 = new JCheckBox("Pasahitza");
		chckbxNewCheckBox_9.setBounds(10, 236, 123, 21);
		panel_2.add(chckbxNewCheckBox_9);
		
		JCheckBox chckbxNewCheckBox_10 = new JCheckBox("Kontu korrontea");
		chckbxNewCheckBox_10.setBounds(10, 259, 123, 21);
		panel_2.add(chckbxNewCheckBox_10);
		
		JLabel lblNewLabel_1 = new JLabel("Kontsulta sinpleak:");
		lblNewLabel_1.setBounds(10, 300, 163, 13);
		panel_2.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Izena:");
		lblNewLabel_2.setBounds(288, 57, 132, 13);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(430, 53, 65, 19);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(textField, popupMenu);
		
		JLabel lblNewLabel_16 = new JLabel("Izenaren hasiera");
		popupMenu.add(lblNewLabel_16);
		
		textField_1 = new JTextField();
		textField_1.setBounds(430, 77, 65, 19);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JPopupMenu popupMenu_3 = new JPopupMenu();
		addPopup(textField_1, popupMenu_3);
		
		JLabel lblNewLabel_21 = new JLabel("Abizenaren hasiera");
		popupMenu_3.add(lblNewLabel_21);
		
		JLabel lblNewLabel_3 = new JLabel("Abizena:");
		lblNewLabel_3.setBounds(288, 80, 132, 13);
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Jaiotze data:");
		lblNewLabel_4.setBounds(288, 103, 132, 13);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.setBounds(462, 100, 33, 19);
		panel_2.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(430, 123, 65, 19);
		panel_2.add(textField_3);
		textField_3.setColumns(10);
		
		JPopupMenu popupMenu_6 = new JPopupMenu();
		addPopup(textField_3, popupMenu_6);
		
		JLabel lblNewLabel_24 = new JLabel("Herriaren izenaren hasiera");
		popupMenu_6.add(lblNewLabel_24);
		
		textField_4 = new JTextField();
		textField_4.setBounds(430, 146, 96, 19);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(430, 169, 96, 19);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(430, 192, 65, 19);
		panel_2.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(430, 215, 96, 19);
		panel_2.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(430, 238, 96, 19);
		panel_2.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(430, 261, 96, 19);
		panel_2.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setBounds(430, 30, 27, 19);
		panel_2.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Id-a:");
		lblNewLabel_5.setBounds(288, 34, 132, 13);
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Herria:");
		lblNewLabel_6.setBounds(288, 126, 132, 13);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Helbidea:");
		lblNewLabel_7.setBounds(288, 149, 132, 13);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Korreoa:");
		lblNewLabel_8.setBounds(288, 172, 132, 13);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Telefonoa:");
		lblNewLabel_9.setBounds(288, 195, 132, 13);
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Erabiltzailea:");
		lblNewLabel_10.setBounds(288, 218, 132, 13);
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Pasahitza:");
		lblNewLabel_11.setBounds(288, 241, 132, 13);
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Kontu korrontea:");
		lblNewLabel_12.setBounds(288, 264, 132, 13);
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.RIGHT);
		panel_2.add(lblNewLabel_12);
		
		textField_11 = new JTextField();
		textField_11.setBounds(507, 100, 19, 19);
		panel_2.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		textField_12.setBounds(536, 100, 19, 19);
		panel_2.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Kontsulta konplexuak:");
		lblNewLabel_13.setBounds(412, 11, 147, 13);
		panel_2.add(lblNewLabel_13);
		
		JLabel lblNewLabel_5_1 = new JLabel("Id-a:");
		lblNewLabel_5_1.setBounds(10, 323, 132, 13);
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Izena:");
		lblNewLabel_2_1.setBounds(10, 346, 132, 13);
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Abizena:");
		lblNewLabel_3_1.setBounds(10, 369, 132, 13);
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("Jaiotze data:");
		lblNewLabel_4_1.setBounds(10, 392, 132, 13);
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_6_1 = new JLabel("Herria:");
		lblNewLabel_6_1.setBounds(10, 415, 132, 13);
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("Helbidea:");
		lblNewLabel_7_1.setBounds(10, 438, 132, 13);
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_7_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("Korreoa:");
		lblNewLabel_8_1.setBounds(10, 461, 132, 13);
		lblNewLabel_8_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_9_1 = new JLabel("Telefonoa:");
		lblNewLabel_9_1.setBounds(10, 484, 132, 13);
		lblNewLabel_9_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_9_1);
		
		JLabel lblNewLabel_10_1 = new JLabel("Erabiltzailea:");
		lblNewLabel_10_1.setBounds(10, 507, 132, 13);
		lblNewLabel_10_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_10_1);
		
		JLabel lblNewLabel_11_1 = new JLabel("Pasahitza:");
		lblNewLabel_11_1.setBounds(10, 530, 132, 13);
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_12_1 = new JLabel("Kontu korrontea:");
		lblNewLabel_12_1.setBounds(10, 553, 132, 13);
		lblNewLabel_12_1.setHorizontalAlignment(SwingConstants.LEFT);
		panel_2.add(lblNewLabel_12_1);
		
		textField_13 = new JTextField();
		textField_13.setBounds(152, 550, 96, 19);
		textField_13.setColumns(10);
		panel_2.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setBounds(152, 527, 96, 19);
		textField_14.setColumns(10);
		panel_2.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setBounds(152, 504, 96, 19);
		textField_15.setColumns(10);
		panel_2.add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setBounds(152, 481, 65, 19);
		textField_16.setColumns(10);
		panel_2.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setBounds(152, 458, 96, 19);
		textField_17.setColumns(10);
		panel_2.add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setBounds(152, 435, 96, 19);
		textField_18.setColumns(10);
		panel_2.add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setBounds(152, 412, 96, 19);
		textField_19.setColumns(10);
		panel_2.add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setBounds(152, 389, 38, 19);
		textField_20.setColumns(10);
		panel_2.add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setBounds(200, 389, 27, 19);
		textField_21.setColumns(10);
		panel_2.add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setBounds(237, 389, 27, 19);
		textField_22.setColumns(10);
		panel_2.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setBounds(152, 366, 96, 19);
		textField_23.setColumns(10);
		panel_2.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setBounds(152, 343, 96, 19);
		textField_24.setColumns(10);
		panel_2.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setBounds(152, 320, 27, 19);
		textField_25.setColumns(10);
		panel_2.add(textField_25);
		
		table = new JTable();
		table.setBounds(750, 20, 550, 580);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.add(table);
		
		JLabel lblNewLabel_14 = new JLabel("Min");
		lblNewLabel_14.setBounds(429, 102, 28, 13);
		panel_2.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("Max");
		lblNewLabel_15.setBounds(565, 102, 27, 13);
		panel_2.add(lblNewLabel_15);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(650, 100, 27, 19);
		panel_2.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(687, 100, 27, 19);
		panel_2.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(602, 100, 38, 19);
		panel_2.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setBounds(511, 53, 65, 19);
		panel_2.add(textField_29);
		textField_29.setColumns(10);
		
		JPopupMenu popupMenu_1 = new JPopupMenu();
		addPopup(textField_29, popupMenu_1);
		
		JLabel lblNewLabel_17 = new JLabel("Tarteko izkiak");
		popupMenu_1.add(lblNewLabel_17);
		
		textField_30 = new JTextField();
		textField_30.setBounds(586, 53, 65, 19);
		panel_2.add(textField_30);
		textField_30.setColumns(10);
		
		JPopupMenu popupMenu_2 = new JPopupMenu();
		addPopup(textField_30, popupMenu_2);
		
		JLabel lblNewLabel_18 = new JLabel("Izenaren bukaera");
		popupMenu_2.add(lblNewLabel_18);
		
		txtAbizenarenTartekoIzkiak = new JTextField();
		txtAbizenarenTartekoIzkiak.setBounds(511, 76, 65, 19);
		panel_2.add(txtAbizenarenTartekoIzkiak);
		txtAbizenarenTartekoIzkiak.setColumns(10);
		
		JPopupMenu popupMenu_4 = new JPopupMenu();
		addPopup(txtAbizenarenTartekoIzkiak, popupMenu_4);
		
		JLabel lblNewLabel_20 = new JLabel("Abizenaren tarteko hizkiak");
		popupMenu_4.add(lblNewLabel_20);
		
		textField_32 = new JTextField();
		textField_32.setBounds(585, 76, 66, 19);
		panel_2.add(textField_32);
		textField_32.setColumns(10);
		
		JPopupMenu popupMenu_5 = new JPopupMenu();
		addPopup(textField_32, popupMenu_5);
		
		JLabel lblNewLabel_19 = new JLabel("Abizenaren bukaera");
		popupMenu_5.add(lblNewLabel_19);
		
		textField_31 = new JTextField();
		textField_31.setBounds(511, 122, 65, 19);
		panel_2.add(textField_31);
		textField_31.setColumns(10);
		
		JPopupMenu popupMenu_7 = new JPopupMenu();
		addPopup(textField_31, popupMenu_7);
		
		JLabel lblNewLabel_23 = new JLabel("Herriaren izenaren tarteko hizkiak");
		popupMenu_7.add(lblNewLabel_23);
		
		textField_33 = new JTextField();
		textField_33.setBounds(585, 122, 66, 19);
		panel_2.add(textField_33);
		textField_33.setColumns(10);
		
		JPopupMenu popupMenu_8 = new JPopupMenu();
		addPopup(textField_33, popupMenu_8);
		
		JLabel lblNewLabel_22 = new JLabel("Herriaren izenaren amaierako hizkiak");
		popupMenu_8.add(lblNewLabel_22);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Langileak", null, panel_3, null);
		panel_3.setLayout(null);
		
		JCheckBox chckbxNewCheckBox_11 = new JCheckBox("Id");
		chckbxNewCheckBox_11.setBounds(10, 29, 123, 21);
		panel_3.add(chckbxNewCheckBox_11);
		
		JCheckBox chckbxNewCheckBox_12 = new JCheckBox("NAN");
		chckbxNewCheckBox_12.setBounds(10, 52, 123, 21);
		panel_3.add(chckbxNewCheckBox_12);
		
		JCheckBox chckbxNewCheckBox_12_1 = new JCheckBox("Izena");
		chckbxNewCheckBox_12_1.setBounds(10, 75, 123, 21);
		panel_3.add(chckbxNewCheckBox_12_1);
		
		JCheckBox chckbxNewCheckBox_12_2 = new JCheckBox("Abizena");
		chckbxNewCheckBox_12_2.setBounds(10, 98, 123, 21);
		panel_3.add(chckbxNewCheckBox_12_2);
		
		JCheckBox chckbxNewCheckBox_12_3 = new JCheckBox("Helbidea");
		chckbxNewCheckBox_12_3.setBounds(10, 121, 123, 21);
		panel_3.add(chckbxNewCheckBox_12_3);
		
		JCheckBox chckbxNewCheckBox_12_4 = new JCheckBox("Korreoa");
		chckbxNewCheckBox_12_4.setBounds(10, 144, 123, 21);
		panel_3.add(chckbxNewCheckBox_12_4);
		
		JCheckBox chckbxNewCheckBox_12_5 = new JCheckBox("Telefonoa");
		chckbxNewCheckBox_12_5.setBounds(10, 167, 123, 21);
		panel_3.add(chckbxNewCheckBox_12_5);
		
		JCheckBox chckbxNewCheckBox_13 = new JCheckBox("Kontu korrontea");
		chckbxNewCheckBox_13.setBounds(10, 190, 123, 21);
		panel_3.add(chckbxNewCheckBox_13);
		
		JCheckBox chckbxNewCheckBox_13_1 = new JCheckBox("Erabiltzailea");
		chckbxNewCheckBox_13_1.setBounds(10, 214, 123, 21);
		panel_3.add(chckbxNewCheckBox_13_1);
		
		JCheckBox chckbxNewCheckBox_13_2 = new JCheckBox("Pasahitza");
		chckbxNewCheckBox_13_2.setBounds(10, 237, 123, 21);
		panel_3.add(chckbxNewCheckBox_13_2);
		
		JCheckBox chckbxNewCheckBox_13_3 = new JCheckBox("Jaiotze data");
		chckbxNewCheckBox_13_3.setBounds(10, 260, 123, 21);
		panel_3.add(chckbxNewCheckBox_13_3);
		
		JCheckBox chckbxNewCheckBox_13_4 = new JCheckBox("Lan postua");
		chckbxNewCheckBox_13_4.setBounds(10, 283, 123, 21);
		panel_3.add(chckbxNewCheckBox_13_4);
		
		JLabel lblNewLabel_1_1 = new JLabel("Kontsulta sinpleak:");
		lblNewLabel_1_1.setBounds(10, 310, 163, 13);
		panel_3.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("Id-a:");
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1_1.setBounds(10, 333, 132, 13);
		panel_3.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Izena:");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1.setBounds(10, 380, 132, 13);
		panel_3.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Abizena:");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1.setBounds(10, 403, 132, 13);
		panel_3.add(lblNewLabel_3_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("Jaiotze data:");
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1.setBounds(10, 426, 132, 13);
		panel_3.add(lblNewLabel_4_1_1);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Helbidea:");
		lblNewLabel_7_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7_1_1.setBounds(10, 452, 132, 13);
		panel_3.add(lblNewLabel_7_1_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Korreoa:");
		lblNewLabel_8_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8_1_1.setBounds(10, 475, 132, 13);
		panel_3.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_9_1_1 = new JLabel("Telefonoa:");
		lblNewLabel_9_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9_1_1.setBounds(10, 498, 132, 13);
		panel_3.add(lblNewLabel_9_1_1);
		
		JLabel lblNewLabel_10_1_1 = new JLabel("Erabiltzailea:");
		lblNewLabel_10_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_1.setBounds(10, 521, 132, 13);
		panel_3.add(lblNewLabel_10_1_1);
		
		JLabel lblNewLabel_11_1_1 = new JLabel("Pasahitza:");
		lblNewLabel_11_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1.setBounds(10, 544, 132, 13);
		panel_3.add(lblNewLabel_11_1_1);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("Kontu korrontea:");
		lblNewLabel_12_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12_1_1.setBounds(10, 567, 132, 13);
		panel_3.add(lblNewLabel_12_1_1);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(152, 564, 96, 19);
		panel_3.add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(152, 541, 96, 19);
		panel_3.add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(152, 518, 96, 19);
		panel_3.add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(152, 495, 65, 19);
		panel_3.add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(152, 472, 96, 19);
		panel_3.add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(152, 449, 96, 19);
		panel_3.add(textField_39);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(152, 423, 38, 19);
		panel_3.add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(200, 423, 27, 19);
		panel_3.add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(237, 423, 27, 19);
		panel_3.add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(152, 400, 96, 19);
		panel_3.add(textField_44);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(152, 377, 96, 19);
		panel_3.add(textField_45);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(152, 330, 27, 19);
		panel_3.add(textField_46);
		
		JLabel lblNewLabel_25 = new JLabel("NAN:");
		lblNewLabel_25.setBounds(10, 357, 45, 13);
		panel_3.add(lblNewLabel_25);
		
		textField_47 = new JTextField();
		textField_47.setBounds(152, 354, 96, 19);
		panel_3.add(textField_47);
		textField_47.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Lan postua:");
		lblNewLabel_26.setBounds(10, 590, 132, 13);
		panel_3.add(lblNewLabel_26);
		
		textField_40 = new JTextField();
		textField_40.setBounds(152, 587, 96, 19);
		panel_3.add(textField_40);
		textField_40.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Ikusiko diren zutabeak:");
		lblNewLabel_27.setBounds(10, 10, 147, 13);
		panel_3.add(lblNewLabel_27);
		
		JLabel lblNewLabel_2_2 = new JLabel("Izena:");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2.setBounds(300, 56, 132, 13);
		panel_3.add(lblNewLabel_2_2);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(442, 52, 65, 19);
		panel_3.add(textField_48);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(442, 76, 65, 19);
		panel_3.add(textField_49);
		
		JLabel lblNewLabel_3_2 = new JLabel("Abizena:");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3_2.setBounds(300, 79, 132, 13);
		panel_3.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_4_2 = new JLabel("Jaiotze data:");
		lblNewLabel_4_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_2.setBounds(300, 102, 132, 13);
		panel_3.add(lblNewLabel_4_2);
		
		textField_50 = new JTextField();
		textField_50.setColumns(10);
		textField_50.setBounds(474, 99, 33, 19);
		panel_3.add(textField_50);
		
		textField_51 = new JTextField();
		textField_51.setColumns(10);
		textField_51.setBounds(442, 122, 65, 19);
		panel_3.add(textField_51);
		
		textField_52 = new JTextField();
		textField_52.setColumns(10);
		textField_52.setBounds(442, 145, 96, 19);
		panel_3.add(textField_52);
		
		textField_53 = new JTextField();
		textField_53.setColumns(10);
		textField_53.setBounds(442, 168, 96, 19);
		panel_3.add(textField_53);
		
		textField_54 = new JTextField();
		textField_54.setColumns(10);
		textField_54.setBounds(442, 191, 65, 19);
		panel_3.add(textField_54);
		
		textField_55 = new JTextField();
		textField_55.setColumns(10);
		textField_55.setBounds(442, 214, 96, 19);
		panel_3.add(textField_55);
		
		textField_56 = new JTextField();
		textField_56.setColumns(10);
		textField_56.setBounds(442, 237, 96, 19);
		panel_3.add(textField_56);
		
		textField_57 = new JTextField();
		textField_57.setColumns(10);
		textField_57.setBounds(442, 260, 96, 19);
		panel_3.add(textField_57);
		
		textField_58 = new JTextField();
		textField_58.setColumns(10);
		textField_58.setBounds(442, 29, 27, 19);
		panel_3.add(textField_58);
		
		JLabel lblNewLabel_5_2 = new JLabel("Id-a:");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_2.setBounds(300, 33, 132, 13);
		panel_3.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_6_2 = new JLabel("Herria:");
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_6_2.setBounds(300, 125, 132, 13);
		panel_3.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_7_2 = new JLabel("Helbidea:");
		lblNewLabel_7_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7_2.setBounds(300, 148, 132, 13);
		panel_3.add(lblNewLabel_7_2);
		
		JLabel lblNewLabel_8_2 = new JLabel("Korreoa:");
		lblNewLabel_8_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8_2.setBounds(300, 171, 132, 13);
		panel_3.add(lblNewLabel_8_2);
		
		JLabel lblNewLabel_9_2 = new JLabel("Telefonoa:");
		lblNewLabel_9_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9_2.setBounds(300, 194, 132, 13);
		panel_3.add(lblNewLabel_9_2);
		
		JLabel lblNewLabel_10_2 = new JLabel("Erabiltzailea:");
		lblNewLabel_10_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10_2.setBounds(300, 217, 132, 13);
		panel_3.add(lblNewLabel_10_2);
		
		JLabel lblNewLabel_11_2 = new JLabel("Pasahitza:");
		lblNewLabel_11_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_2.setBounds(300, 240, 132, 13);
		panel_3.add(lblNewLabel_11_2);
		
		JLabel lblNewLabel_12_2 = new JLabel("Kontu korrontea:");
		lblNewLabel_12_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_12_2.setBounds(300, 263, 132, 13);
		panel_3.add(lblNewLabel_12_2);
		
		textField_59 = new JTextField();
		textField_59.setColumns(10);
		textField_59.setBounds(519, 99, 19, 19);
		panel_3.add(textField_59);
		
		textField_60 = new JTextField();
		textField_60.setColumns(10);
		textField_60.setBounds(548, 99, 19, 19);
		panel_3.add(textField_60);
		
		JLabel lblNewLabel_13_1 = new JLabel("Kontsulta konplexuak:");
		lblNewLabel_13_1.setBounds(424, 10, 147, 13);
		panel_3.add(lblNewLabel_13_1);
		
		JLabel lblNewLabel_14_1 = new JLabel("Min");
		lblNewLabel_14_1.setBounds(441, 101, 28, 13);
		panel_3.add(lblNewLabel_14_1);
		
		JLabel lblNewLabel_15_1 = new JLabel("Max");
		lblNewLabel_15_1.setBounds(577, 101, 27, 13);
		panel_3.add(lblNewLabel_15_1);
		
		textField_61 = new JTextField();
		textField_61.setColumns(10);
		textField_61.setBounds(662, 99, 27, 19);
		panel_3.add(textField_61);
		
		textField_62 = new JTextField();
		textField_62.setColumns(10);
		textField_62.setBounds(699, 99, 27, 19);
		panel_3.add(textField_62);
		
		textField_63 = new JTextField();
		textField_63.setColumns(10);
		textField_63.setBounds(614, 99, 38, 19);
		panel_3.add(textField_63);
		
		textField_64 = new JTextField();
		textField_64.setColumns(10);
		textField_64.setBounds(523, 52, 65, 19);
		panel_3.add(textField_64);
		
		textField_65 = new JTextField();
		textField_65.setColumns(10);
		textField_65.setBounds(598, 52, 65, 19);
		panel_3.add(textField_65);
		
		textField_66 = new JTextField();
		textField_66.setColumns(10);
		textField_66.setBounds(523, 75, 65, 19);
		panel_3.add(textField_66);
		
		textField_67 = new JTextField();
		textField_67.setColumns(10);
		textField_67.setBounds(597, 75, 66, 19);
		panel_3.add(textField_67);
		
		textField_68 = new JTextField();
		textField_68.setColumns(10);
		textField_68.setBounds(523, 121, 65, 19);
		panel_3.add(textField_68);
		
		textField_69 = new JTextField();
		textField_69.setColumns(10);
		textField_69.setBounds(597, 121, 66, 19);
		panel_3.add(textField_69);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBounds(750, 20, 550, 580);
		panel_3.add(table_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		tabbedPane.addTab("Produktuak", null, panel_1, null);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox_11_1 = new JCheckBox("Id");
		chckbxNewCheckBox_11_1.setBounds(10, 29, 123, 21);
		panel_1.add(chckbxNewCheckBox_11_1);
		
		JCheckBox chckbxNewCheckBox_12_6 = new JCheckBox("Kategoria");
		chckbxNewCheckBox_12_6.setBounds(10, 75, 123, 21);
		panel_1.add(chckbxNewCheckBox_12_6);
		
		JCheckBox chckbxNewCheckBox_12_1_1 = new JCheckBox("Izena");
		chckbxNewCheckBox_12_1_1.setBounds(10, 52, 123, 21);
		panel_1.add(chckbxNewCheckBox_12_1_1);
		
		JCheckBox chckbxNewCheckBox_12_2_1 = new JCheckBox("Kolorea");
		chckbxNewCheckBox_12_2_1.setBounds(10, 98, 123, 21);
		panel_1.add(chckbxNewCheckBox_12_2_1);
		
		JCheckBox chckbxNewCheckBox_12_3_1 = new JCheckBox("Prezioa");
		chckbxNewCheckBox_12_3_1.setBounds(10, 121, 123, 21);
		panel_1.add(chckbxNewCheckBox_12_3_1);
		
		JCheckBox chckbxNewCheckBox_12_4_1 = new JCheckBox("Kopurua");
		chckbxNewCheckBox_12_4_1.setBounds(10, 144, 123, 21);
		panel_1.add(chckbxNewCheckBox_12_4_1);
		
		JCheckBox chckbxNewCheckBox_12_5_1 = new JCheckBox("Kopurua XS");
		chckbxNewCheckBox_12_5_1.setBounds(10, 167, 123, 21);
		panel_1.add(chckbxNewCheckBox_12_5_1);
		
		JCheckBox chckbxNewCheckBox_13_5 = new JCheckBox("Kopurua S");
		chckbxNewCheckBox_13_5.setBounds(10, 190, 123, 21);
		panel_1.add(chckbxNewCheckBox_13_5);
		
		JCheckBox chckbxNewCheckBox_13_1_1 = new JCheckBox("Kopurua M");
		chckbxNewCheckBox_13_1_1.setBounds(10, 214, 123, 21);
		panel_1.add(chckbxNewCheckBox_13_1_1);
		
		JCheckBox chckbxNewCheckBox_13_2_1 = new JCheckBox("Kopurua L");
		chckbxNewCheckBox_13_2_1.setBounds(10, 237, 123, 21);
		panel_1.add(chckbxNewCheckBox_13_2_1);
		
		JCheckBox chckbxNewCheckBox_13_3_1 = new JCheckBox("Kopurua XL");
		chckbxNewCheckBox_13_3_1.setBounds(10, 260, 123, 21);
		panel_1.add(chckbxNewCheckBox_13_3_1);
		
		JLabel lblNewLabel_27_1 = new JLabel("Ikusiko diren zutabeak:");
		lblNewLabel_27_1.setBounds(10, 10, 147, 13);
		panel_1.add(lblNewLabel_27_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Kontsulta sinpleak:");
		lblNewLabel_1_1_1.setBounds(10, 287, 163, 13);
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_5_1_1_1 = new JLabel("Id-a:");
		lblNewLabel_5_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_5_1_1_1.setBounds(10, 310, 132, 13);
		panel_1.add(lblNewLabel_5_1_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Izena:");
		lblNewLabel_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1_1_1.setBounds(10, 333, 132, 13);
		panel_1.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Kolorea:");
		lblNewLabel_3_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1_1_1.setBounds(10, 380, 132, 13);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		JLabel lblNewLabel_4_1_1_1 = new JLabel("Prezioa:");
		lblNewLabel_4_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_4_1_1_1.setBounds(10, 403, 132, 13);
		panel_1.add(lblNewLabel_4_1_1_1);
		
		JLabel lblNewLabel_7_1_1_1 = new JLabel("Kopurua:");
		lblNewLabel_7_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_7_1_1_1.setBounds(10, 429, 132, 13);
		panel_1.add(lblNewLabel_7_1_1_1);
		
		JLabel lblNewLabel_8_1_1_1 = new JLabel("KopuruaXS");
		lblNewLabel_8_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_8_1_1_1.setBounds(10, 452, 132, 13);
		panel_1.add(lblNewLabel_8_1_1_1);
		
		JLabel lblNewLabel_9_1_1_1 = new JLabel("KopuruaS:");
		lblNewLabel_9_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_9_1_1_1.setBounds(10, 475, 132, 13);
		panel_1.add(lblNewLabel_9_1_1_1);
		
		JLabel lblNewLabel_10_1_1_1 = new JLabel("KopuruaM:");
		lblNewLabel_10_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_10_1_1_1.setBounds(10, 498, 132, 13);
		panel_1.add(lblNewLabel_10_1_1_1);
		
		JLabel lblNewLabel_11_1_1_1 = new JLabel("KopuruaL:");
		lblNewLabel_11_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_11_1_1_1.setBounds(10, 521, 132, 13);
		panel_1.add(lblNewLabel_11_1_1_1);
		
		JLabel lblNewLabel_12_1_1_1 = new JLabel("KopuruaXL:");
		lblNewLabel_12_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12_1_1_1.setBounds(10, 544, 132, 13);
		panel_1.add(lblNewLabel_12_1_1_1);
		
		textField_70 = new JTextField();
		textField_70.setColumns(10);
		textField_70.setBounds(152, 541, 96, 19);
		panel_1.add(textField_70);
		
		textField_71 = new JTextField();
		textField_71.setColumns(10);
		textField_71.setBounds(152, 518, 96, 19);
		panel_1.add(textField_71);
		
		textField_72 = new JTextField();
		textField_72.setColumns(10);
		textField_72.setBounds(152, 495, 96, 19);
		panel_1.add(textField_72);
		
		textField_73 = new JTextField();
		textField_73.setColumns(10);
		textField_73.setBounds(152, 472, 65, 19);
		panel_1.add(textField_73);
		
		textField_74 = new JTextField();
		textField_74.setColumns(10);
		textField_74.setBounds(152, 449, 96, 19);
		panel_1.add(textField_74);
		
		textField_75 = new JTextField();
		textField_75.setColumns(10);
		textField_75.setBounds(152, 426, 96, 19);
		panel_1.add(textField_75);
		
		textField_76 = new JTextField();
		textField_76.setColumns(10);
		textField_76.setBounds(152, 400, 38, 19);
		panel_1.add(textField_76);
		
		textField_79 = new JTextField();
		textField_79.setColumns(10);
		textField_79.setBounds(152, 377, 96, 19);
		panel_1.add(textField_79);
		
		textField_80 = new JTextField();
		textField_80.setColumns(10);
		textField_80.setBounds(152, 354, 96, 19);
		panel_1.add(textField_80);
		
		textField_81 = new JTextField();
		textField_81.setColumns(10);
		textField_81.setBounds(152, 307, 27, 19);
		panel_1.add(textField_81);
		
		JLabel lblNewLabel_25_1 = new JLabel("Kategoria:");
		lblNewLabel_25_1.setBounds(10, 360, 123, 13);
		panel_1.add(lblNewLabel_25_1);
		
		textField_82 = new JTextField();
		textField_82.setColumns(10);
		textField_82.setBounds(152, 331, 96, 19);
		panel_1.add(textField_82);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Izena:");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_2_1.setBounds(309, 56, 132, 13);
		panel_1.add(lblNewLabel_2_2_1);
		
		textField_77 = new JTextField();
		textField_77.setColumns(10);
		textField_77.setBounds(451, 52, 65, 19);
		panel_1.add(textField_77);
		
		JLabel lblNewLabel_4_2_1 = new JLabel("Prezioa:");
		lblNewLabel_4_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_4_2_1.setBounds(309, 78, 132, 13);
		panel_1.add(lblNewLabel_4_2_1);
		
		textField_83 = new JTextField();
		textField_83.setColumns(10);
		textField_83.setBounds(483, 75, 33, 19);
		panel_1.add(textField_83);
		
		textField_85 = new JTextField();
		textField_85.setColumns(10);
		textField_85.setBounds(451, 98, 27, 19);
		panel_1.add(textField_85);
		
		textField_91 = new JTextField();
		textField_91.setColumns(10);
		textField_91.setBounds(451, 29, 27, 19);
		panel_1.add(textField_91);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("Id-a:");
		lblNewLabel_5_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_5_2_1.setBounds(309, 33, 132, 13);
		panel_1.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_7_2_1 = new JLabel("Kopurua:");
		lblNewLabel_7_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_7_2_1.setBounds(309, 101, 132, 13);
		panel_1.add(lblNewLabel_7_2_1);
		
		JLabel lblNewLabel_8_2_1 = new JLabel("Kopurua XS: ");
		lblNewLabel_8_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_8_2_1.setBounds(309, 124, 132, 13);
		panel_1.add(lblNewLabel_8_2_1);
		
		JLabel lblNewLabel_9_2_1 = new JLabel("Kopurua S:");
		lblNewLabel_9_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_9_2_1.setBounds(309, 147, 132, 13);
		panel_1.add(lblNewLabel_9_2_1);
		
		JLabel lblNewLabel_10_2_1 = new JLabel("Kopurua M:");
		lblNewLabel_10_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_10_2_1.setBounds(309, 170, 132, 13);
		panel_1.add(lblNewLabel_10_2_1);
		
		JLabel lblNewLabel_11_2_1 = new JLabel("Kopurua L:");
		lblNewLabel_11_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_11_2_1.setBounds(309, 193, 132, 13);
		panel_1.add(lblNewLabel_11_2_1);
		
		JLabel lblNewLabel_12_2_1 = new JLabel("Kopurua XL:");
		lblNewLabel_12_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_12_2_1.setBounds(309, 216, 132, 13);
		panel_1.add(lblNewLabel_12_2_1);
		
		JLabel lblNewLabel_13_1_1 = new JLabel("Kontsulta konplexuak:");
		lblNewLabel_13_1_1.setBounds(433, 10, 147, 13);
		panel_1.add(lblNewLabel_13_1_1);
		
		JLabel lblNewLabel_14_1_1 = new JLabel("Min");
		lblNewLabel_14_1_1.setBounds(450, 77, 28, 13);
		panel_1.add(lblNewLabel_14_1_1);
		
		JLabel lblNewLabel_15_1_1 = new JLabel("Max");
		lblNewLabel_15_1_1.setBounds(526, 78, 27, 13);
		panel_1.add(lblNewLabel_15_1_1);
		
		textField_96 = new JTextField();
		textField_96.setColumns(10);
		textField_96.setBounds(563, 75, 33, 19);
		panel_1.add(textField_96);
		
		textField_97 = new JTextField();
		textField_97.setColumns(10);
		textField_97.setBounds(532, 52, 65, 19);
		panel_1.add(textField_97);
		
		textField_98 = new JTextField();
		textField_98.setColumns(10);
		textField_98.setBounds(607, 52, 65, 19);
		panel_1.add(textField_98);
		
		textField_103 = new JTextField();
		textField_103.setBounds(483, 29, 27, 19);
		panel_1.add(textField_103);
		textField_103.setColumns(10);
		
		textField_78 = new JTextField();
		textField_78.setColumns(10);
		textField_78.setBounds(483, 98, 27, 19);
		panel_1.add(textField_78);
		
		textField_84 = new JTextField();
		textField_84.setColumns(10);
		textField_84.setBounds(451, 121, 27, 19);
		panel_1.add(textField_84);
		
		textField_86 = new JTextField();
		textField_86.setColumns(10);
		textField_86.setBounds(483, 121, 27, 19);
		panel_1.add(textField_86);
		
		textField_87 = new JTextField();
		textField_87.setColumns(10);
		textField_87.setBounds(451, 144, 27, 19);
		panel_1.add(textField_87);
		
		textField_88 = new JTextField();
		textField_88.setColumns(10);
		textField_88.setBounds(483, 144, 27, 19);
		panel_1.add(textField_88);
		
		textField_89 = new JTextField();
		textField_89.setColumns(10);
		textField_89.setBounds(451, 167, 27, 19);
		panel_1.add(textField_89);
		
		textField_90 = new JTextField();
		textField_90.setColumns(10);
		textField_90.setBounds(483, 167, 27, 19);
		panel_1.add(textField_90);
		
		textField_92 = new JTextField();
		textField_92.setColumns(10);
		textField_92.setBounds(451, 190, 27, 19);
		panel_1.add(textField_92);
		
		textField_93 = new JTextField();
		textField_93.setColumns(10);
		textField_93.setBounds(483, 190, 27, 19);
		panel_1.add(textField_93);
		
		textField_94 = new JTextField();
		textField_94.setColumns(10);
		textField_94.setBounds(451, 214, 27, 19);
		panel_1.add(textField_94);
		
		textField_95 = new JTextField();
		textField_95.setColumns(10);
		textField_95.setBounds(483, 214, 27, 19);
		panel_1.add(textField_95);
		
		table_2 = new JTable();
		table_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_2.setBounds(750, 20, 550, 580);
		panel_1.add(table_2);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
