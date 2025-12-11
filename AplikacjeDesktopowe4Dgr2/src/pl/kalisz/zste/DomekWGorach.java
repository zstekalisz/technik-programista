package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class DomekWGorach {

	private JFrame frame;
	private int counter = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DomekWGorach window = new DomekWGorach();
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
	public DomekWGorach() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 440, 560);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Domek w górach");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 10, 354, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel picture = new JLabel("");
		ImageIcon imageIcon = new ImageIcon("res/obraz.jpg");
		picture.setIcon(imageIcon);
		picture.setBounds(10, 72, 400, 213);
		frame.getContentPane().add(picture);
		
		JButton like = new JButton("Polub");
		like.setForeground(new Color(255, 255, 255));
		like.setFont(new Font("Tahoma", Font.PLAIN, 14));
		like.setBackground(new Color(0, 128, 128));
		like.setBounds(10, 316, 133, 40);
		frame.getContentPane().add(like);
		
		JButton unlike = new JButton("Usuń");
		unlike.setForeground(new Color(255, 255, 255));
		unlike.setFont(new Font("Tahoma", Font.PLAIN, 14));
		unlike.setBackground(new Color(0, 128, 128));
		unlike.setBounds(143, 316, 133, 40);
		frame.getContentPane().add(unlike);
		
		JButton btnNewButton_2 = new JButton("Zapisz");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBackground(new Color(0, 128, 128));
		btnNewButton_2.setBounds(276, 316, 133, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel likesText = new JLabel("0 polubień");
		likesText.setHorizontalAlignment(SwingConstants.RIGHT);
		likesText.setFont(new Font("Tahoma", Font.PLAIN, 14));
		likesText.setBounds(10, 366, 400, 23);
		frame.getContentPane().add(likesText);
		
		JLabel lblNewLabel_2 = new JLabel("Opis");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 399, 45, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JTextArea txtrOdwiedKomfortowyDomek = new JTextArea();
		txtrOdwiedKomfortowyDomek.setText("Odwiedź komfortowy domek \nw Sudetach, blisko do szlaków\nturystycznych");
		txtrOdwiedKomfortowyDomek.setEditable(false);
		txtrOdwiedKomfortowyDomek.setBounds(10, 441, 227, 72);
		like.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				likesText.setText(counter+" polubień");
				
			}
		});
		unlike.addActionListener(e-> {
			if(counter>0) {
				counter--;
				likesText.setText(counter+" polubień");
			}
		});
		frame.getContentPane().add(txtrOdwiedKomfortowyDomek);
	}
}
