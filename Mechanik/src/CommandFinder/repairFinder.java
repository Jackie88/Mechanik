package CommandFinder;

public class repairFinder {
	public static String[] findRepair(String[] inputExpression){
		
		String[] foundCommand = {"-1","-1"};
		String[] repairWordList = {"napraw","nareperuj","zreperuj","za[l�]ataj","zaklej","zaklajstruj","napompuj","pompuj","[l�]ataj","na[l�]aduj","[l�]aduj"};
		
		for(String s1 : inputExpression){
			for(String repairWordPattern : repairWordList)
			if(s1.matches(repairWordPattern)) foundCommand[0]="repair";
		}
		return foundCommand;
	}
}
