package GUI;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Konsola extends JTextArea {

	public Konsola() {
		
		super("", 8,20);
		setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20) ,BorderFactory.createLineBorder(Color.gray)));
		setFocusable(false);
		//setBackground(Color.black);
		//setForeground(Color.white);
		setLineWrap(true);
		
		
	}
	
	
}
