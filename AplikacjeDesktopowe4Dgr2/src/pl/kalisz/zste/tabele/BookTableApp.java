package pl.kalisz.zste.tabele;

import java.awt.EventQueue;
import java.util.List;
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

public class BookTableApp {

	private JFrame frame;
	private JTable table;
	private JTextField title;
	private JTextField author;
	private JTextField publisher;
	private JTextField category;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookTableApp window = new BookTableApp();
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
	public BookTableApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 923, 583);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		Vector<String> columnNames = new Vector<>();
		columnNames.add("TYTUŁ");
		columnNames.add("AUTOR");
		columnNames.add("WYDAWNICTWO");
		columnNames.add("KATEGORIA");
		DefaultTableModel model = new DefaultTableModel(columnNames, 0);
		addBooksToTableModel(model);
		table = new JTable(model);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBorder(new LineBorder(new Color(255, 0, 0), 2));
		scrollPane.setBounds(10, 10, 623, 339);
		frame.getContentPane().add(scrollPane);
		
		JLabel lblNewLabel = new JLabel("Tytuł");
		lblNewLabel.setBounds(643, 13, 57, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Autor");
		lblNewLabel_1.setBounds(643, 54, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Wydawnictwo");
		lblNewLabel_2.setBounds(643, 92, 89, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Rodzaj");
		lblNewLabel_3.setBounds(643, 131, 45, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		title = new JTextField();
		title.setBounds(742, 10, 157, 19);
		frame.getContentPane().add(title);
		title.setColumns(10);
		
		author = new JTextField();
		author.setBounds(742, 51, 157, 19);
		frame.getContentPane().add(author);
		author.setColumns(10);
		
		publisher = new JTextField();
		publisher.setBounds(742, 89, 157, 19);
		frame.getContentPane().add(publisher);
		publisher.setColumns(10);
		
		category = new JTextField();
		category.setBounds(742, 128, 157, 19);
		frame.getContentPane().add(category);
		category.setColumns(10);
		
		JButton addBook = new JButton("Dodaj książkę");
		addBook.setForeground(new Color(255, 255, 255));
		addBook.setBackground(new Color(0, 0, 255));
		addBook.setBounds(643, 181, 256, 21);
		frame.getContentPane().add(addBook);
			
	}
	private void addBooksToTableModel(DefaultTableModel md) {
		List<Book> list = Book.getBooksSample();
		for(Book b : list) {
			Vector<String> rowForTable = b.createRowForTable();
			md.addRow(rowForTable);
		}
	}
}
