package pl.kalisz.zste;

import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import pl.kalisz.zste.egzamin.konsola.SzyfrCezaraGr2;

import javax.swing.JTextArea;

public class SzyfrCezaraGUI {

	private JFrame frame;
	private JTextField key;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SzyfrCezaraGUI window = new SzyfrCezaraGUI();
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
	public SzyfrCezaraGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton crypt = new JButton("Zaszyfruj");
		crypt.setBounds(169, 90, 101, 20);
		frame.getContentPane().add(crypt);
		
		key = new JTextField();
		key.setBounds(35, 30, 96, 18);
		frame.getContentPane().add(key);
		key.setColumns(10);
		
		JTextArea primary = new JTextArea();
		primary.setBounds(22, 119, 137, 107);
		frame.getContentPane().add(primary);
		
		JTextArea crypted = new JTextArea();
		crypted.setBounds(293, 32, 150, 121);
		frame.getContentPane().add(crypted);
		
		JButton save = new JButton("Zapisz do pliku");
		save.setBounds(293, 191, 150, 20);
		frame.getContentPane().add(save);
		
		crypt.addActionListener(e->{
			String primaryText = primary.getText();
			Integer keyInt = Integer.valueOf(key.getText());
			String cryptedText = SzyfrCezaraGr2.crypt(primaryText.split(""), keyInt);
			crypted.setText(cryptedText);
			
			
		});
		save.addActionListener(e->{
			JFileChooser chooser = new JFileChooser();
			int windowState = chooser.showSaveDialog(frame);
			if(windowState == JFileChooser.APPROVE_OPTION) {
				File file = chooser.getSelectedFile();
				byte[] bytes = crypted.getText().getBytes();
				try {
					Files.write(file.toPath(), bytes);
					throw new IOException();
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(frame, "Błąd zapisu do pliku");
					
				}
				
			}
			
		});
		
	}
}
