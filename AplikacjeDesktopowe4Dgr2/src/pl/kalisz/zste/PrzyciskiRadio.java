package pl.kalisz.zste;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

public class PrzyciskiRadio implements ActionListener{

	private JFrame frame;
	private JLabel image;

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
		ImageIcon icon = new ImageIcon("res/kostka1.png");
		image = new JLabel("");
		image.setBounds(241, 34, 103, 86);
		image.setIcon(icon);
		
		RadioAction action = new RadioAction(image);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton r1 = new JRadioButton("kostka 1");
		r1.setActionCommand("r1");
		r1.setSelected(true);
		r1.setBounds(40, 30, 103, 20);
		r1.addActionListener(action);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("kostka 2");
		r2.setActionCommand("r2");
		r2.setBounds(40, 65, 103, 20);
		r2.addActionListener(action);
		frame.getContentPane().add(r2);
		
		JRadioButton r3 = new JRadioButton("kostka 3");
		r3.setActionCommand("r3");
		r3.setBounds(40, 100, 103, 20);
		r3.addActionListener(action);
		frame.getContentPane().add(r3);
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		
		frame.getContentPane().add(image);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch(command) {
		case "r1":
			ImageIcon icon = new ImageIcon("res/kostka1.png");
			image.setIcon(icon);
			break;
		case "r2":
			ImageIcon icon2 = new ImageIcon("res/kostka2.png");
			image.setIcon(icon2);
			break;
		case "r3":
			ImageIcon icon3 = new ImageIcon("res/kostka3.png");
			image.setIcon(icon3);
			break;
		}
		
	}

}
