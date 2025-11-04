package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class HelloApp {

	private JFrame frame;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloApp window = new HelloApp();
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
	public HelloApp() {
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
		lblNewLabel.setBounds(38, 42, 85, 40);
		frame.getContentPane().add(lblNewLabel);
		
		text = new JTextField();
		text.setFont(new Font("Tahoma", Font.PLAIN, 14));
		text.setBounds(123, 42, 109, 43);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
		JButton button = new JButton("Przywitaj");
		button.setBounds(38, 113, 194, 21);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String helloText = text.getText();
				JOptionPane.showMessageDialog(frame, "Witaj "+helloText);
				
			}
		});
		frame.getContentPane().add(button);
	}
}
