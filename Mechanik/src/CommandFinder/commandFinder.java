package CommandFinder;

public class commandFinder {
	
	public static int[] commandFinder(String[] inputExpression){
			int[] command = movementFinder.findMovement(inputExpression);
			return command;
		}
	}

