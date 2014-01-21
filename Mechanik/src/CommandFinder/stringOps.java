package CommandFinder;
public class stringOps {

public static String[] przygotujZdanie(String Zdanie){
		
	String[] poszczegolneSlowa=podzielSlowa(Zdanie);
	poszczegolneSlowa=usunSpacjePoPrzecinku(poszczegolneSlowa);
	//wypiszSlowa(poszczegolneSlowa);
	return poszczegolneSlowa;
	}

public static void wypiszSlowa(String[] Zdanie){
	
	int numerSlowa=0;
	for(String slowo : Zdanie){
		numerSlowa++;
		System.out.println("Slowo " + numerSlowa + ": " + slowo);}
	}

public static String[] podzielSlowa(String Zdanie){
	
	String[] poszczegolneSlowa = Zdanie.split(" ");
	return poszczegolneSlowa;
	}

public static String[] usunSpacjePoPrzecinku(String[] Zdanie){
	int tempLength = Zdanie.length-1;
	String[] temp = new String[tempLength];
	if(Zdanie[0].equals("")){
		System.arraycopy(Zdanie, 1, temp, 0, Zdanie.length-1);
		return(temp);}
	else return Zdanie;
	}
}
