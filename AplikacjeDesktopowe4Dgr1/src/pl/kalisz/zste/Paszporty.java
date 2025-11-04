package pl.kalisz.zste;

import java.awt.EventQueue;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
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
		frmWprowadzenieDanychDo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numer");
		lblNewLabel.setBounds(33, 34, 45, 13);
		frmWprowadzenieDanychDo.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Imię");
		lblNewLabel_1.setBounds(33, 69, 45, 13);
		frmWprowadzenieDanychDo.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nazwisko");
		lblNewLabel_2.setBounds(33, 104, 45, 13);
		frmWprowadzenieDanychDo.getContentPane().add(lblNewLabel_2);
		
		id = new JTextField();
		id.setBackground(new Color(240, 255, 255));
		id.setBounds(104, 31, 146, 19);
		frmWprowadzenieDanychDo.getContentPane().add(id);
		id.setColumns(10);
		
		name = new JTextField();
		name.setBackground(new Color(240, 255, 255));
		name.setBounds(104, 66, 147, 19);
		frmWprowadzenieDanychDo.getContentPane().add(name);
		name.setColumns(10);
		
		surname = new JTextField();
		surname.setBackground(new Color(240, 255, 255));
		surname.setBounds(104, 100, 146, 19);
		frmWprowadzenieDanychDo.getContentPane().add(surname);
		surname.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(95, 158, 160));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(240, 255, 255), 4, true), "Kolor oczu", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel.setBounds(33, 167, 216, 227);
		frmWprowadzenieDanychDo.getContentPane().add(panel);
		panel.setLayout(null);
		
		JRadioButton blue = new JRadioButton("Niebieskie");
		blue.setSelected(true);
		blue.setBackground(new Color(95, 158, 160));
		blue.setBounds(22, 39, 103, 21);
		panel.add(blue);
		
		JRadioButton green = new JRadioButton("Zielone");
		green.setBackground(new Color(95, 158, 160));
		green.setBounds(22, 98, 103, 21);
		panel.add(green);
		
		JRadioButton brown = new JRadioButton("Piwne");
		brown.setBackground(new Color(95, 158, 160));
		brown.setBounds(22, 159, 103, 21);
		panel.add(brown);
		frmWprowadzenieDanychDo.setTitle("Wprowadzenie danych do paszportu. Wykonał: ");
		frmWprowadzenieDanychDo.setBounds(100, 100, 834, 490);
		frmWprowadzenieDanychDo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ButtonGroup bt = new ButtonGroup();
		bt.add(blue);
		bt.add(green);
		bt.add(brown);
		
		JLabel picture = new JLabel("");
		picture.setBounds(348, 34, 196, 227);
		frmWprowadzenieDanychDo.getContentPane().add(picture);
		
		JLabel fingerPrint = new JLabel("");
		fingerPrint.setBounds(584, 34, 196, 227);
		frmWprowadzenieDanychDo.getContentPane().add(fingerPrint);
		ImageIcon pictureIcon = new ImageIcon("res/000-zdjecie.jpg");
		picture.setIcon(pictureIcon);
		ImageIcon fingerPrintIcon = new ImageIcon("res/000-odcisk.jpg");
		fingerPrint.setIcon(fingerPrintIcon);
		
		JButton okBtn = new JButton("OK");
		okBtn.setBounds(436, 373, 248, 21);
		frmWprowadzenieDanychDo.getContentPane().add(okBtn);
		id.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent e) {
				String textFromGUI = id.getText();
				if(textFromGUI.equals("000")) {
					ImageIcon pictureIcon = new ImageIcon("res/000-zdjecie.jpg");
					picture.setIcon(pictureIcon);
					ImageIcon fingerPrintIcon = new ImageIcon("res/000-odcisk.jpg");
					fingerPrint.setIcon(fingerPrintIcon);
				}else if(textFromGUI.equals("111")) {
					ImageIcon pictureIcon = new ImageIcon("res/111-zdjecie.jpg");
					picture.setIcon(pictureIcon);
					ImageIcon fingerPrintIcon = new ImageIcon("res/111-odcisk.jpg");
					fingerPrint.setIcon(fingerPrintIcon);
				}else if(textFromGUI.equals("333")) {
					ImageIcon pictureIcon = new ImageIcon("res/333-zdjecie.jpg");
					picture.setIcon(pictureIcon);
					ImageIcon fingerPrintIcon = new ImageIcon("res/333-odcisk.jpg");
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
	}
}
