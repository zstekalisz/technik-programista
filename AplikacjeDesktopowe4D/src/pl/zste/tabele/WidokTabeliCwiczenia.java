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
import java.awt.Color;

public class WidokTabeliCwiczenia {

	private JFrame frame;
	private JTable table;

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
		List<Osoba> list = new ArrayList<Osoba>();
		list.add(o1);
		list.add(o2);
		list.add(o3);
		Object[][] dataSource = Osoba.convertData(list);
		table = new JTable(dataSource, columnNames);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		JScrollPane scrollPane = new JScrollPane(table);
		left.add(scrollPane);
		
		JPanel right = new JPanel();
		right.setBounds(341, 10, 321, 383);
		frame.getContentPane().add(right);
		
	}
}
