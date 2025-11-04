package pl.kalisz.zste;

import java.awt.Color;
import java.awt.EventQueue;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class SprawdzianPoprawka {

	private JFrame frame;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SprawdzianPoprawka window = new SprawdzianPoprawka();
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
	public SprawdzianPoprawka() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(46, 54, 209));
		frame.setBounds(100, 100, 640, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		DefaultTableModel model = new DefaultTableModel(new Vector<>(Arrays.asList("Imię", "Nazwisko", "Wiek")), 0);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(79, 43, 463, 272);
		scrollPane.setBorder(new LineBorder(Color.red, 2, true));
		frame.getContentPane().add(scrollPane);
		List<String> rows = readRowsFromFile();
		rows.forEach(row->{
			String[] split = row.split(" ");
			model.addRow(split);
		});
		
	}
	
	private List<String> readRowsFromFile(){
		Path path = Paths.get("res/dane.txt");
		try {
			List<String> lines = Files.readAllLines(path);
			return lines;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
	
	public double suma(double a1, int n, double r) {
		return (2*a1 + (n-1)*r)/2*n;
	}
	
	//a1 = 5, r = 7   5, 12, 19, 26, 33, 40, 47, 54, 61
}
