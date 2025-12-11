package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JButton;

public class KoloryRGB {

	private JFrame frame;
	private JTextField result;
	private int red = 255;
	private int green = 255;
	private int blue = 255;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KoloryRGB window = new KoloryRGB();
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
	public KoloryRGB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 248, 220));
		frame.setBounds(100, 100, 450, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel box = new JPanel();
		box.setBackground(new Color(255, 255, 255));
		box.setBounds(45, 10, 357, 45);
		frame.getContentPane().add(box);
		
		JLabel lblNewLabel = new JLabel("Dobierz kolor suwakami i zapisz przyciskiem:");
		lblNewLabel.setBounds(46, 79, 317, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JSlider redSlider = new JSlider();
		redSlider.setMaximum(255);
		redSlider.setValue(255);
		redSlider.setBackground(new Color(255, 248, 220));
		redSlider.setBounds(83, 120, 280, 25);
		frame.getContentPane().add(redSlider);
		
		JLabel lblNewLabel_1 = new JLabel("R:");
		lblNewLabel_1.setBounds(23, 120, 44, 25);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel redLabel = new JLabel("255");
		redLabel.setBounds(373, 125, 25, 12);
		frame.getContentPane().add(redLabel);
		
		JLabel lblNewLabel_2 = new JLabel("G:");
		lblNewLabel_2.setBounds(23, 160, 44, 12);
		frame.getContentPane().add(lblNewLabel_2);
		
		JSlider greenSlider = new JSlider();
		greenSlider.setMaximum(255);
		greenSlider.setValue(255);
		greenSlider.setBackground(new Color(255, 248, 220));
		greenSlider.setBounds(83, 155, 280, 25);
		frame.getContentPane().add(greenSlider);
		
		JLabel greenLabel = new JLabel("255");
		greenLabel.setBounds(373, 160, 25, 12);
		frame.getContentPane().add(greenLabel);
		
		JLabel lblNewLabel_4 = new JLabel("B:");
		lblNewLabel_4.setBounds(23, 195, 17, 12);
		frame.getContentPane().add(lblNewLabel_4);
		
		JSlider blueSlider = new JSlider();
		blueSlider.setMaximum(255);
		blueSlider.setValue(255);
		blueSlider.setBackground(new Color(255, 248, 220));
		blueSlider.setBounds(83, 190, 280, 25);
		frame.getContentPane().add(blueSlider);
		
		JLabel blueLabel = new JLabel("255");
		blueLabel.setBounds(373, 195, 25, 12);
		frame.getContentPane().add(blueLabel);
		
		result = new JTextField();
		result.setText("255, 255, 255");
		result.setEditable(false);
		result.setBackground(new Color(255, 255, 255));
		result.setBounds(177, 278, 96, 18);
		frame.getContentPane().add(result);
		result.setColumns(10);
		
		JButton pobierz = new JButton("Pobierz");
		pobierz.setBackground(new Color(205, 133, 63));
		pobierz.setBounds(177, 237, 96, 20);
		frame.getContentPane().add(pobierz);
		
		redSlider.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				red  = redSlider.getValue();
				redLabel.setText(String.valueOf(red));
				box.setBackground(new Color(red, green, blue));
			}
		});
		greenSlider.addChangeListener(e->{
			green = greenSlider.getValue();
			greenLabel.setText(String.valueOf(green));
			box.setBackground(new Color(red, green, blue));
		});
		blueSlider.addChangeListener(e->{
			blue = blueSlider.getValue();
			blueLabel.setText(String.valueOf(blue));
			box.setBackground(new Color(red, green, blue));
		});
		
		pobierz.addActionListener(e->{
			result.setBackground(new Color(red, green, blue));
			result.setText(String.valueOf(red)+", "+ String.valueOf(green)+ ", "+String.valueOf(blue));
		});
	}
}
