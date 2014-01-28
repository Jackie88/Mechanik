package Grafa;

import java.awt.*;

import CommandFinder.fileReader;

//import javax.swing.ImageIcon;

public abstract class Czesc {
	
	int stan,idx;
	String nazwa;
	Image img;
	String[] komunikatyStanu1;
	String[] komunikatyStanu2;
	String[] komunikatyNaprawy1;
	String[] komunikatyNaprawy2;
	
	fileReader plikStanu;
	fileReader plikNaprawy;
	
	public Czesc(String nazwa, int stan){
		this.nazwa = nazwa;
		this.stan = stan;
		plikStanu = new fileReader("texts/komunikaty.txt");
		plikNaprawy = new fileReader("texts/naprawy.txt");
	}
	
	public abstract String wyswietlStan();
	public abstract String napraw();
	
	public Image getImage(){return img;}

}
