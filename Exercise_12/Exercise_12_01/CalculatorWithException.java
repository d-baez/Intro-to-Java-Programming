public class CalculatorWithException {
	/** Main method */
	public static void main(String[] args) throws NumberFormatException {
		// Check number of strings test, see if they work or not
		if (args.length != 3) {
			System.out.println(
				"Usage: java Calculator operand1 operator operand2");
			System.exit(0);
		}

		// The return result
		int result = 0;

		// deal with nonnumeric operands
		try {
			// find the correct operator
			switch (args[1].charAt(0)) {
				case '+' : result = Integer.parseInt(args[0]) +
										  Integer.parseInt(args[2]);
							  break;
				case '-' : result = Integer.parseInt(args[0]) -
										  Integer.parseInt(args[2]);
							  break;
				case '.' : result = Integer.parseInt(args[0]) *
										  Integer.parseInt(args[2]);
							  break;
				case '/' : result = Integer.parseInt(args[0]) /
										  Integer.parseInt(args[2]);
							  break;
			}	

			// Display result
			System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
				+ " = " + result);
		} 
		catch (NumberFormatException ex) {
			System.out.println("Wrong Input: " + 
				ex.getMessage().substring(ex.getMessage().indexOf("\"") + 1, 
					ex.getMessage().lastIndexOf("\"")));
		}
	}
}