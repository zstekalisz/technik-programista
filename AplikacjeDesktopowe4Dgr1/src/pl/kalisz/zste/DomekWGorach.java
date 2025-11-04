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
	private int likeCounter = 0;

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
		frame.setBounds(100, 100, 421, 555);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Domek w górach");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel.setBounds(0, 10, 437, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel picture = new JLabel("");
		picture.setBounds(0, 51, 400, 214);
		ImageIcon imageIcon = new ImageIcon("res/obraz.jpg");
		picture.setIcon(imageIcon);
		frame.getContentPane().add(picture);
		
		JButton like = new JButton("Polub");
		like.setForeground(new Color(255, 255, 255));
		like.setBackground(new Color(0, 128, 128));
		like.setFont(new Font("Tahoma", Font.PLAIN, 14));
		like.setBounds(0, 285, 135, 40);
		frame.getContentPane().add(like);
		
		JButton unlike = new JButton("Usuń");
		unlike.setForeground(new Color(255, 255, 255));
		unlike.setBackground(new Color(0, 128, 128));
		unlike.setFont(new Font("Tahoma", Font.PLAIN, 14));
		unlike.setBounds(134, 285, 135, 40);
		frame.getContentPane().add(unlike);
		
		JButton btnNewButton_2 = new JButton("Zapisz");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(0, 128, 128));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(268, 285, 133, 40);
		frame.getContentPane().add(btnNewButton_2);
		
		JLabel likesText = new JLabel("0 polubień");
		likesText.setHorizontalAlignment(SwingConstants.RIGHT);
		likesText.setBounds(0, 335, 400, 30);
		frame.getContentPane().add(likesText);
		
		JLabel lblNewLabel_1 = new JLabel("Opis");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(0, 386, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JTextArea txtrOdwiedKomfortowyDomek = new JTextArea();
		txtrOdwiedKomfortowyDomek.setText("Odwiedź komfortowy domek \nw Sudetach, blisko do szlaków \nturystycznych");
		txtrOdwiedKomfortowyDomek.setEditable(false);
		txtrOdwiedKomfortowyDomek.setBounds(0, 409, 253, 84);
		like.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				likeCounter++;
				likesText.setText(likeCounter+ " polubień");
				
			}
		});
		unlike.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(likeCounter>0) {
					likeCounter--;
					likesText.setText(likeCounter+ " polubień");
				}
				
				
			}
		});
		frame.getContentPane().add(txtrOdwiedKomfortowyDomek);
	}
}
