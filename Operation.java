
public enum Operation {

	ADD, SUB, MULTI, DIVIDE;

	public static int calculate(Operation operation, int x, int y) {
		int z = 0;
		switch (operation) {
		case ADD:
			z = x + y; break;
		case SUB:
			z = x - y; break;
		case MULTI:
			z = x * y; break;
		case DIVIDE:
			z = x / y; break;
		}
		return z;
	}
	
	public static String getChar(Operation operation) {
		String character = "";
		switch (operation) {
		case ADD:
			character = "+"; break;
		case SUB:
			character = "-"; break;
		case MULTI:
			character = "*"; break;
		case DIVIDE:
			character = "/"; break;
		}
		return character;
	}
	
	public static Operation getOperation(String character) {
		Operation operation = null;
		switch (character) {
		case "+":
			operation = ADD; break;
		case "-":
			operation = SUB; break;
		case "*":
			operation = MULTI; break;
		case "/":
			operation = DIVIDE; break;
		}
		return operation;
	}
}
