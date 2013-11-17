package Grafa;

import GUI.GamePanel;

public class Reka{
	
	private int x,y,k;
	
	public Reka(int a, int b){
		x = a;
		y = b;
		k=GamePanel.getA();
	}
	
	public int getX(){return x;}
	public int getY(){return y;}
	
	public void setX(int a){
		x = a; 
		if(x>k) 
			x=k;
		if(this.x<1) 
			x=1;
	}
	public void setY(int b){
		y = b; 
		if(this.y>k) 
			y=k;
		if(this.y<1) 
			y=1;
	}
	public void incrementX(){
		x++; 
		if(x>k || x<1) 
			x=1;
	}
	public void incrementY(){
		y++; 
		if(y>k || y<1) 
			y=1;
	}
	public void decrementX(){
		x--; 
		if(x<1) 
			x=k;
	}
	public void decrementY(){
		y--;
		if(y<1) 
			y=k;
}
}