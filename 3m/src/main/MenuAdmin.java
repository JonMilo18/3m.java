package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MenuAdmin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuAdmin frame = new MenuAdmin();
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
	public MenuAdmin() {
		setTitle("3M| MenuADM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 75, 1214, 675);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Altak");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AltakAdmin oforma = new AltakAdmin();
                oforma.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton.setBounds(0, 328, 413, 310);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Bajak");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BajakAdmin oforma = new BajakAdmin();
                oforma.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(412, 328, 413, 310);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Aldaketak");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AldaketakAdmin oforma = new AldaketakAdmin();
                oforma.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(821, 328, 379, 310);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Langileen \r\negin \r\nbeharrekoak");
		btnNewButton_3.setToolTipText("\r\n");
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_3.setBounds(0, 0, 610, 326);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Kontsultak");
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KontsultakAdmin oforma = new KontsultakAdmin();
                oforma.setVisible(true);
			}
		});
		btnNewButton_4.setBounds(605, 0, 595, 326);
		contentPane.add(btnNewButton_4);
	}
}
