package CommandFinder;

public class directionFinder {
	public static String[] findDirection(String[] inputExpression){
		String[] foundCommand = {"0","0"};
		String[] movementUpList = {"g[o�]r[ae�y]","p[o�][l�]noc"};
		String[] movementRightList = {"prawo","wsch[o�]d"};
		String[] movementDownList = {"d[o�][l�]","po[l�]udnie"};
		String[] movementLeftList = {"lewo","zach[o�]d"};
		
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
					
		}
		return foundCommand;}}

