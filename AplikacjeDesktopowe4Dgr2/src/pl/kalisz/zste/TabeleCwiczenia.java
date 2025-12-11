package pl.kalisz.zste;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TabeleCwiczenia {

	private JFrame frame;
	private JTable table;
	private JTextField name;
	private JTextField surname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabeleCwiczenia window = new TabeleCwiczenia();
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
	public TabeleCwiczenia() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 534, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Vector<String> columns = new Vector<String>();
		columns.add("IMIĘ");
		columns.add("NAZWISKO");
		DefaultTableModel model = new DefaultTableModel(columns, 0);
		Vector<String> row1 = new Vector<String>();
		row1.add("Tomasz");
		row1.add("Stachowiak");
		Vector<String> row2 = new Vector<String>();
		row2.add("Agata");
		row2.add("Bartoszczyk");
		Vector<String> row3 = new Vector<String>();
		row3.add("Magdalena");
		row3.add("Wiśniewska");
		Vector<String> row4 = new Vector<String>();
		row4.add("Artur");
		row4.add("Górny");
		model.addRow(row1);
		model.addRow(row2);
		model.addRow(row3);
		model.addRow(row4);
		table = new JTable(model);
		table.setBorder(new LineBorder(new Color(0, 64, 128), 2, true));
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBorder(new LineBorder(new Color(0, 64, 128), 2, true));
		scrollPane.setBounds(10, 10, 286, 227);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Podaj imię");
		lblNewLabel.setBounds(306, 26, 82, 21);
		frame.getContentPane().add(lblNewLabel);
		
		name = new JTextField();
		name.setBounds(399, 27, 96, 19);
		frame.getContentPane().add(name);
		name.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Podaj nazwisko");
		lblNewLabel_1.setBounds(306, 74, 82, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		surname = new JTextField();
		surname.setBounds(399, 71, 96, 19);
		frame.getContentPane().add(surname);
		surname.setColumns(10);
		
		JButton btn = new JButton("Dodaj osobę");
		btn.setBounds(306, 133, 189, 21);
		frame.getContentPane().add(btn);
		btn.addActionListener(e->{
			if(!name.getText().isEmpty() && !surname.getText().isEmpty()) {
				Vector<String> row = new Vector<String>();
				row.add(name.getText());
				row.add(surname.getText());
				model.addRow(row);
			}
		});
		
		
		
	}
}
