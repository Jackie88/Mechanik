package CommandFinder;

public class movementFinder {
	public static int findMovement(String[] Zdanie){
		int koordynaty = 0;
		
		for(String s1 : Zdanie){
			if(s1.matches("idŸ"))
				for(String s2 : Zdanie)
					switch(s2){
					case "górê": koordynaty=1;
					break;
					case "prawo": koordynaty=2;
					break;
					case "dó³": koordynaty=3;
					break;
					case "lewo": koordynaty=4;
					break;
					//default: koordynaty=0; break;}
		}}
		return koordynaty;}}

