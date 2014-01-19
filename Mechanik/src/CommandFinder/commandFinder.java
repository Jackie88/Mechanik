package CommandFinder;

public class commandFinder {
	
	public static String[] commandFinder(String[] inputExpression){
		
		String[] command = {"-1","-1"};
		String[] temp = null;
		
		for(int i = 0; i < inputExpression.length; i++){
			inputExpression[i]=inputExpression[i].toLowerCase();
		}
		
		temp = movementFinder.findMovement(inputExpression);
		if(!(temp[0].equals("-1"))){
			command = temp;
		}
		temp = repairFinder.findRepair(inputExpression);
		if(!(temp[0].equals("-1"))){
			command = temp;
		}
		temp = investigateFinder.findInvestigate(inputExpression);
		if(!(temp[0].equals("-1"))){
			command = temp;
		}
		temp = carryObjectFinder.findCarryObject(inputExpression);
		if(!(temp[0].equals("-1"))){
			command = temp;}
		return command;
	}
}

