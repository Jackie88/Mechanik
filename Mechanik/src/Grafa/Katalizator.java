package Grafa;

import javax.swing.ImageIcon;

public class Katalizator extends Czesc{
	
	public Katalizator(String nazwa, int stan){
		
		super(nazwa, stan);
		
		switch(stan){
		case 1: img = new ImageIcon("img/katalizator.png").getImage(); break;
		case 2: img = new ImageIcon("img/katalizator2.png").getImage(); break;
		}
	}
	
	public String wyswietlStan(){
		String aktualny_stan = new String();
		switch(stan){
			case 1: aktualny_stan = "Z katalizatorem wszystko ok"; break;
			case 2: aktualny_stan = "Coœ tu jest nie tak z tym katalizatorem"; break;
		}
		return aktualny_stan;
	}
	public String napraw(){
		String wykonana_akcja = new String();
		switch(stan){
			case 1: wykonana_akcja = "Z katalizatorem wszystko ok";break;
			case 2: wykonana_akcja = "Katalizator naprawiony, hurra:)";break;
		};
		this.stan = 1;
		this.img = new ImageIcon("img/katalizator.png").getImage();
		return wykonana_akcja;
	}
}