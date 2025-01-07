package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;

public class AplikacjaCwiczenia {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AplikacjaCwiczenia window = new AplikacjaCwiczenia();
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
	public AplikacjaCwiczenia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Podaj imię");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(22, 224, 166));
		lblNewLabel.setBounds(68, 48, 74, 13);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(165, 45, 96, 19);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox upperCase = new JCheckBox("Wielkie litery");
		upperCase.setBounds(309, 44, 121, 21);
		frame.getContentPane().add(upperCase);
		
		JButton btnNewButton = new JButton("Wykonaj");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(0, 255, 64));
		btnNewButton.setBounds(165, 125, 96, 21);
		btnNewButton.addActionListener(e->{
			String s = "Witaj "+ textField.getText();
			if(upperCase.isSelected()) {
				s = s.toUpperCase();
			}
			JOptionPane.showMessageDialog(frame, s);
			
		});
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Wyłącz");
		chckbxNewCheckBox.setBounds(309, 125, 93, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
	}
}
