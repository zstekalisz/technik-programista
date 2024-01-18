package pl.zste.desktop.cwiczenia;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class DomekWGorach implements ActionListener, WindowListener {

	private JFrame frame;
	private JButton likeButton;
	private JLabel messageFroUser;
	private int counter = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DomekWGorach window = new DomekWGorach();
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
	public DomekWGorach() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 670, 420);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addWindowListener(this);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Domek w górach");
		lblNewLabel.setForeground(new Color(80, 80, 80));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 20, 622, 25);
		frame.getContentPane().add(lblNewLabel);

		likeButton = new JButton("POLUB");
		likeButton.setActionCommand("add");
		likeButton.setBackground(new Color(0, 80, 80));
		likeButton.setForeground(new Color(255, 255, 255));
		likeButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		likeButton.setBounds(10, 71, 315, 37);
		likeButton.addActionListener(this);
		frame.getContentPane().add(likeButton);

		JButton deleteButton = new JButton("USUŃ");
		deleteButton.setActionCommand("delete");
		deleteButton.setBackground(new Color(0, 80, 80));
		deleteButton.setForeground(new Color(255, 255, 255));
		deleteButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		deleteButton.setBounds(323, 71, 309, 37);
		deleteButton.addActionListener(this);
		frame.getContentPane().add(deleteButton);

		//InputStream inputStream = frame.getClass().getClassLoader().getResourceAsStream("counter.txt");
		File file = new File("res/counter.txt");
		try {
			Scanner sc = new Scanner(file);
			if (sc.hasNextInt()) {
				counter = sc.nextInt();
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		messageFroUser = new JLabel(counter + " polubień");
		messageFroUser.setHorizontalAlignment(SwingConstants.RIGHT);
		messageFroUser.setForeground(new Color(80, 80, 80));
		messageFroUser.setFont(new Font("Tahoma", Font.PLAIN, 12));
		messageFroUser.setBounds(323, 124, 309, 19);
		frame.getContentPane().add(messageFroUser);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch (command) {
		case "add":
			counter++;
			messageFroUser.setText(counter + " polubień");
			break;
		case "delete":
			if (counter > 0) {
				counter--;
			}
			messageFroUser.setText(counter + " polubień");
			break;
		}

//		Object source = e.getSource();
//		if(source instanceof JButton && source == likeButton) {
//			
//		}

	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@SuppressWarnings("resource")
	@Override
	public void windowClosing(WindowEvent e) {
		File file = new File("res/counter.txt");
		try {
			FileWriter writer = new FileWriter(file, false);
			BufferedWriter bufferedWriter = new BufferedWriter(writer);
			bufferedWriter.write(String.valueOf(counter));
			bufferedWriter.close();
			writer.close();
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("Wyjście z programu");
		System.exit(0);			
	}

	@Override
	public void windowClosed(WindowEvent e) {
			
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
}
