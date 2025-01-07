package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ElementyWidoku {

	private JFrame frmCwiczeniaAppdesktop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ElementyWidoku window = new ElementyWidoku();
					window.frmCwiczeniaAppdesktop.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ElementyWidoku() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCwiczeniaAppdesktop = new JFrame();
		frmCwiczeniaAppdesktop.setTitle("Cwiczenia AppDesktop");
		frmCwiczeniaAppdesktop.setBounds(100, 100, 450, 300);
		frmCwiczeniaAppdesktop.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCwiczeniaAppdesktop.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Podaj imię");
		lblNewLabel.setBounds(38, 34, 112, 31);
		frmCwiczeniaAppdesktop.getContentPane().add(lblNewLabel);
	}
}
