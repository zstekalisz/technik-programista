package pl.zste.desktop.cwiczenia;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.Box;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;


public class ArkuszINF04Zima2023 implements ActionListener{

	private JFrame frame;
	private JTextField name;
	private JTextField surname;
	private JTextField signs;
	private JComboBox<String> comboBox;
	private JCheckBox lettersCh;
	private JCheckBox numbersCh;
	private JCheckBox specjalsCh;
	private String actualPassword = "";
	
	
	private static List<String> letterList = Arrays.asList("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
			"m", "n", "o", "q", "p", "r", "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G",
			"H", "I", "J", "K", "L", "M", "N", "Q", "P", "R", "S", "T", "U", "W", "X", "Y", "Z", "V");
	private static List<String> numberList = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
	private static List<String> specjalList = Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+",
			"-", "=");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArkuszINF04Zima2023 window = new ArkuszINF04Zima2023();
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
	public ArkuszINF04Zima2023() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Dodaj pracownika");
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 930, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 4, true), "Dane pracownika", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		verticalBox.setBounds(70, 40, 350, 280);
		frame.getContentPane().add(verticalBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		verticalBox.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Imię");
		lblNewLabel.setBounds(40, 30, 120, 20);
		panel.add(lblNewLabel);
		
		JLabel lblNazwisko = new JLabel("Nazwisko");
		lblNazwisko.setBounds(40, 70, 120, 20);
		panel.add(lblNazwisko);
		
		JLabel lblNewLabel_2 = new JLabel("Stanowisko");
		lblNewLabel_2.setBounds(40, 110, 120, 20);
		panel.add(lblNewLabel_2);
		
		name = new JTextField();
		name.setBounds(160, 30, 120, 20);
		panel.add(name);
		name.setColumns(10);
		
		surname = new JTextField();
		surname.setBounds(160, 70, 120, 20);
		panel.add(surname);
		surname.setColumns(10);
		
		comboBox = new JComboBox<String>();
		comboBox.setBounds(160, 110, 130, 20);
		comboBox.addItem("Kierownik");
		comboBox.addItem("Starszy programista");
		comboBox.addItem("Młodszy programista");
		comboBox.addItem("Tester");
		panel.add(comboBox);
		
		Box verticalBox_1 = Box.createVerticalBox();
		verticalBox_1.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 4, true), "Generowanie has\u0142a", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		verticalBox_1.setBounds(490, 40, 350, 280);
		frame.getContentPane().add(verticalBox_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 196, 222));
		verticalBox_1.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Ile znaków ?");
		lblNewLabel_1.setBounds(40, 30, 120, 20);
		panel_1.add(lblNewLabel_1);
		
		signs = new JTextField();
		signs.setBounds(160, 30, 120, 20);
		panel_1.add(signs);
		signs.setColumns(10);
		
		lettersCh = new JCheckBox("Małe i wielkie litery");
		lettersCh.setBackground(new Color(176, 196, 222));
		lettersCh.setBounds(40, 70, 150, 20);
		panel_1.add(lettersCh);
		
		numbersCh = new JCheckBox("Cyfry");
		numbersCh.setBackground(new Color(176, 196, 222));
		numbersCh.setBounds(40, 110, 120, 20);
		panel_1.add(numbersCh);
		
		specjalsCh = new JCheckBox("Znaki specjalne");
		specjalsCh.setBackground(new Color(176, 196, 222));
		specjalsCh.setBounds(40, 150, 120, 20);
		panel_1.add(specjalsCh);
		
		JButton generateButton = new JButton("Generuj hasło");
		generateButton.setActionCommand("generate");
		generateButton.setForeground(new Color(255, 255, 255));
		generateButton.setBackground(new Color(70, 130, 180));
		generateButton.setBounds(130, 200, 120, 20);
		panel_1.add(generateButton);
		
		JButton saveButton = new JButton("Zatwierdź");
		saveButton.setForeground(new Color(255, 255, 255));
		saveButton.setBackground(new Color(70, 130, 180));
		saveButton.setActionCommand("save");
		saveButton.setBounds(380, 350, 150, 20);
		frame.getContentPane().add(saveButton);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("generate")) {
			List<String> result = new ArrayList<>();
			if (lettersCh.isSelected()) {
				result.addAll(letterList);
			}
			if (numbersCh.isSelected()) {
				result.addAll(numberList);
			}
			if (specjalsCh.isSelected()) {
				result.addAll(specjalList);
			}
			try {
				int length = Integer.parseInt(signs.getText());
				if (length > 50) {
					JOptionPane.showMessageDialog(frame, "Generuję hasła do 50 znaków");
				} else {
					Random random = new Random();
					// String password = "";
					StringBuilder builder = new StringBuilder();
					builder.append("Wygenerowane hasło : ");
					for (int i = 0; i < length; i++) {
						if(result.size()==0) {
							break;
						}
						int index = random.nextInt(result.size());
						String znak = result.get(index);
						// password+=znak; // to by działało ale garbage collector sprzątałby co
						// iterację nieużywane obiekty
						builder.append(znak);
					}
					actualPassword = builder.toString();
				}
			} catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(frame, "Wpisz liczbę a nie śmieci");
			}
			
		}else if(e.getActionCommand().equals("save")) {
			//TODO napisać akcje dla przycisku Zatwierdz
		}
		
	}
}
