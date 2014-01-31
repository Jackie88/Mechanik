package Grafa;

import java.awt.*;

import CommandFinder.fileReader;

//import javax.swing.ImageIcon;

public abstract class Czesc {
	
	int stan,idx,id;
	boolean ifDraw;
	Image img;
	String[] komunikatyStanu1;
	String[] komunikatyStanu2;
	String[] komunikatyNaprawy1;
	String[] komunikatyNaprawy2;
	
	fileReader plikStanu;
	fileReader plikNaprawy;
	
	
	public Czesc(int stan, boolean b){
		ifDraw = b;
		this.stan = stan;
		plikStanu = new fileReader("texts/komunikaty.txt");
		plikNaprawy = new fileReader("texts/naprawy.txt");
	}
	
	public abstract String wyswietlStan();
	public abstract String napraw();
	
	public boolean getDraw() { return ifDraw; }
	
	public void changeIfDraw() { 
		ifDraw = !ifDraw;
		}
	
	public int getStan(){
		return stan;
	}
	
	public Image getImage(){return img;}

	public int getID(){return id;}
}
