package Grafa;

import GUI.GamePanel;
import GUI.MainDialog;

public class Reka{
	
	private GamePanel panel;
	private int x,y,k;
	
	public Reka(GamePanel temp, int a, int b){
		x = a;
		y = b;
		k=GamePanel.getA();
		
		panel=temp;
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
	
	public void napraw(){
		Czesc [] [] czesci =  panel.getCzesci();
		
		if(czesci[getX()][getY()]!=null) {
			czesci[getX()][getY()].napraw();
			MainDialog.getKonsola().append("Mechanik: "+czesci[getX()][getY()].napraw()+"\n");
		}
	}
	public void sprawdz(){
		Czesc [] [] czesci =  panel.getCzesci();
		
		if(czesci[getX()][getY()]!=null) {	
			czesci[getX()][getY()].wyswietlStan();
			MainDialog.getKonsola().append("Mechanik: "+czesci[getX()][getY()].wyswietlStan()+"\n");
		}
	}
}