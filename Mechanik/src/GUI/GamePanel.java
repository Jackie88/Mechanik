package GUI;

import Grafa.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
 
@SuppressWarnings("serial")
public class GamePanel extends JPanel implements KeyListener {
	
	public Reka reka;
	private Czesc[][] czesci;
	private static int w,h,a=10;
	private ImageIcon icon;
	
   
	public GamePanel() {
 
		JLabel lab = new JLabel(icon);
		add(lab);
		
        reka = new Reka(this,5,5);
        czesci = new Czesc[a][a];
        czesci[5][3] = new Kolo(2);
        czesci[5][7] = new Kolo(1);
        czesci[8][3] = new Kolo(2);
        czesci[8][7] = new Kolo(3);
        czesci[6][4] = new Akumulator(2);
        czesci[5][2] = new LampaLP(1);
        czesci[8][2] = new LampaPP(2);
        czesci[5][8] = new LampaLT(2);
        czesci[8][8] = new LampaPT(1);
        czesci[6][2] = new Tlumik(2);
        czesci[6][6] = new Silnik(1);
        czesci[7][4] = new Bak(2);
        
        czesci[2][2] = new Kolo(1);
        czesci[2][3] = new Akumulator(1);
        czesci[2][4] = new LampaLP(1);
        czesci[2][5] = new Tlumik(1);
        czesci[2][6] = new Silnik(1);
        czesci[2][7] = new Bak(1);
        
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
	
	public static int getW() {
		return w;
	}
	
	public static int getH() {
		return h;
	}
	
	public Czesc[][] getCzesci()  {
		return czesci;
	}
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        w= getWidth();
        h=getHeight();
        //rysuje t�o i podwozie
        g.drawImage((new ImageIcon(new Resize().resize("img/tlo2.jpg", getWidth(),getHeight(),true))).getImage(),0, 0, null); 
        g.drawImage(new ImageIcon(new Resize().resize("img/podwozie2.png", 4*getWidth()/a,7*getHeight()/a,true)).getImage(), 4*getWidth()/a, getHeight()/a, null);
        g.drawImage(new ImageIcon(new Resize().resize("img/smietnik.png", 1*(getWidth()/a),1*(getHeight()/a),true)).getImage(), 2*getWidth()/a,8*getHeight()/a, null);
               
        for(int i=1; i<a; i++) {
        	g.setColor(Color.darkGray);
        	//g.drawLine(i*getWidth()/a, 0, i*getWidth()/a, getHeight());
            //g.drawLine(0, i*getHeight()/a, getWidth(), i*getHeight()/a);
            
           for(int j=1; j<a; j++)
            	if (czesci[i][j] != null && czesci[i][j].getDraw()){
            		g.drawImage((new ImageIcon(new Resize().resize(czesci[i][j].getImage(), getWidth()/a,getHeight()/a,true))).getImage(),(i-1)*getWidth()/a, (j-1)*getHeight()/a, null);
            		
            	} else {
            		if (czesci[i][j] != null) {
            			
            		}
            	}
            g.setColor(Color.lightGray);
            
        }
        
    	//rysuje obrazek lapki
    	icon = new ImageIcon(new Resize().resize("img/reka.png", getWidth()/a-10,getHeight()/a-10,true));
    	int x = (reka.getX()-1)*getWidth()/a+5;
    	int y= (reka.getY()-1)*getHeight()/a+5;
    	 
        g.drawImage(reka.getImg(),x,y, null);
        g.drawImage(icon.getImage(), x,y, null);
        
        
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
