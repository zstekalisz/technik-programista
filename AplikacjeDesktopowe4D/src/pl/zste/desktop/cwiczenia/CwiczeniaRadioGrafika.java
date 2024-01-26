package pl.zste.desktop.cwiczenia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;

public class CwiczeniaRadioGrafika implements ActionListener {

	private JFrame frame;
	private JLabel graphicBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CwiczeniaRadioGrafika window = new CwiczeniaRadioGrafika();
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
	public CwiczeniaRadioGrafika() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 803, 473);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setBorder(new TitledBorder(new LineBorder(new Color(192, 192, 192), 5, true), "Przesy\u0142ki pocztowe", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		horizontalBox.setBounds(88, 39, 611, 152);
		frame.getContentPane().add(horizontalBox);
		
		JPanel panel = new JPanel();
		horizontalBox.add(panel);
		panel.setLayout(null);
		
		JRadioButton letter = new JRadioButton("List");
		letter.setActionCommand("list");
		letter.setBounds(60, 23, 97, 36);
		panel.add(letter);
		letter.setSelected(true);
		letter.setFont(new Font("Tahoma", Font.BOLD, 14));
		letter.addActionListener(this);
		
		JRadioButton postPackage = new JRadioButton("Paczka");
		postPackage.setActionCommand("paczka");
		postPackage.setBounds(240, 23, 151, 36);
		panel.add(postPackage);
		postPackage.setFont(new Font("Tahoma", Font.BOLD, 14));
		postPackage.addActionListener(this);
		
		JRadioButton postcard = new JRadioButton("Pocztówka");
		postcard.setActionCommand("pocztowka");
		postcard.setBounds(423, 23, 151, 36);
		panel.add(postcard);
		postcard.setFont(new Font("Tahoma", Font.BOLD, 14));
		postcard.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();
		group.add(letter);
		group.add(postcard);
		group.add(postPackage);
		
		graphicBox = new JLabel("");
		graphicBox.setBounds(88, 235, 148, 111);
		frame.getContentPane().add(graphicBox);
		ImageIcon icon = new ImageIcon("res/list.png");
		graphicBox.setIcon(icon);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		JRadioButton source = (JRadioButton)e.getSource();
		switch(actionCommand) {
		case "list":
			if(source.isSelected()) {
				ImageIcon icon = new ImageIcon("res/list.png");
				graphicBox.setIcon(icon);
			}
			break;
		case "paczka":
			if(source.isSelected()) {
				ImageIcon icon = new ImageIcon("res/paczka.png");
				graphicBox.setIcon(icon);
			}
			break;
		case "pocztowka":
			if(source.isSelected()) {
				ImageIcon icon = new ImageIcon("res/pocztowka.png");
				graphicBox.setIcon(icon);
			}
			break;
		}
		
	}
}
