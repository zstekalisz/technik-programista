package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class ZadanieLuty2025 {

	private JFrame frmZadanieGrupa;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZadanieLuty2025 window = new ZadanieLuty2025();
					window.frmZadanieGrupa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ZadanieLuty2025() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmZadanieGrupa = new JFrame();
		frmZadanieGrupa.getContentPane().setBackground(new Color(65, 62, 241));
		frmZadanieGrupa.setTitle("Zadanie grupa 2");
		frmZadanieGrupa.setBounds(100, 100, 450, 300);
		frmZadanieGrupa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmZadanieGrupa.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(20, 237, 211), 2, true));
		panel.setBackground(new Color(65, 62, 241));
		panel.setBounds(31, 35, 190, 139);
		frmZadanieGrupa.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Wpisz ile m2");
		lblNewLabel.setBounds(10, 21, 72, 13);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(92, 18, 67, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new LineBorder(new Color(20, 237, 211), 2, true), "Kolory", TitledBorder.RIGHT, TitledBorder.TOP, null, null));
		panel_1.setBackground(new Color(65, 62, 241));
		panel_1.setBounds(231, 28, 169, 146);
		frmZadanieGrupa.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Metalic");
		rdbtnNewRadioButton.setBackground(new Color(65, 62, 241));
		rdbtnNewRadioButton.setBounds(19, 17, 103, 21);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Akryl");
		rdbtnNewRadioButton_1.setSelected(true);
		rdbtnNewRadioButton_1.setBackground(new Color(65, 62, 241));
		rdbtnNewRadioButton_1.setBounds(19, 40, 103, 21);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JButton btnNewButton = new JButton("Zamów");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 10));
		btnNewButton.setForeground(new Color(65, 62, 241));
		btnNewButton.setBackground(new Color(20, 237, 211));
		btnNewButton.setBounds(31, 204, 369, 21);
		frmZadanieGrupa.getContentPane().add(btnNewButton);
		
	}
}
