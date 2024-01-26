package pl.zste.desktop.cwiczenia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class ArkuszINF04Lato2023 {

	private JFrame frame;
	private JTextField street;
	private JTextField postCode;
	private JTextField city;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArkuszINF04Lato2023 window = new ArkuszINF04Lato2023();
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
	public ArkuszINF04Lato2023() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 767, 456);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128), 2, true), "Rodzaj przesy\u0142ki", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		verticalBox.setBounds(48, 36, 283, 127);
		frame.getContentPane().add(verticalBox);
		
		JPanel panel = new JPanel();
		verticalBox.add(panel);
		panel.setLayout(null);
		
		JRadioButton postcard = new JRadioButton("Pocztówka");
		postcard.setBounds(16, 21, 103, 21);
		postcard.setSelected(true);
		panel.add(postcard);
		
		JRadioButton letter = new JRadioButton("List");
		letter.setBounds(16, 44, 103, 21);
		panel.add(letter);
		
		JRadioButton postBox = new JRadioButton("Paczka");
		postBox.setBounds(16, 67, 103, 21);
		panel.add(postBox);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(postBox);
		buttonGroup.add(letter);
		buttonGroup.add(postcard);
		
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setBorder(new TitledBorder(new LineBorder(new Color(128, 128, 128), 2, true), "Dane adresowe", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		verticalBox_1.setBounds(391, 36, 325, 287);
		frame.getContentPane().add(verticalBox_1);
		
		JPanel panel_1 = new JPanel();
		verticalBox_1.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ulica z numerem");
		lblNewLabel.setBounds(25, 13, 280, 20);
		panel_1.add(lblNewLabel);
		
		street = new JTextField();
		street.setBounds(25, 43, 260, 20);
		panel_1.add(street);
		street.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Kod pocztowy");
		lblNewLabel_1.setBounds(25, 92, 280, 20);
		panel_1.add(lblNewLabel_1);
		
		postCode = new JTextField();
		postCode.setBounds(24, 122, 130, 20);
		panel_1.add(postCode);
		postCode.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Miasto");
		lblNewLabel_2.setBounds(25, 166, 260, 20);
		panel_1.add(lblNewLabel_2);
		
		city = new JTextField();
		city.setBounds(25, 196, 260, 20);
		panel_1.add(city);
		city.setColumns(10);
		
		JButton priceButton = new JButton("Sprawdź cenę");
		priceButton.setBounds(48, 189, 283, 21);
		frame.getContentPane().add(priceButton);
		
		ImageIcon icon = new ImageIcon("res/pocztowka.png");
		
		JLabel image = new JLabel("   Cena: 1 zł");
		image.setHorizontalAlignment(SwingConstants.LEFT);
		image.setFont(new Font("Tahoma", Font.BOLD, 16));
		image.setBounds(48, 230, 283, 89);
		image.setIcon(icon);
		frame.getContentPane().add(image);
		
		JButton submit = new JButton("Zatwierdź");
		submit.setBounds(48, 352, 668, 21);
		frame.getContentPane().add(submit);
		
		priceButton.addActionListener(new ActionListener() {//anonimowa klasa wewnętrzna
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(postcard.isSelected()) {
					ImageIcon iconNew = new ImageIcon("res/pocztowka.png");
					image.setIcon(iconNew);
					image.setText("   Cena: 1 zł");				
				}else if(letter.isSelected()) {
					ImageIcon iconNew = new ImageIcon("res/list.png");
					image.setIcon(iconNew);
					image.setText("   Cena: 1,5 zł");
				}else if(postBox.isSelected()) {
					ImageIcon iconNew = new ImageIcon("res/paczka.png");
					image.setIcon(iconNew);
					image.setText("   Cena: 10 zł");
				}
				
			}
		});
		submit.addAc
	}
}
