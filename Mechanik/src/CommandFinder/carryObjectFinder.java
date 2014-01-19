package CommandFinder;

public class carryObjectFinder {
	public static String[] findCarryObject(String[] inputExpression){
		
		String[] foundCommand = {"-1","-1"};
		String[] pickWordList = {"we[z�]","podnie[s�]","z[l�]ap","unie[s�]","wznie[s�]","d[z�]wignij"};
		String[] dropWordList = {"zostaw","od[l�][o�][z�]","po[l�][o�][z�]","wyrzu[c�]"};
		String[] swapWordList = {"zamie[n�]","podmie[n�]","wymie[n�]","zmie[n�]"};
		
		for(String s1 : inputExpression){
			for(String pickWordPattern : pickWordList)
				if(s1.matches(pickWordPattern)) foundCommand[0]="pick";
			
			for(String dropWordPattern : dropWordList)
				if(s1.matches(dropWordPattern)) foundCommand[0]="drop";
			
			for(String swapWordPattern : swapWordList)
				if(s1.matches(swapWordPattern)) foundCommand[0]="swap";
		}
		return foundCommand;
	}
}
