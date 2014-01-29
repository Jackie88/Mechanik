package CommandFinder;


public class LangInterpreter {
    public static String[] Interpret(String wprowadzonaKomenda)  { 

        String[] czesciZdania = wprowadzonaKomenda.split(",| i ");
        String[] action = new String[20];
        int licznik = 0;
        for(String i : czesciZdania){
        	String[] temp1 = stringOps.przygotujZdanie(i);
        	String[] temp2 = commandFinder.commandFinder(temp1);
        	String[] temp3 = null;
        	action[licznik]=temp2[0];
        	if (action[licznik].matches("0") && (action[licznik-2].matches("up") || action[licznik-2].matches("down") || action[licznik-2].matches("left") || action[licznik-2].matches("right"))){
        		temp3=directionFinder.findDirection(temp1);
        		action[licznik]=temp3[0];
        		action[licznik+1]=temp3[1];
        		}
        	else action[licznik+1]=temp2[1];
        	licznik=licznik+2;
        }
        
        for(String str : action){
        	System.out.println(str);
        }
        
		return action;}
    }