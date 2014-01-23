package Grafa;

import javax.swing.ImageIcon;

public class Tlumik extends Czesc{
	
	public Tlumik(String nazwa, int stan){
		
		super(nazwa, stan);
		
		switch(stan){
		case 1: img = new ImageIcon("img/tlumik.png").getImage(); break;
		case 2: img = new ImageIcon("img/tlumik.png").getImage(); break;
		}
	}
	
	public String wyswietlStan(){
		String aktualny_stan = new String();
		switch(stan){
			case 1: aktualny_stan = "Z t³umikiem wszystko w porz¹dku"; break;
			case 2: aktualny_stan = "Dziura w tlumiku!"; break;
		}
		return aktualny_stan;
	}
	public String napraw(){
		String wykonana_akcja = new String();
		switch(stan){
			case 1: wykonana_akcja = "Tlumik ok";break;
			case 2: wykonana_akcja = "Wymieni³em tlumik";break;
		};
		this.stan = 1;
		this.img = new ImageIcon("img/tlumik.png").getImage();
		return wykonana_akcja;
	}
}