package Grafa;

import java.awt.Image;

import GUI.GamePanel;
import GUI.MainDialog;

public class Reka{
	
	private GamePanel panel;
	private int x,y,k, id;
	Image part;
	
	public Reka(GamePanel temp, int a, int b){
		id=0;
		x = a;
		y = b;
		k=GamePanel.getA();
		part=null;
		panel=temp;
	}
	
	public int getX(){return x;}
	public int getY(){return y;}
	
	public int getID() {return id;}
	public void setID(int i) { id = i;}
	
	public void setImg(Image i) {
		part = i;
	}
	
	public void resetImg()
	{
		part=null;
	}
	public Image getImg() {
		return part;
	}
	
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
			//czesci[getX()][getY()].napraw();
			MainDialog.getKonsola().append("Mechanik: "+czesci[getX()][getY()].napraw()+"\n");
			part=null;
			id=0;
			czesci[getX()][getY()].ifDraw=true;
		}
	}
	public void sprawdz(){
		Czesc [] [] czesci =  panel.getCzesci();
		
		if(czesci[getX()][getY()]!=null) {	
			//czesci[getX()][getY()].wyswietlStan();
			MainDialog.getKonsola().append("Mechanik: "+czesci[getX()][getY()].wyswietlStan()+"\n");
		}
	}
}