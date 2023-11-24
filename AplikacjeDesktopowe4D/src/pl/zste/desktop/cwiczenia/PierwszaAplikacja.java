package pl.zste.desktop.cwiczenia;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;

public class PierwszaAplikacja implements ActionListener{

	private JFrame frame;
	private JTextField messageText;
	private JTextField messages;
	private JButton sendMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PierwszaAplikacja window = new PierwszaAplikacja();
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
	public PierwszaAplikacja() {
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
		
		messageText = new JTextField();
		messageText.setBackground(new Color(0, 255, 255));
		messageText.setBounds(140, 30, 150, 20);
		frame.getContentPane().add(messageText);
		messageText.setColumns(10);
		
		JLabel enterMessageLabel = new JLabel("Podaj wiadomość");
		enterMessageLabel.setBounds(25, 30, 110, 20);
		frame.getContentPane().add(enterMessageLabel);
		
		messages = new JTextField();
		messages.setEditable(false);
		messages.setBounds(140, 100, 150, 20);
		frame.getContentPane().add(messages);
		messages.setColumns(10);
		
		sendMessage = new JButton("Wyślij");
		sendMessage.setActionCommand("send");
		sendMessage.setForeground(new Color(255, 255, 255));
		sendMessage.setBackground(new Color(0, 0, 255));
		sendMessage.setBounds(320, 30, 80, 20);
		sendMessage.addActionListener(this);
		frame.getContentPane().add(sendMessage);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		if((JButton)e.getSource()==sendMessage) {
//			
//		}
		if(Objects.equals(e.getActionCommand(), "send")) {
			messages.setText(messageText.getText());
		}
		
	}
}
