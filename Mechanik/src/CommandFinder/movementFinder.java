package CommandFinder;

public class movementFinder {
	public static String[] findMovement(String[] inputExpression){
		String[] foundCommand = {"0","0"};
		String[] movementWordList = {"id[z�]","porusz","rusz","le[c�]","przejd[z�]","przeskocz","ruszaj","kiknij","kikaj","p[e�]d[z�]"};
		
		for(String s1 : inputExpression){
			for(String moveWordPattern : movementWordList )
			if(s1.matches(moveWordPattern))
				foundCommand=directionFinder.findDirection(inputExpression);
}
		return foundCommand;}}

