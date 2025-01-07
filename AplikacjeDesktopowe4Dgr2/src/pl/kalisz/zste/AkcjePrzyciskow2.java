package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

public class AkcjePrzyciskow2 implements ActionListener{

	private JFrame frame;
	private JTextField nameText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AkcjePrzyciskow2 window = new AkcjePrzyciskow2();
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
	public AkcjePrzyciskow2() {
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
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel.setBounds(65, 51, 98, 42);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button1 = new JButton("Przywitaj");
		button1.setActionCommand("normal");
		button1.setForeground(new Color(255, 255, 255));
		button1.setBackground(new Color(31, 45, 76));
		button1.setBounds(65, 153, 117, 28);
		button1.addActionListener(this);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("PRZYWITAJ");
		button2.setActionCommand("upper");
		button2.setBackground(new Color(255, 255, 128));
		button2.setBounds(192, 153, 111, 28);
		button2.addActionListener(this);
		frame.getContentPane().add(button2);
		
		nameText = new JTextField();
		nameText.setBounds(192, 50, 111, 34);
		frame.getContentPane().add(nameText);
		nameText.setColumns(10);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		String text = nameText.getText();
		switch(actionCommand) {
		case "normal":
			text = "Witaj "+text;
			break;
		case "upper":
			text = "WITAJ "+text.toUpperCase();
			break;
		}
		JOptionPane.showMessageDialog(frame, text);
		
		
	}

}
