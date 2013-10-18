package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JDialog;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MainDialog extends JDialog {

	public MainDialog(){
		super();
		
		add(new GamePanel());
		add(new JTextField(), BorderLayout.SOUTH);
		System.out.println(getLayout());
		
		setVisible(true);
		setSize(new Dimension(800, 500));
		setLocationRelativeTo(null);
		setBackground(Color.white);
		
	}
	
	
	
}
