package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class Paszporty {

	private JFrame frmWprowadzenieDanychDo;
	private JTextField id;
	private JTextField name;
	private JTextField surname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paszporty window = new Paszporty();
					window.frmWprowadzenieDanychDo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Paszporty() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmWprowadzenieDanychDo = new JFrame();
		frmWprowadzenieDanychDo.getContentPane().setBackground(new Color(95, 158, 160));
		frmWprowadzenieDanychDo.setBackground(new Color(255, 255, 255));
		frmWprowadzenieDanychDo.setTitle("Wprowadzenie danych do paszportu. Wykonał:");
		frmWprowadzenieDanychDo.setBounds(100, 100, 823, 458);
		frmWprowadzenieDanychDo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmWprowadzenieDanychDo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numer");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(45, 42, 72, 24);
		frmWprowadzenieDanychDo.getContentPane().add(lblNewLabel);
		
		id = new JTextField();
		id.setBackground(new Color(240, 255, 255));
		id.setBounds(146, 47, 170, 19);
		frmWprowadzenieDanychDo.getContentPane().add(id);
		id.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Imię");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(45, 94, 57, 13);
		frmWprowadzenieDanychDo.getContentPane().add(lblNewLabel_1);
		
		name = new JTextField();
		name.setBackground(new Color(240, 255, 255));
		name.setBounds(146, 91, 170, 19);
		frmWprowadzenieDanychDo.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Nazwisko");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(45, 138, 57, 13);
		frmWprowadzenieDanychDo.getContentPane().add(lblNewLabel_2);
		
		surname = new JTextField();
		surname.setBackground(new Color(240, 255, 255));
		surname.setBounds(146, 135, 170, 19);
		frmWprowadzenieDanychDo.getContentPane().add(surname);
		surname.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(240, 255, 255), 4, true), "Kolor oczu", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel.setBackground(new Color(95, 158, 160));
		panel.setBounds(45, 191, 271, 187);
		frmWprowadzenieDanychDo.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton blue = new JRadioButton("niebieskie");
		blue.setSelected(true);
		blue.setBackground(new Color(95, 158, 160));
		blue.setBounds(20, 31, 103, 21);
		panel.add(blue);
		
		JRadioButton green = new JRadioButton("zielone");
		green.setBackground(new Color(95, 158, 160));
		green.setBounds(20, 80, 103, 21);
		panel.add(green);
		
		JRadioButton brown = new JRadioButton("piwne");
		brown.setBackground(new Color(95, 158, 160));
		brown.setBounds(20, 131, 103, 21);
		panel.add(brown);
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(blue);
		buttonGroup.add(green);
		buttonGroup.add(brown);
		
		JButton okbtn = new JButton("OK");
		okbtn.setBackground(new Color(240, 255, 255));
		okbtn.setBounds(411, 350, 296, 28);
		frmWprowadzenieDanychDo.getContentPane().add(okbtn);
		
		JLabel picture = new JLabel("");
		picture.setBounds(364, 33, 195, 225);
		frmWprowadzenieDanychDo.getContentPane().add(picture);
		ImageIcon pictureIcon = new ImageIcon("res/000-zdjecie.jpg");
		picture.setIcon(pictureIcon);
		
		JLabel fingerPrint = new JLabel("");
		fingerPrint.setBounds(579, 33, 195, 225);
		frmWprowadzenieDanychDo.getContentPane().add(fingerPrint);
		ImageIcon fingerPrintIcon = new ImageIcon("res/000-odcisk.jpg");
		fingerPrint.setIcon(fingerPrintIcon);
		
		id.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				String textFromGUI = id.getText();
				if(textFromGUI.equals("000")) {
					ImageIcon pictureIcon = new ImageIcon("res/000-zdjecie.jpg");
					ImageIcon fingerPrintIcon = new ImageIcon("res/000-odcisk.jpg");
					picture.setIcon(pictureIcon);
					fingerPrint.setIcon(fingerPrintIcon);
				}else if(textFromGUI.equals("111")) {
					ImageIcon pictureIcon = new ImageIcon("res/111-zdjecie.jpg");
					ImageIcon fingerPrintIcon = new ImageIcon("res/111-odcisk.jpg");
					picture.setIcon(pictureIcon);
					fingerPrint.setIcon(fingerPrintIcon);
				}else if(textFromGUI.equals("333")) {
					ImageIcon pictureIcon = new ImageIcon("res/333-zdjecie.jpg");
					ImageIcon fingerPrintIcon = new ImageIcon("res/333-odcisk.jpg");
					picture.setIcon(pictureIcon);
					fingerPrint.setIcon(fingerPrintIcon);
				}else {
					picture.setIcon(null);
					fingerPrint.setIcon(null);
				}
				
			}
			
			@Override
			public void focusGained(FocusEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		okbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(name.getText()!=null && !name.getText().isEmpty() && surname.getText()!=null && !surname.getText().isEmpty()) {
					String komunikat = "";
					komunikat = komunikat + name.getText()+" "+ surname.getText()+" kolor oczu ";
					if(brown.isSelected()) {
						komunikat = komunikat + "brązowy";
					}else if(blue.isSelected()) {
						komunikat = komunikat+ "niebieski";
					}else if(green.isSelected()) {
						komunikat = komunikat+ "zielony";
					}
					JOptionPane.showMessageDialog(frmWprowadzenieDanychDo, komunikat);
				}else {
					JOptionPane.showMessageDialog(frmWprowadzenieDanychDo, "Wprowadź dane");
				}
				
				
			}
		});
		
	}
}
