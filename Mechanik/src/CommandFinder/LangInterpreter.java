package CommandFinder;


public class LangInterpreter {
    public static String[] Interpret(String wprowadzonaKomenda)  { 

        String[] czesciZdania = wprowadzonaKomenda.split(",");
        String[] action = new String[20];
        int licznik = 0;
        for(String i : czesciZdania){
        	String[] temp1 = stringOps.przygotujZdanie(i);
        	String[] temp2 = commandFinder.commandFinder(temp1);
        	action[licznik]=temp2[0];
        	action[licznik+1]=temp2[1];
        	licznik=licznik+2;
        	
        }
        
        for(String str : action){
        	System.out.println(str);
        }
        
		return action;}
    }