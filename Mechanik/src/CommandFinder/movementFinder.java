package CommandFinder;

public class movementFinder {
	public static int findMovement(String[] Zdanie){
		int koordynaty = 0;
		
		for(String s1 : Zdanie){
			if(s1.matches("id�"))
				for(String s2 : Zdanie)
					switch(s2){
					case "g�r�": koordynaty=1;
					break;
					case "prawo": koordynaty=2;
					break;
					case "d�": koordynaty=3;
					break;
					case "lewo": koordynaty=4;
					break;
					//default: koordynaty=0; break;}
		}}
		return koordynaty;}}

