package Grafa;

import java.io.IOException;
import java.util.Random;

import javax.swing.ImageIcon;

public class Akumulator extends Czesc{
	
	public Akumulator(int stan){
		
		super(stan, true);
		id=1;
		switch(stan){
		case 1: img = new ImageIcon("img/aku.png").getImage(); break;
		case 2: img = new ImageIcon("img/aku2.png").getImage(); break;
		}
		try {
			komunikatyStanu1 = plikStanu.sectionFinder("AKUMULATOR_STAN_1");
			komunikatyStanu2 = plikStanu.sectionFinder("AKUMULATOR_STAN_2");
			komunikatyNaprawy1 = plikNaprawy.sectionFinder("AKUMULATOR_STAN_1");
			komunikatyNaprawy2 = plikNaprawy.sectionFinder("AKUMULATOR_STAN_2");
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
		}
		return aktualny_stan;
	}
	public String napraw(){
		String wykonana_akcja = new String();
		switch(stan){
			case 1: idx = new Random().nextInt(komunikatyNaprawy1.length); wykonana_akcja = komunikatyNaprawy1[idx]; break;
			case 2: idx = new Random().nextInt(komunikatyNaprawy2.length); wykonana_akcja = komunikatyNaprawy2[idx]; break;
		};
		this.stan = 1;
		this.img = new ImageIcon("img/aku.png").getImage();
		return wykonana_akcja;
	}
}