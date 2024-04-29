package pl.zste.tabele;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class WidokTabeliCwiczenia {

	private static final String DefaultTableModel = null;
	private JFrame frame;
	private JTable table;
	private JTextField name;
	private JTextField surname;
	private List<Osoba> list = new ArrayList<Osoba>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WidokTabeliCwiczenia window = new WidokTabeliCwiczenia();
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
	public WidokTabeliCwiczenia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 686, 440);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel left = new JPanel();
		left.setBounds(10, 10, 321, 383);
		frame.getContentPane().add(left);
		left.setLayout(new BorderLayout());
		Object[] columnNames = {"Imię","Nazwisko"};
		Osoba o1 = new Osoba("Czesław", "Niemen");
		Osoba o2 = new Osoba("Halina", "Frąckowiak");
		Osoba o3 = new Osoba("Ewa", "Farna");
		list.add(o1);
		list.add(o2);
		list.add(o3);
		Object[][] dataSource = Osoba.convertData(list);
		table = new JTable(new DefaultTableModel(dataSource, columnNames));
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		JScrollPane scrollPane = new JScrollPane(table);
		left.add(scrollPane);
		
		JPanel right = new JPanel();
		right.setBounds(341, 10, 321, 383);
		frame.getContentPane().add(right);
		right.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Podaj imię :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(30, 21, 110, 25);
		right.add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(160, 20, 100, 25);
		right.add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Podaj nazwisko :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(30, 70, 110, 25);
		right.add(lblNewLabel_1);
		
		surname = new JTextField();
		surname.setBounds(160, 70, 100, 25);
		right.add(surname);
		surname.setColumns(10);
		
		JButton addPerson = new JButton("Dodaj osobę");
		addPerson.setBorder(new LineBorder(new Color(0, 128, 255), 1, true));
		addPerson.setActionCommand("addPerson");
		addPerson.setForeground(new Color(255, 255, 255));
		addPerson.setBackground(new Color(0, 128, 255));
		addPerson.setBounds(30, 134, 253, 21);
		addPerson.addActionListener(e->{
			if(!name.getText().isEmpty() && !surname.getText().isEmpty()) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.addRow(new Object[] {name.getText(), surname.getText()});
				name.setText("");
				surname.setText("");
			}
		});
		right.add(addPerson);
		
	}
}
