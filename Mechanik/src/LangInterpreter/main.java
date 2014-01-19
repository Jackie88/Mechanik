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
        String[] action ={"-1","-1"};

        for(String i : czesciZdania){
        	String[] temp = stringOps.przygotujZdanie(i);
        	action = commandFinder.commandFinder(temp);
        	if(!(action[0].equals("-1"))) System.out.print(action[0] + " ");
        	if(!(action[1].equals("-1"))) System.out.print(action[1] + " ");
        	System.out.println();
        }}
    }