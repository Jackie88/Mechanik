package Grafa;

import javax.swing.ImageIcon;

public class LampaLP extends Czesc{
	
	public LampaLP(String nazwa, int stan){
		
		super(nazwa, stan);
		
		switch(stan){
		case 1: img = new ImageIcon("img/lampagl.png").getImage(); break;
		case 2: img = new ImageIcon("img/lampagl2.png").getImage(); break;
		}
	}
	
	public String wyswietlStan(){
		String aktualny_stan = new String();
		switch(stan){
			case 1: aktualny_stan = "Lampa w porz¹dku"; break;
			case 2: aktualny_stan = "Zbita lampa, nie dobrze"; break;
		}
		return aktualny_stan;
	}
	public String napraw(){
		String wykonana_akcja = new String();
		switch(stan){
			case 1: wykonana_akcja = "Lampa w porz¹dku";break;
			case 2: wykonana_akcja = "Wymieni³em lampê";break;
		};
		this.stan = 1;
		this.img = new ImageIcon("img/lampagl.png").getImage();
		return wykonana_akcja;
	}
}