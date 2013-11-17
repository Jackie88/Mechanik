package GUI;

import Grafa.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
 
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements KeyListener {
	
	private Reka reka;
	private Czesc[][] czesci;
	private static int a=15;
   
	public GamePanel() {
       
		//setPreferredSize(new Dimension(400, 400));
		
        reka = new Reka(5,5);
        czesci = new Czesc[a][a];
        czesci[5][8] = new Czesc("Nazwa",1,Color.BLUE);
        czesci[6][9] = new Czesc("Nazwa2",1,Color.RED);
        czesci[10][4] = new Czesc("Nazwa3",1,Color.GREEN);
        czesci[3][6] = new Czesc("Nazwa4",1,Color.BLUE);
        
        setBorder(BorderFactory.createLoweredBevelBorder());
        setFocusable(true);
        addKeyListener(this);
        requestFocus();
        
    }
 
	public static int getA() {
		return a;
	}
	
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
         
        g.setColor(Color.lightGray);
          
        for(int i=1; i<a; i++) {
        	g.drawLine(i*getWidth()/a, 0, i*getWidth()/a, getHeight());
            g.drawLine(0, i*getHeight()/a, getWidth(), i*getHeight()/a);
            for(int j=1; j<a; j++)
            	if (czesci[i][j] != null){
            		g.setColor(czesci[i][j].getColor());
            		g.drawRoundRect((i-1)*getWidth()/a+2, (j-1)*getHeight()/a+2, getWidth()/a-4, getHeight()/a-4,5,5);
            	}
            g.setColor(Color.lightGray);
            
        }
        
        g.setColor(Color.orange);
        g.fillRoundRect((reka.getX()-1)*getWidth()/a+5, (reka.getY()-1)*getHeight()/a+5, getWidth()/a-10, getHeight()/a-10, 5, 5);
    }
    @Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
        case KeyEvent.VK_DOWN : reka.incrementY(); break;
        case KeyEvent.VK_UP : reka.decrementY(); break;
        case KeyEvent.VK_LEFT : reka.decrementX(); break;
        case KeyEvent.VK_RIGHT : reka.incrementX(); break;
		}
		validate();
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent evt) {

	}
}
