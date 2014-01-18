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
			System.out.println("Co� ty cz�owieku wpisa�?");
			e.printStackTrace();
		}
        
        //dzielimy tekst wejsciowy na poszczeg�lne komendy przy za�o�eniu, �e b�d�
        //je oddziela� przecinki.
        //@TODO a co je�eli kto� u�yje "i" albo "oraz"?
        
        String[] czesciZdania = wprowadzonaKomenda.split(",");
        int[] action;
        for(String i : czesciZdania){
        	String[] temp = stringOps.przygotujZdanie(i);
        	action = commandFinder.commandFinder(temp);
        	switch(action[0]){
        	case 1: System.out.println("Id� w g�r� o " + action[1]); break;
        	case 2: System.out.println("Id� w prawo o " + action[1]); break;
        	case 3: System.out.println("Id� w d� o " + action[1]); break;
        	case 4: System.out.println("Id� w lewo o " + action[1]); break;
        	default: System.out.println("Co� jest nie halo, ch�opcze"); break;
        }}
    }
}