package Grafa;

import javax.swing.ImageIcon;

public class Bak extends Czesc{
	
	public Bak(String nazwa, int stan){
		
		super(nazwa, stan);
		
		switch(stan){
		case 1: img = new ImageIcon("img/bak.png").getImage(); break;
		case 2: img = new ImageIcon("img/bak2.png").getImage(); break;
		}
	}
	
	public String wyswietlStan(){
		String aktualny_stan = new String();
		switch(stan){
			case 1: aktualny_stan = "Bak ok, mo¿na tankowaæ."; break;
			case 2: aktualny_stan = "Dziura w baku!"; break;
		}
		return aktualny_stan;
	}
	public String napraw(){
		String wykonana_akcja = new String();
		switch(stan){
			case 1: wykonana_akcja = "Bak ok";break;
			case 2: wykonana_akcja = "Dziura w baku zalepiona";break;
		};
		this.stan = 1;
		this.img = new ImageIcon("img/bak.png").getImage();
		return wykonana_akcja;
	}
}