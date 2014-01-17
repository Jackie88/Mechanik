package CommandFinder;

public class commandFinder {
	
	public static int commandFinder(String[] Zdanie){
			int command = movementFinder.findMovement(Zdanie);
			return command;
		}
	}

