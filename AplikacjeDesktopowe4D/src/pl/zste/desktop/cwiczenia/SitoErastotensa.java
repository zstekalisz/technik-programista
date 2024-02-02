package pl.zste.desktop.cwiczenia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextArea;

public class SitoErastotensa {

	private JFrame frame;
	private JTextField n;
	private JTextArea displayMessage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SitoErastotensa window = new SitoErastotensa();
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
	public SitoErastotensa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 527, 474);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		n = new JTextField();
		n.setBounds(230, 40, 229, 20);
		frame.getContentPane().add(n);
		n.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Wpisz rozmiar tablicy");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(40, 40, 145, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JButton find = new JButton("Znajdź liczby pierwsze");
		find.setBounds(40, 98, 416, 21);
		frame.getContentPane().add(find);
		
		displayMessage = new JTextArea();
		displayMessage.setBounds(40, 163, 416, 183);
		displayMessage.setLineWrap(true);
		frame.getContentPane().add(displayMessage);
		
		find.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					int tabLength = Integer.parseInt(n.getText());
					
					boolean[] tab = new boolean[tabLength];
					setData(tab);
					markData(tab);
					StringBuilder builder = new StringBuilder();
					for(int i = 0 ; i< tab.length; i++) {
						if(tab[i]) {
							builder.append(i);
							builder.append(" ");
						}
					}
					displayMessage.setText(builder.toString());
					
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(frame, "Musisz wpisać liczbę !");
				}
				
			}
		});
	}
	public static void setData(boolean[] tab) {
		for(int i = 0; i<tab.length; i++) {
			tab[i] = true;
		}
	}
	
	public static void markData(boolean[] tab) {
		double sqrt = Math.sqrt(tab.length);
		int rounded = (int) sqrt;
		for(int i = 2; i < rounded; i++) {
			for(int j = 2; j < tab.length; j++) {
				if(j>i && j%i==0) {
					tab[j] = false;
				}
				
			}
		}
	}
}
