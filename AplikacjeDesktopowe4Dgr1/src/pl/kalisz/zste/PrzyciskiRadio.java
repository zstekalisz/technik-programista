package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class PrzyciskiRadio {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrzyciskiRadio window = new PrzyciskiRadio();
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
	public PrzyciskiRadio() {
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

		JRadioButton r1 = new JRadioButton("kostka 1");
		r1.setSelected(true);
		r1.setBounds(33, 30, 103, 20);
		frame.getContentPane().add(r1);

		JRadioButton r2 = new JRadioButton("kostka 2");
		r2.setBounds(33, 70, 103, 20);
		frame.getContentPane().add(r2);

		JRadioButton r3 = new JRadioButton("kostka 3");
		r3.setBounds(33, 110, 103, 20);
		frame.getContentPane().add(r3);

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);

		JLabel imageLabel = new JLabel("");
		imageLabel.setBounds(248, 34, 90, 90);
		ImageIcon imageIcon = new ImageIcon("res/kostka1.png");
		imageLabel.setIcon(imageIcon);

		r3.addActionListener(e -> {
			ImageIcon image = new ImageIcon("res/kostka3.png");
			imageLabel.setIcon(image);
		});

		r2.addActionListener(e -> {
			ImageIcon image = new ImageIcon("res/kostka2.png");
			imageLabel.setIcon(image);
		});
		r1.addActionListener(e -> {
			ImageIcon image = new ImageIcon("res/kostka1.png");
			imageLabel.setIcon(image);
		});
		frame.getContentPane().add(imageLabel);
	}
}
