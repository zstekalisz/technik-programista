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
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Component;
import javax.swing.SwingConstants;
import javax.swing.JCheckBox;

public class GewneratorHasel implements ActionListener{
	
	private static List<String> letterList = Arrays.asList("a", "b","c","d","e","f","g","h","i","j","k","l","m","n","o","q","p","r",
			"s", "t","u","v","w","x","y","z","A","B","C","D","E","F","G","H", "I", "J","K", "L","M","N","Q","P","R","S","T","U","W",
			"X","Y","Z","V");
	private static List<String> numberList = Arrays.asList("0","1","2","3","4","5","6","7","8","9");
	private static List<String> specjalList = Arrays.asList("!","@","#","$","%","^","&","*","(",")","_","+","-","=");

	private JFrame frame;
	private JTextField textField;
	private JCheckBox letters;
	private JCheckBox numbers;
	private JCheckBox specjals;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GewneratorHasel window = new GewneratorHasel();
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
	public GewneratorHasel() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 640, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setBorder(new LineBorder(new Color(255, 255, 255), 5, true));
		verticalBox.setBounds(54, 33, 516, 289);
		frame.getContentPane().add(verticalBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		verticalBox.add(panel);
		panel.setLayout(null);
		
		JButton generate = new JButton("Generuj hasło");
		generate.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		generate.setForeground(new Color(255, 255, 255));
		generate.setBackground(new Color(70, 130, 180));
		generate.setBounds(172, 236, 152, 21);
		generate.addActionListener(this);
		generate.setActionCommand("generuj");
		panel.add(generate);
		
		JLabel lblNewLabel = new JLabel("Ile znaków");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblNewLabel.setBounds(130, 40, 90, 20);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(230, 40, 170, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		letters = new JCheckBox("Małe i wielkie litery");
		letters.setBackground(new Color(176, 196, 222));
		letters.setBounds(130, 80, 120, 20);
		panel.add(letters);
		
		numbers = new JCheckBox("Cyfry");
		numbers.setBackground(new Color(176, 196, 222));
		numbers.setBounds(130, 110, 93, 20);
		panel.add(numbers);
		
		specjals = new JCheckBox("Znaki specjalne");
		specjals.setBackground(new Color(176, 196, 222));
		specjals.setBounds(130, 140, 120, 20);
		panel.add(specjals);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("generuj")) {
			List<String> result = new ArrayList<>();
			if(letters.isSelected()) {
				result.addAll(letterList);
			}
			if(numbers.isSelected()) {
				result.addAll(numberList);
			}
			if(specjals.isSelected()) {
				result.addAll(specjalList);
			}
			try {
				int length = Integer.parseInt(textField.getText());
				Random random = new Random();
				for(int i = 0; i<length; i++) {
					int index = random.nextInt(result.size());
					String znak = result.get(index);
					
				}
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(frame, "Wpisz liczbę a nie śmieci");
			}
			
		}
		
	}
}
