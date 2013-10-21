package GUI;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {

	public GamePanel() {
		super();
		setName("Mechanik");
	}
	
	public void paint(Graphics g) {
	
	g.setColor(Color.lightGray);
	int a=20;
	 
	for(int i=1; i<a; i++) {
		g.drawLine(i*getWidth()/a, 0, i*getWidth()/a, getHeight());
		g.drawLine(0, i*getHeight()/a, getWidth(), i*getHeight()/a);
	}
	
	}
}
