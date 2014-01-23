package GUI;


import Grafa.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.awt.image.BufferedImage;
//import java.awt.image.ImageObserver;
//import java.net.URL;

import java.awt.image.ImageObserver;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements KeyListener {
	
	public Reka reka;
	private Czesc[][] czesci;
	private static int a=10;
	private ImageIcon icon;
   
	public GamePanel() {
 
		JLabel lab = new JLabel(icon);
		add(lab);
		
        reka = new Reka(this,5,5);
        czesci = new Czesc[a][a];
        czesci[5][3] = new Kolo("Nazwa",2);
        czesci[5][7] = new Kolo("Nazwa2",2);
        czesci[8][3] = new Kolo("Nazwa3",3);
        czesci[8][7] = new Kolo("Nazwa4",1);
        czesci[6][4] = new Akumulator("Nazwa",2);
        czesci[5][2] = new LampaLP("Nazwa",2);
        czesci[8][2] = new LampaPP("Nazwa",2);
        czesci[5][8] = new LampaLT("Nazwa",2);
        czesci[8][8] = new LampaPT("Nazwa",2);
        czesci[6][2] = new Tlumik("Nazwa",2);
        czesci[6][6] = new Silnik("Nazwa",2);
        czesci[7][4] = new Bak("Nazwa",2);
        
        setBorder(BorderFactory.createLoweredBevelBorder());
        setFocusable(true);
        
        addKeyListener(this);
        requestFocus();
        
    }
 
	public static int getA() {
		return a;
	}
	
	public Reka getReka() {
		return reka;
	}
	
	public Czesc[][] getCzesci()  {
		return czesci;
	}
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        //rysuje t³o i podwozie
        g.drawImage((new ImageIcon(new Resize().resize("img/tlo2.jpg", getWidth(),getHeight(),true))).getImage(),0, 0, null);
        
        g.drawImage(new ImageIcon(new Resize().resize("img/podwozie2.png", 4*getWidth()/a,7*getHeight()/a,true)).getImage(), 4*getWidth()/a, getHeight()/a, null);
       
        for(int i=1; i<a; i++) {
        	g.setColor(Color.darkGray);
        	g.drawLine(i*getWidth()/a, 0, i*getWidth()/a, getHeight());
            g.drawLine(0, i*getHeight()/a, getWidth(), i*getHeight()/a);
            for(int j=1; j<a; j++)
            	if (czesci[i][j] != null){
            		g.drawImage((new ImageIcon(new Resize().resize(czesci[i][j].getImage(), getWidth()/a,getHeight()/a,true))).getImage(),(i-1)*getWidth()/a, (j-1)*getHeight()/a, null);
            		
            	}
            g.setColor(Color.lightGray);
            
        }
        
    	//rysuje obrazek lapki
    	icon = new ImageIcon(new Resize().resize("img/reka.png", getWidth()/a-10,getHeight()/a-10,true));
        g.drawImage(icon.getImage(), (reka.getX()-1)*getWidth()/a+5, (reka.getY()-1)*getHeight()/a+5, null);
        
        
        
    }
    @Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
		
		switch (e.getKeyCode()) {
		
        case KeyEvent.VK_DOWN :
        	reka.incrementY();
        	break;
        	
        case KeyEvent.VK_UP : 
        	reka.decrementY(); 
        	break;
        	
        case KeyEvent.VK_LEFT : 
        	reka.decrementX(); 
        	break;
        	
        case KeyEvent.VK_RIGHT : 
        	reka.incrementX(); 
        	break;
        case KeyEvent.VK_ENTER :
        	MainDialog.getKonsola().append("Mechanik: "+czesci[reka.getX()][reka.getY()].wyswietlStan()+"\n");
        	break;
        case KeyEvent.VK_SPACE :
        	MainDialog.getKonsola().append("Mechanik: "+czesci[reka.getX()][reka.getY()].napraw()+"\n");
        	break;
		}
		validate();
		repaint();
	}

	@Override
	public void keyTyped(KeyEvent evt) {

	}
	
	public int xxx(){
		return 5;
	}
}
