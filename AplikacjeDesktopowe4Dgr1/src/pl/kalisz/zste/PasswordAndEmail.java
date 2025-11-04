package pl.kalisz.zste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class PasswordAndEmail {

	private JFrame frmResetHasa;
	private JTextField email;
	private JPasswordField pass;
	private JPasswordField repeatPass;
	private JTextField message;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordAndEmail window = new PasswordAndEmail();
					window.frmResetHasa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PasswordAndEmail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmResetHasa = new JFrame();
		frmResetHasa.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 16));
		frmResetHasa.setTitle("Reset hasła");
		frmResetHasa.setBounds(100, 100, 384, 548);
		frmResetHasa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmResetHasa.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Resetuj konto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(64, 128, 128));
		lblNewLabel.setBounds(0, 0, 370, 49);
		frmResetHasa.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Podaj email");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(0, 53, 370, 32);
		frmResetHasa.getContentPane().add(lblNewLabel_1);
		
		email = new JTextField();
		email.setFont(new Font("Tahoma", Font.PLAIN, 16));
		email.setBounds(0, 95, 370, 35);
		frmResetHasa.getContentPane().add(email);
		email.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Podaj hasło");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(0, 137, 370, 32);
		frmResetHasa.getContentPane().add(lblNewLabel_2);
		
		pass = new JPasswordField();
		pass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pass.setBounds(0, 179, 370, 35);
		frmResetHasa.getContentPane().add(pass);
		
		JLabel lblNewLabel_3 = new JLabel("Powtórz hasło");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(0, 224, 370, 40);
		frmResetHasa.getContentPane().add(lblNewLabel_3);
		
		repeatPass = new JPasswordField();
		repeatPass.setBounds(0, 274, 370, 35);
		frmResetHasa.getContentPane().add(repeatPass);
		
		JButton save = new JButton("Zatwierdź");
		save.setFont(new Font("Tahoma", Font.PLAIN, 14));
		save.setBounds(133, 327, 99, 39);
		save.addActionListener(e->{
			String emailText = email.getText();
			if(!emailText.contains("@")) {
				message.setText("Niepoprawny email");
			}else if(!pass.getText().equals(repeatPass.getText()) || (pass.getText().isEmpty() || repeatPass.getText().isEmpty())) {
				message.setText("Hasła się różnią");
			}else {
				message.setText("Witaj "+emailText);
			}
			
		});
		frmResetHasa.getContentPane().add(save);
		
		message = new JTextField();
		message.setEditable(false);
		message.setBounds(60, 405, 247, 19);
		frmResetHasa.getContentPane().add(message);
		message.setColumns(10);
	}
}
