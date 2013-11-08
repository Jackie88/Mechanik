package Grafa;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Reka implements KeyListener{
	private int x,y;
	
	public Reka(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	int getX(){return x;}
	int getY(){return y;}
	
	void setX(int x){
		this.x = x; 
		if(this.x>20) 
			x=20;
		if(this.x<1) 
			x=1;
	}
	void setY(int y){
		this.y = y; 
		if(this.y>20) 
			y=20;
		if(this.y<1) 
			y=1;
	}
	void incrementX(){
		x++; 
		if(x>20) 
			x=20;
		if(x<1) 
			x=1;
	}
	void incrementY(){
		this.y++; 
		if(this.y>20) 
			y=20;
		if(this.y<1) 
			y=1;
	}
	void decrementX(){
		this.x--; 
		if(this.x>20) 
			x=20;
		if(this.x<1) 
			x=1;
	}
	void decrementY(){
		this.y--; 
		if(this.y>20) 
			y=20;
		if(this.y<1) 
			y=1;
	}
	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		switch (e.getKeyCode()) {
        case KeyEvent.VK_DOWN : this.decrementX(); break;
        case KeyEvent.VK_UP : this.incrementX(); break;
        case KeyEvent.VK_LEFT : this.decrementY(); break;
        case KeyEvent.VK_RIGHT : this.incrementY(); break;
		}
	}

	@Override
	public void keyTyped(KeyEvent evt) {

	}
}
