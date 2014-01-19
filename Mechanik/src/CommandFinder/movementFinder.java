package CommandFinder;

public class movementFinder {
	public static String[] findMovement(String[] inputExpression){
		String[] foundCommand = {"-1","-1"};
		String[] movementWordList = {"id[zŸ]","porusz","rusz","le[cæ]","przejd[zŸ]","przeskocz","ruszaj","kiknij"};
		String[] movementUpList = {"g[oó]r[aeê]","p[oó][l³]noc"};
		String[] movementRightList = {"prawo","wsch[oó]d"};
		String[] movementDownList = {"d[oó][l³]","po[l³]udnie"};
		String[] movementLeftList = {"lewo","zach[oó]d"};
		
		for(String s1 : inputExpression){
			for(String moveWordPattern : movementWordList )
			if(s1.matches(moveWordPattern))
				for(String s2 : inputExpression){
					
					for(String upWordPattern : movementUpList)
					if(s2.matches(upWordPattern)){foundCommand[0]="up";
					foundCommand[1]=valueFinder.findValue(inputExpression);
					break;}
					
					for(String rightWordPattern : movementRightList)
					if(s2.matches(rightWordPattern)){foundCommand[0]="right";
					foundCommand[1]=valueFinder.findValue(inputExpression);
					break;}
					
					for(String downWordPattern : movementDownList)
					if(s2.matches(downWordPattern)){foundCommand[0]="down";
					foundCommand[1]=valueFinder.findValue(inputExpression);
					break;}
					
					for(String leftWordPattern : movementLeftList)
					if(s2.matches(leftWordPattern)){foundCommand[0]="left";
					foundCommand[1]=valueFinder.findValue(inputExpression);
					break;}
					
		}}
		return foundCommand;}}

