package Grafa;

import java.awt.Color;

import javax.swing.ImageIcon;

public class Kolo extends Czesc{
	
	public Kolo(String nazwa, int stan){
		
		super(nazwa, stan);
		
		switch(stan){
		case 1: img = new ImageIcon("img/opona.png").getImage(); break;
		case 2: img = new ImageIcon("img/opona2.png").getImage(); break;
		case 3: img = new ImageIcon("img/opona3.png").getImage(); break;
		}
	}
	
	public String wyswietlStan(){
		String aktualny_stan = new String();
		switch(stan){
			case 1: aktualny_stan = "Koło jest okrągłe, można jechać!;)"; break;
			case 2: aktualny_stan = "Weź gościu napompuj koło"; break;
			case 3: aktualny_stan = "Z tym się już nic nie zrobi, trzeba wymienić;/"; break;
		}
		return aktualny_stan;
	}
	public String napraw(){
		String wykonana_akcja = new String();
		switch(stan){
			case 1: wykonana_akcja = "Wszystko ok, nie musisz naprawiać";break;
			case 2: wykonana_akcja = "Nadmuchałem koło";break;
			case 3: wykonana_akcja = "Koło wymienione, można jechać:)";break;
		};
		this.img=  new ImageIcon("img/opona.png").getImage();
		return wykonana_akcja;
	}
}
