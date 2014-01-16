package Grafa;

import javax.swing.ImageIcon;

public class Akumulator extends Czesc{
	
	public Akumulator(String nazwa, int stan){
		
		super(nazwa, stan);
		
		switch(stan){
		case 1: img = new ImageIcon("img/akumulator.png").getImage(); break;
		case 2: img = new ImageIcon("img/akumulator2.png").getImage(); break;
		}
	}
	
	public String wyswietlStan(){
		String aktualny_stan = new String();
		switch(stan){
			case 1: aktualny_stan = "Akumulator jest na�adowany."; break;
			case 2: aktualny_stan = "Roz�adowany akumulator, trzeba na�adowa�."; break;
		}
		return aktualny_stan;
	}
	public String napraw(){
		String wykonana_akcja = new String();
		switch(stan){
			case 1: wykonana_akcja = "Z akumulatorem wszystko ok";break;
			case 2: wykonana_akcja = "Pod��czy�em akumulator, zaraz b�dzie na�adowany";break;
		};
		this.stan = 1;
		this.img = new ImageIcon("img/akumulator.png").getImage();
		return wykonana_akcja;
	}
}