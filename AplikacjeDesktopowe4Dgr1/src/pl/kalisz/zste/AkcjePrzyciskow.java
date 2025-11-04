package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class AkcjePrzyciskow {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=333,294
	 */
	private final JLabel label = new JLabel("New label");
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
		lblNewLabel.setForeground(new Color(255, 128, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(61, 37, 99, 35);
		frame.getContentPane().add(lblNewLabel);
		
		nameText = new JTextField();
		nameText.setBounds(183, 37, 128, 35);
		frame.getContentPane().add(nameText);
		nameText.setColumns(10);
		
		JButton button1 = new JButton("Przywitaj");
		button1.setForeground(new Color(255, 255, 255));
		button1.setBackground(new Color(42, 31, 153));
		button1.setBounds(61, 146, 99, 35);
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = nameText.getText();
				JOptionPane.showMessageDialog(frame, "Witaj "+text);
				
			}
		});
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("PRZYWITAJ");
		button2.addActionListener((e)->{
			String text = nameText.getText().toUpperCase();
			JOptionPane.showMessageDialog(frame, "WITAJ "+text);
		});
		button2.setBackground(new Color(192, 192, 192));
		button2.setBounds(183, 146, 128, 35);
		frame.getContentPane().add(button2);
	}
}
