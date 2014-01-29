package CommandFinder;

public class movementFinder {
	public static String[] findMovement(String[] inputExpression){
		String[] foundCommand = {"0","0"};
		String[] movementWordList = {"id[züΩ]","porusz","rusz","le[cÊ]","przejd[zü]","przeskocz","ruszaj","kiknij"};
		
		for(String s1 : inputExpression){
			for(String moveWordPattern : movementWordList )
			if(s1.matches(moveWordPattern))
				foundCommand=directionFinder.findDirection(inputExpression);
}
		return foundCommand;}}

