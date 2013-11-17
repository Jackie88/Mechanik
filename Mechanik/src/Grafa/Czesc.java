package Grafa;

import java.awt.*;

public class Czesc {
	
	//private int x,y;
	private int stan;
	@SuppressWarnings("unused")
	private String nazwa;
	private Color kolor;
	
	public Czesc(String nazwa, int stan, Color kolor){
		this.nazwa = nazwa;
		this.stan = stan;
		this.kolor = kolor;
	}
	
	public String wyswietlStan(){
		String aktualny_stan = new String();
		if (stan==1) aktualny_stan = "Wszystko jest ok";
		if (stan==2) aktualny_stan = "Czesc jest zepsuta";
		return aktualny_stan;
	}
	public void napraw(){
		this.stan=1;
	}
	
	public Color getColor(){return kolor;}

}
