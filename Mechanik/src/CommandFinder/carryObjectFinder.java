package CommandFinder;

public class carryObjectFinder {
	public static String[] findCarryObject(String[] inputExpression){
		
		String[] foundCommand = {"-1","-1"};
		String[] pickWordList = {"we[zŸ]","podnie[sœ]","z[l³]ap","unie[sœ]","wznie[sœ]","d[zŸ]wignij"};
		String[] dropWordList = {"zostaw","od[l³][oó][z¿]","po[l³][oó][z¿]","wyrzu[cæ]"};
		String[] swapWordList = {"zamie[nñ]","podmie[nñ]","wymie[nñ]","zmie[nñ]"};
		
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
