package pl.kalisz.zste;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class PrzyciskiRadio2 implements ActionListener{

	private JFrame frame;
	private JLabel imageLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrzyciskiRadio2 window = new PrzyciskiRadio2();
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
	public PrzyciskiRadio2() {
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
		r1.setActionCommand("r1");
		r1.setSelected(true);
		r1.setBounds(33, 30, 103, 20);
		frame.getContentPane().add(r1);

		JRadioButton r2 = new JRadioButton("kostka 2");
		r2.setActionCommand("r2");
		r2.setBounds(33, 70, 103, 20);
		frame.getContentPane().add(r2);

		JRadioButton r3 = new JRadioButton("kostka 3");
		r3.setActionCommand("r3");
		r3.setBounds(33, 110, 103, 20);
		frame.getContentPane().add(r3);

		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);

		imageLabel = new JLabel("");
		imageLabel.setBounds(248, 34, 90, 90);
		ImageIcon imageIcon = new ImageIcon("res/kostka1.png");
		imageLabel.setIcon(imageIcon);

		
		frame.getContentPane().add(imageLabel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(actionCommand.equals("r1")) {
			ImageIcon imageIcon = new ImageIcon("res/kostka1.png");
			imageLabel.setIcon(imageIcon);
		}else if(actionCommand.equals("r2")) {
			ImageIcon imageIcon = new ImageIcon("res/kostka2.png");
			imageLabel.setIcon(imageIcon);
		}else if(actionCommand.equals("r3")) {
			ImageIcon imageIcon = new ImageIcon("res/kostka3.png");
			imageLabel.setIcon(imageIcon);
		}
		
	}

}
