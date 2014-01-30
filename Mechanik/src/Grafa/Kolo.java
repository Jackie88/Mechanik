package Grafa;

import java.io.IOException;
import java.util.Random;

import javax.swing.ImageIcon;


public class Kolo extends Czesc{
	
	String[] komunikatyStanu3;
	String[] komunikatyNaprawy3;
	
	public Kolo(int stan){
		
		super(stan, true);
		id=3;
		switch(stan){
		case 1: img = new ImageIcon("img/opona.png").getImage(); break;
		case 2: img = new ImageIcon("img/opona2.png").getImage(); break;
		case 3: img = new ImageIcon("img/opona3.png").getImage(); break;
		}
		try {
			komunikatyStanu1 = plikStanu.sectionFinder("KOLO_STAN_1");
			komunikatyStanu2 = plikStanu.sectionFinder("KOLO_STAN_2");
			komunikatyStanu3 = plikStanu.sectionFinder("KOLO_STAN_3");
			komunikatyNaprawy1 = plikNaprawy.sectionFinder("KOLO_STAN_1");
			komunikatyNaprawy2 = plikNaprawy.sectionFinder("KOLO_STAN_2");
			komunikatyNaprawy3 = plikNaprawy.sectionFinder("KOLO_STAN_3");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String wyswietlStan(){
		String aktualny_stan = new String();
		switch(stan){
			case 1: idx = new Random().nextInt(komunikatyStanu1.length); aktualny_stan = komunikatyStanu1[idx]; break;
			case 2: idx = new Random().nextInt(komunikatyStanu2.length); aktualny_stan = komunikatyStanu2[idx]; break;
			case 3: idx = new Random().nextInt(komunikatyStanu3.length); aktualny_stan = komunikatyStanu3[idx]; break;
		}
		return aktualny_stan;
	}
	public String napraw(){
		String wykonana_akcja = new String();
		System.out.println("-----------" + stan);
		switch(stan){
			case 1: idx = new Random().nextInt(komunikatyNaprawy1.length); wykonana_akcja = komunikatyNaprawy1[idx]; break;
			case 2: idx = new Random().nextInt(komunikatyNaprawy2.length); wykonana_akcja = komunikatyNaprawy2[idx]; break;
			case 3: idx = new Random().nextInt(komunikatyNaprawy3.length); wykonana_akcja = komunikatyNaprawy3[idx]; break;
		};
		this.stan = 1;
		this.img = new ImageIcon("img/opona.png").getImage();
		return wykonana_akcja;
	}
}
