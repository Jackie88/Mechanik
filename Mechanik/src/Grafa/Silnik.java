package Grafa;

import javax.swing.ImageIcon;

public class Silnik extends Czesc{
	
	public Silnik(String nazwa, int stan){
		
		super(nazwa, stan);
		
		switch(stan){
		case 1: img = new ImageIcon("img/silnik.png").getImage(); break;
		case 2: img = new ImageIcon("img/silnik2.png").getImage(); break;
		}
	}
	
	public String wyswietlStan(){
		String aktualny_stan = new String();
		switch(stan){
			case 1: aktualny_stan = "Silnik sprawny, odpalaj!"; break;
			case 2: aktualny_stan = "Zepsuty silnik, trzeba coœ z tym zrobiæ."; break;
		}
		return aktualny_stan;
	}
	public String napraw(){
		String wykonana_akcja = new String();
		switch(stan){
			case 1: wykonana_akcja = "Wszystko ok, nie musisz naprawiaæ";break;
			case 2: wykonana_akcja = "Naprawi³em silnik";break;
		};
		this.stan = 1;
		this.img = new ImageIcon("img/silnik.png").getImage();
		return wykonana_akcja;
	}
}