package pl.zste.desktop.cwiczenia;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.Box;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;

public class AddWorker implements ActionListener {

	private JFrame frame;
	private JTextField nameText;
	private JTextField surnameText;
	private JSpinner spinner;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddWorker window = new AddWorker();
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
	public AddWorker() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Box verticalBox = Box.createVerticalBox();
		verticalBox.setName("");
		verticalBox.setBounds(51, 32, 337, 194);
		verticalBox.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 3, true), "Dane osoby", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(0, 0, 0)));
		frame.getContentPane().add(verticalBox);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		verticalBox.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Imię");
		lblNewLabel.setBounds(50, 30, 80, 20);
		panel.add(lblNewLabel);
		
		nameText = new JTextField();
		nameText.setBounds(150, 30, 150, 20);
		panel.add(nameText);
		nameText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nazwisko");
		lblNewLabel_1.setBounds(50, 60, 80, 20);
		panel.add(lblNewLabel_1);
		
		surnameText = new JTextField();
		surnameText.setBounds(150, 60, 150, 20);
		panel.add(surnameText);
		surnameText.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Stanowisko");
		lblNewLabel_2.setBounds(50, 90, 80, 20);
		panel.add(lblNewLabel_2);
		
		spinner = new JSpinner();
		spinner.setBounds(150, 90, 150, 20);
		panel.add(spinner);
		SpinnerListModel model = 
				new SpinnerListModel(Arrays.asList("Kierownik", "Straszy programista", "Młodszy programista", "Tester"));
		spinner.setModel(model);
		
		JButton accept = new JButton("Zatwierdź");
		accept.setForeground(new Color(255, 255, 255));
		accept.setBackground(new Color(70, 130, 180));
		accept.setBounds(126, 140, 100, 20);
		panel.add(accept);
		accept.setActionCommand("apply");
		accept.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(Objects.equals(e.getActionCommand(), "apply")) {
			String name = nameText.getText();
			String surname = surnameText.getText();
			String job = (String)spinner.getValue();
			JOptionPane.showMessageDialog(frame, "Dane pracownika :"+name+" "+surname+" "+job);
		}
		
	}
}
