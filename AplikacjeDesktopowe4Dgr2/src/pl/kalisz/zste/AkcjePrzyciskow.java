package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AkcjePrzyciskow {

	private JFrame frame;
	private JTextField nameText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AkcjePrzyciskow window = new AkcjePrzyciskow();
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
	public AkcjePrzyciskow() {
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
		
		JLabel lblNewLabel = new JLabel("Wpisz imię");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(71, 43, 90, 39);
		frame.getContentPane().add(lblNewLabel);
		
		nameText = new JTextField();
		nameText.setBounds(192, 43, 130, 39);
		frame.getContentPane().add(nameText);
		nameText.setColumns(10);
		
		JButton hello1 = new JButton("Przywitaj");
		hello1.setBounds(71, 139, 107, 39);
		hello1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = nameText.getText();
				JOptionPane.showMessageDialog(frame, "Witaj "+text);
				
			}
		});		
		frame.getContentPane().add(hello1);
		
		JButton hello2 = new JButton("PRZYWITAJ");
		
		hello2.addActionListener(e->{
			String upperCase = nameText.getText().toUpperCase();
			JOptionPane.showMessageDialog(frame, "WITAJ "+upperCase);
		});
		
		hello2.setForeground(new Color(255, 255, 255));
		hello2.setBackground(new Color(0, 0, 160));
		hello2.setBounds(203, 139, 119, 39);
		frame.getContentPane().add(hello2);
	}
}
