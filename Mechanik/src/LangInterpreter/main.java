package LangInterpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import StringOps.stringOps;
import CommandFinder.commandFinder;

public class main {
    public static void main(String[] args)  { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Wprowadz komende: \n");
        String wprowadzonaKomenda = "";
		try {
			wprowadzonaKomenda = br.readLine();
		} catch (IOException e) {
			System.out.println("Coœ ty cz³owieku wpisa³?");
			e.printStackTrace();
		}
        
        //dzielimy tekst wejsciowy na poszczególne komendy przy za³o¿eniu, ¿e bêd¹
        //je oddzielaæ przecinki.
        //@TODO a co je¿eli ktoœ u¿yje "i" albo "oraz"?
        
        String[] czesciZdania = wprowadzonaKomenda.split(",");
        int action=-1;
        for(String i : czesciZdania){
        	String[] temp = stringOps.przygotujZdanie(i);
        	action = commandFinder.commandFinder(temp);
        	switch(action){
        	case 1: System.out.println("Pójdê w górê"); break;
        	case 2: System.out.println("Pójdê w prawo"); break;
        	case 3: System.out.println("Pójdê w dó³"); break;
        	case 4: System.out.println("Pójdê w lewo"); break;
        	default: System.out.println("Coœ jest nie halo, ch³opcze"); break;
        }}
    }
}