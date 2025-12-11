package pl.zste.desktop.cwiczenia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class EgzaminCzerwiec2025 {

	private JFrame frame;
	private JTextField result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EgzaminCzerwiec2025 window = new EgzaminCzerwiec2025();
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
	public EgzaminCzerwiec2025() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 248, 220));
		frame.setBounds(100, 100, 450, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(33, 10, 365, 46);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel(" Dobierz kolor suwakami i zapisz przyciskiem");
		lblNewLabel.setBounds(33, 71, 268, 12);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("R");
		lblNewLabel_1.setBounds(33, 110, 15, 12);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("G");
		lblNewLabel_2.setBounds(33, 150, 15, 12);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("B");
		lblNewLabel_3.setBounds(32, 190, 15, 12);
		frame.getContentPane().add(lblNewLabel_3);
		
		JSlider redSlider = new JSlider();
		redSlider.setBackground(new Color(255, 248, 220));
		redSlider.setMaximum(255);
		redSlider.setValue(255);
		redSlider.setBounds(71, 100, 300, 25);
		frame.getContentPane().add(redSlider);
		
		JSlider greenSlider = new JSlider();
		greenSlider.setBackground(new Color(255, 248, 220));
		greenSlider.setMaximum(255);
		greenSlider.setValue(255);
		greenSlider.setBounds(71, 140, 300, 25);
		frame.getContentPane().add(greenSlider);
		
		JSlider blueSlider = new JSlider();
		blueSlider.setBackground(new Color(255, 248, 220));
		blueSlider.setMaximum(255);
		blueSlider.setValue(255);
		blueSlider.setBounds(71, 180, 300, 25);
		frame.getContentPane().add(blueSlider);
		
		JLabel redLabel = new JLabel("255");
		redLabel.setBounds(381, 110, 44, 12);
		frame.getContentPane().add(redLabel);
		
		JLabel greenLabel = new JLabel("255");
		greenLabel.setBounds(381, 150, 44, 12);
		frame.getContentPane().add(greenLabel);
		
		JLabel blueLabel = new JLabel("255");
		blueLabel.setBounds(381, 190, 44, 12);
		frame.getContentPane().add(blueLabel);
		
		JButton pobierz = new JButton("Pobierz");
		pobierz.setBackground(new Color(192, 133, 63));
		pobierz.setBounds(173, 228, 84, 20);
		frame.getContentPane().add(pobierz);
		
		result = new JTextField();
		result.setText("255, 255, 255");
		result.setEditable(false);
		result.setBounds(141, 274, 147, 18);
		frame.getContentPane().add(result);
		result.setColumns(10);
		redSlider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				redLabel.setText(String.valueOf(redSlider.getValue()));
				panel.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
				
				
			}
		});
		greenSlider.addChangeListener(e->{
			greenLabel.setText(String.valueOf(greenSlider.getValue()));
			panel.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
		});
		blueSlider.addChangeListener(e->{
			blueLabel.setText(String.valueOf(blueSlider.getValue()));
			panel.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
		});
		pobierz.addActionListener(e->{
			result.setBackground(new Color(redSlider.getValue(), greenSlider.getValue(), blueSlider.getValue()));
			result.setText(String.valueOf(redSlider.getValue())+", "+ 
			String.valueOf(greenSlider.getValue())+", "+String.valueOf(blueSlider.getValue()));
		});
	}
}
