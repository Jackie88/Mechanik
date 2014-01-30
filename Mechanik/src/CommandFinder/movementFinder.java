package CommandFinder;

public class movementFinder {
	public static String[] findMovement(String[] inputExpression){
		String[] foundCommand = {"0","0"};
		String[] movementWordList = {"id[zü]","porusz","rusz","le[cÊ]","przejd[zü]","przeskocz","ruszaj","kiknij","kikaj","p[eÍ]d[zü]"};
		
		for(String s1 : inputExpression){
			for(String moveWordPattern : movementWordList )
			if(s1.matches(moveWordPattern))
				foundCommand=directionFinder.findDirection(inputExpression);
}
		return foundCommand;}}

