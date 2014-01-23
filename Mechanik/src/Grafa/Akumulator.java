package Grafa;

import javax.swing.ImageIcon;

public class Akumulator extends Czesc{
	
	public Akumulator(String nazwa, int stan){
		
		super(nazwa, stan);
		
		switch(stan){
		case 1: img = new ImageIcon("img/aku.png").getImage(); break;
		case 2: img = new ImageIcon("img/aku2.png").getImage(); break;
		}
	}
	
	public String wyswietlStan(){
		String aktualny_stan = new String();
		switch(stan){
			case 1: aktualny_stan = "Akumulator jest naładowany."; break;
			case 2: aktualny_stan = "Rozładowany akumulator, trzeba naładować."; break;
		}
		return aktualny_stan;
	}
	public String napraw(){
		String wykonana_akcja = new String();
		switch(stan){
			case 1: wykonana_akcja = "Z akumulatorem wszystko ok";break;
			case 2: wykonana_akcja = "Podłączyłem akumulator, zaraz będzie naładowany";break;
		};
		this.stan = 1;
		this.img = new ImageIcon("img/aku2.png").getImage();
		return wykonana_akcja;
	}
}