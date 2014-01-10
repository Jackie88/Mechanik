package Grafa;

import java.awt.*;

import javax.swing.ImageIcon;

public abstract class Czesc {
	
	int stan;
	String nazwa;
	Image img;
	
	public Czesc(String nazwa, int stan){
		this.nazwa = nazwa;
		this.stan = stan;
	}
	
	public abstract String wyswietlStan();
	public abstract String napraw();
	
	public Image getColor(){return img;}

}
