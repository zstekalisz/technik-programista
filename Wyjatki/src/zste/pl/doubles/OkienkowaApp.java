package zste.pl.doubles;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import zste.pl.wyjatki.MojWyjatek;

public class OkienkowaApp implements ActionListener{
	
	private JTextField linijkaTestu = null;
	private JFrame okno;

	public OkienkowaApp() {
		okno = new JFrame("tytu³ okna");
		okno.setSize(800, 500);
		okno.setVisible(true);
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setLocation(300, 200);
		okno.setLayout(new BorderLayout());
		JButton przycisk1 = new JButton("Klik1");
		przycisk1.setForeground(Color.blue);
		okno.add(przycisk1, BorderLayout.NORTH);
		linijkaTestu = new JTextField("Tekst startowy");
		okno.add(linijkaTestu, BorderLayout.CENTER);
		przycisk1.addActionListener(this);

	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new OkienkowaApp(); 
				
			}
		});

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			WylapywanieBledow.konwersja(linijkaTestu.getText());
		} catch (MojWyjatek ex) {
			JOptionPane.showMessageDialog(okno, "B³êdny paramatr "+ex.getMessage() +" "+ ex.getCause().getMessage(), "B³¹d", JOptionPane.ERROR_MESSAGE);
		}	
	}

}
