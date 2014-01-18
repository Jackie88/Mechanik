package CommandFinder;

public class movementFinder {
	public static int[] findMovement(String[] inputExpression){
		int[] movementDirection = {-1,-1};
		String[] movementWordList = {"id[zŸ]","porusz","rusz","le[cæ]","przejd[zŸ]","przeskocz","ruszaj"};
		String[] movementUpList = {"g[oó]r[aeê]","p[oó][l³]noc"};
		String[] movementRightList = {"prawo","wsch[oó]d"};
		String[] movementDownList = {"d[oó][l³]","po[l³]udnie"};
		String[] movementLeftList = {"lewo","zach[oó]d"};
		
		for(String s1 : inputExpression){
			for(String moveWordPattern : movementWordList )
			if(s1.matches(moveWordPattern))
				for(String s2 : inputExpression){
					
					for(String upWordPattern : movementUpList)
					if(s2.matches(upWordPattern)){movementDirection[0]=1;
					movementDirection[1]=valueFinder.findValue(inputExpression);
					break;}
					
					for(String rightWordPattern : movementRightList)
					if(s2.matches(rightWordPattern)){movementDirection[0]=2;
					movementDirection[1]=valueFinder.findValue(inputExpression);
					break;}
					
					for(String downWordPattern : movementDownList)
					if(s2.matches(downWordPattern)){movementDirection[0]=3;
					movementDirection[1]=valueFinder.findValue(inputExpression);
					break;}
					
					for(String leftWordPattern : movementLeftList)
					if(s2.matches(leftWordPattern)){movementDirection[0]=4;
					movementDirection[1]=valueFinder.findValue(inputExpression);
					break;}
					
		}}
		return movementDirection;}}

