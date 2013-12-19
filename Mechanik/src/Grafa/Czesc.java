package Grafa;

import java.awt.*;

public abstract class Czesc {
	
	int stan;
	String nazwa;
	Color kolor;
	
	public Czesc(String nazwa, int stan){
		this.nazwa = nazwa;
		this.stan = stan;
	}
	
	public abstract String wyswietlStan();
	public abstract String napraw();
	
	public Color getColor(){return kolor;}

}
