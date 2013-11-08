package Grafa;

import java.awt.*;
import java.awt.geom.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
import javax.swing.JPanel;
 
public class Mapa extends JPanel implements KeyListener {
	private Reka reka;
	private Czesc[][] czesci;
    public Mapa() {
        setPreferredSize(new Dimension(400, 400));
        reka = new Reka(5,5);
        czesci = new Czesc[20][20];
        czesci[10][10] = new Czesc("Nazwa",1,Color.BLUE);
        czesci[11][11] = new Czesc("Nazwa2",1,Color.RED);
        czesci[11][13] = new Czesc("Nazwa3",1,Color.GREEN);
        czesci[12][12] = new Czesc("Nazwa4",1,Color.BLUE);
    }
 
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
 
        Rectangle2D rectangle = new Rectangle2D.Double(0, 0, 399, 399);
        g2d.draw(rectangle);
        
        g.setColor(Color.lightGray);
        int a=20;
          
        for(int i=1; i<a; i++) {
        	g.drawLine(i*getWidth()/a, 0, i*getWidth()/a, getHeight());
            g.drawLine(0, i*getHeight()/a, getWidth(), i*getHeight()/a);
            for(int j=1; j<a; j++)
            	if (czesci[i][j] != null){
            		g.setColor(czesci[i][j].getColor());
            		g.drawRoundRect((i-1)*getWidth()/a, (j-1)*getHeight()/a, 18, 18,5,5);
            	}
            g.setColor(Color.lightGray);
        }
        g.setColor(Color.orange);
        g.fillRoundRect((reka.getX()-1)*getWidth()/a, (reka.getY()-1)*getHeight()/a, 18, 18, 5, 5);
    }
    @Override
	public void keyPressed(KeyEvent e) {
    	switch (e.getKeyCode()) {
        case KeyEvent.VK_DOWN : reka.decrementX(); break;
        case KeyEvent.VK_UP : reka.incrementX(); break;
        case KeyEvent.VK_LEFT : reka.decrementY(); break;
        case KeyEvent.VK_RIGHT : reka.incrementY(); break;
		}
		validate();
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
        case KeyEvent.VK_DOWN : reka.decrementX(); break;
        case KeyEvent.VK_UP : reka.incrementX(); break;
        case KeyEvent.VK_LEFT : reka.decrementY(); break;
        case KeyEvent.VK_RIGHT : reka.incrementY(); break;
		}
		validate();
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent evt) {

	}
}
