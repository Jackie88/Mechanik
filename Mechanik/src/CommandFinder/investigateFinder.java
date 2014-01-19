package CommandFinder;

public class investigateFinder {
	public static String[] findInvestigate(String[] inputExpression){
		
		String[] foundCommand = {"-1","-1"};
		String[] investigateWordList = {"sprawd[zü]","ogarnij","zbadaj","testuj"};
		
		for(String s1 : inputExpression){
			for(String investigateWordPattern : investigateWordList)
			if(s1.matches(investigateWordPattern)) foundCommand[0]="investigate";
		}
		return foundCommand;
	}

}
