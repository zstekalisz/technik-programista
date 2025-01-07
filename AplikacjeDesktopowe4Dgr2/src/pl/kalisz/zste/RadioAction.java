package pl.kalisz.zste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class RadioAction implements ActionListener {
	
	private JLabel image = null;
	

	public RadioAction(JLabel image) {
		this.image = image;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		switch(command) {
		case "r1":
			ImageIcon icon = new ImageIcon("res/kostka3.png");
			image.setIcon(icon);
			break;
		case "r2":
			ImageIcon icon2 = new ImageIcon("res/kostka2.png");
			image.setIcon(icon2);
			break;
		case "r3":
			ImageIcon icon3 = new ImageIcon("res/kostka1.png");
			image.setIcon(icon3);
			break;
		}
		
	}

}
