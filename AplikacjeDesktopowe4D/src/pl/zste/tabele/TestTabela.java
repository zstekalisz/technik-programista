package pl.zste.tabele;

import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class TestTabela {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestTabela window = new TestTabela();
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
	public TestTabela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Vector<String> data = new Vector<>();
		data.add("Test");
		data.add("Test1");
		//data.add(osoba2);
		Vector<String> columns = new Vector<>();
		columns.add("Imię");
		columns.add("Nazwisko");
		DefaultTableModel model = new DefaultTableModel(columns, 0);
		model.addRow(data);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(35, 22, 366, 214);
		frame.getContentPane().add(scrollPane);
	}
}
