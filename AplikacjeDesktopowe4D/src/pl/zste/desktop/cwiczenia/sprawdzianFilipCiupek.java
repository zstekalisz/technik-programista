package pl.zste.desktop.cwiczenia;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.util.Collection;

import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;

public class sprawdzianFilipCiupek {

	private JFrame frmDodajPracownika;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField liczba;
	private String pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sprawdzianFilipCiupek window = new sprawdzianFilipCiupek();
					window.frmDodajPracownika.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public sprawdzianFilipCiupek() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDodajPracownika = new JFrame();
		frmDodajPracownika.getContentPane().setBackground(new Color(176, 196, 222));
		frmDodajPracownika.setTitle("Dodaj Pracownika");
		frmDodajPracownika.setBounds(100, 100, 792, 375);
		frmDodajPracownika.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDodajPracownika.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(176, 196, 222));
		panel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 3, true), "Dodaj Pracownika", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(38, 72, 295, 188);
		frmDodajPracownika.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Imie");
		lblNewLabel.setBounds(10, 31, 62, 13);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nazwisko");
		lblNewLabel_1.setBounds(10, 63, 62, 13);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Stanowisko");
		lblNewLabel_2.setBounds(10, 100, 80, 13);
		panel.add(lblNewLabel_2);
//		Kierownik, Starszy programista, 
//		Młodszy programista, Tester 
		textField = new JTextField();
		textField.setBounds(129, 28, 126, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(129, 60, 126, 19);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox<String> comboBox = new JComboBox<>();
		comboBox.setBounds(129, 96, 126, 21);
		panel.add(comboBox);
		String  dwa = "starszy programista";
		String  trzy = "młodszy programista";
		String  cztery = "tester";
		comboBox.addItem("kierownik");
		comboBox.addItem(dwa );
		comboBox.addItem(trzy );
		comboBox.addItem(cztery );

//		-------------------------- add item String leci get selected item
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 3), "Generowania Hasla", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(418, 72, 295, 188);
		frmDodajPracownika.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Ile znaków?");
		lblNewLabel_3.setBounds(27, 24, 78, 13);
		panel_1.add(lblNewLabel_3);
		
		liczba = new JTextField();
		liczba.setBounds(117, 21, 96, 19);
		panel_1.add(liczba);
		liczba.setColumns(10);
		
		JCheckBox cyfry = new JCheckBox("Cyfry");
		cyfry.setBackground(new Color(176, 196, 222));
		cyfry.setBounds(27, 69, 93, 21);
		panel_1.add(cyfry);
		
		JCheckBox duze = new JCheckBox("Małe i wielkie litery");
		duze.setBackground(new Color(176, 196, 222));
		duze.setSelected(true);
		duze.setBounds(27, 46, 141, 21);
		panel_1.add(duze);
		
		JCheckBox specjalne = new JCheckBox("Znaki specjalne");
		specjalne.setBackground(new Color(176, 196, 222));
		specjalne.setBounds(27, 92, 129, 21);
		panel_1.add(specjalne);
		
		JButton hasloBtn = new JButton("Generuj Haslo");
		hasloBtn.setForeground(new Color(255, 255, 255));
		hasloBtn.setBackground(new Color(46, 130, 180));
		hasloBtn.setBounds(90, 137, 141, 21);
		panel_1.add(hasloBtn);
		
		
		hasloBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = liczba.getText();
				try {
					int ileZnakow = Integer.parseInt(text);
					boolean isDuze = duze.isSelected();
					boolean isCyfry = cyfry.isSelected();
					boolean isSpecjalne = specjalne.isSelected();
					String haslo = GenerowanieHasla.generujHaslo(ileZnakow, isDuze, isCyfry, isSpecjalne);
					pass = haslo;
					JOptionPane.showMessageDialog(frmDodajPracownika, "Wygenerowane hasło "+haslo);
					
				}catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(frmDodajPracownika, "Wpisz liczbę !!!!");
				}
				
				
			}
		});
		
		
		
		JButton zatwierdzBtn = new JButton("Zatwierdz");
		zatwierdzBtn.setForeground(new Color(255, 255, 255));
		zatwierdzBtn.setBackground(new Color(46, 130, 180));
		zatwierdzBtn.setBounds(282, 270, 218, 37);
		frmDodajPracownika.getContentPane().add(zatwierdzBtn);
		zatwierdzBtn.addActionListener(e->{
			StringBuilder b = new StringBuilder();
			b.append("Dane pracownika : ");
			b.append(textField.getText());
			b.append(" ");
			b.append(textField_1.getText());
			b.append(" ");
			b.append(comboBox.getSelectedItem().toString());
			b.append(" Hasło:");
			if(pass == null) {
				b.append("nie wygenerowano hała - naciśnij przyciśk 'Generuj hasło'");
			}else {
				b.append(pass);
			}
			JOptionPane.showMessageDialog(frmDodajPracownika, b.toString());
		});
		
		
	}
}
