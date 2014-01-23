package Grafa;

import javax.swing.ImageIcon;

public class LampaPT extends Czesc{
	
	public LampaPT(String nazwa, int stan){
		
		super(nazwa, stan);
		
		switch(stan){
		case 1: img = new ImageIcon("img/lampadp.png").getImage(); break;
		case 2: img = new ImageIcon("img/lampadp2.png").getImage(); break;
		}
	}
	
	public String wyswietlStan(){
		String aktualny_stan = new String();
		switch(stan){
			case 1: aktualny_stan = "Lampa w porz�dku"; break;
			case 2: aktualny_stan = "Zbita lampa, nie dobrze"; break;
		}
		return aktualny_stan;
	}
	public String napraw(){
		String wykonana_akcja = new String();
		switch(stan){
			case 1: wykonana_akcja = "Lampa w porz�dku";break;
			case 2: wykonana_akcja = "Wymieni�em lamp�";break;
		};
		this.stan = 1;
		this.img = new ImageIcon("img/lampadp.png").getImage();
		return wykonana_akcja;
	}
}