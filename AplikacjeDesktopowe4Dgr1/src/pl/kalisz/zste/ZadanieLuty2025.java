package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class ZadanieLuty2025 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZadanieLuty2025 window = new ZadanieLuty2025();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ZadanieLuty2025() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(50, 244, 236));
		frame.setBounds(100, 100, 479, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tytuł");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(39, 38, 97, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Autor");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(39, 74, 97, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Wydawnictwo");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(39, 110, 97, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(177, 37, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(177, 73, 96, 19);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(177, 109, 96, 19);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(228, 241, 18), 3), "Edycja p\u00F3l wprowadzanych", TitledBorder.CENTER, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(50, 244, 236));
		panel.setBounds(39, 149, 234, 104);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Tytuł");
		chckbxNewCheckBox.setBackground(new Color(50, 244, 236));
		chckbxNewCheckBox.setBounds(30, 20, 93, 21);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Autor");
		chckbxNewCheckBox_1.setBackground(new Color(50, 244, 236));
		chckbxNewCheckBox_1.setBounds(30, 43, 93, 21);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Wydawnictwo");
		chckbxNewCheckBox_2.setBackground(new Color(50, 244, 236));
		chckbxNewCheckBox_2.setBounds(30, 66, 127, 21);
		panel.add(chckbxNewCheckBox_2);
		
		JButton btnNewButton = new JButton("AKCJA");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(50, 244, 236));
		btnNewButton.setBackground(new Color(228, 241, 18));
		btnNewButton.setBounds(306, 217, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}
}
