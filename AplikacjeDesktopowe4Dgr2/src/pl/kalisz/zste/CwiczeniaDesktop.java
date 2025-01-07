package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CwiczeniaDesktop {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CwiczeniaDesktop window = new CwiczeniaDesktop();
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
	public CwiczeniaDesktop() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 562, 403);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel myLabel = new JLabel("Podaj imię :");
		myLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		myLabel.setBounds(54, 43, 120, 44);
		frame.getContentPane().add(myLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		textField.setBounds(184, 43, 152, 44);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton save = new JButton("Zapisz");
		save.setBounds(395, 57, 85, 21);
		frame.getContentPane().add(save);
	}
}
