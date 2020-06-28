import java.util.Scanner;

public class Main {

	static String findOperation(Operation operation, String expression, int index) {
		int x = 0;
		int y = 0;
		int newIndX;
		int newIndY;
		{
			int tempIndex1 = index - 1;
			int tempIndex2 = index;
			int offset = 0;

			if (tempIndex1 - 1 >= 0) {

				while ((tempIndex1 - 1 >= 0) && (!expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("+")
						&& !expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("/")
						&& !expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("*"))) {

					if (expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("-") && tempIndex1 - 1 > 0) {
						break;
					}

					offset++;
					tempIndex1--;
					tempIndex2--;

					if (tempIndex1 == 0) {
						break;
					}
					if (tempIndex2 == 0)
						break;
				}
			}
			newIndX = index - 1 - offset;
			x = Integer.valueOf(expression.substring(newIndX, index));
		}
		{
			int tempIndex1 = index + 1;
			int tempIndex2 = index + 2;
			int offset = 0;
			if (!(tempIndex2 + 1 > expression.length())) {

				while (!expression.substring(tempIndex1 + 1, tempIndex2 + 1).equals("-")
						&& !expression.substring(tempIndex1 + 1, tempIndex2 + 1).equals("+")
						&& !expression.substring(tempIndex1 + 1, tempIndex2 + 1).equals("*")
						&& !expression.substring(tempIndex1 + 1, tempIndex2 + 1).equals("/")) {

					offset++;
					tempIndex1++;
					tempIndex2++;

					if (tempIndex1 == expression.length())
						break;
					if (tempIndex2 == expression.length())
						break;
				}
			}
			newIndY = index + 2 + offset;
			y = Integer.valueOf(expression.substring(index + 1, newIndY));
		}
		int z = Operation.calculate(operation, x, y);
		String s1, s2;
		if (index - 2 == 0 || index - 1 == 0)
			s1 = "";
		else {
			s1 = expression.substring(0, newIndX);
		}
		if (index - 1 > expression.length())
			s2 = "";
		else
			s2 = expression.substring(newIndY);
		String s3 = s1 + String.valueOf(z) + s2;
		return s3;
	}

	static void operate(String expression) {
		System.out.println(expression);

		try {
			System.out.println("The answer is " + Integer.valueOf(expression));
		} catch (NumberFormatException e) {
			String result = "";
			boolean next = true;
			for (int i = 0; i < expression.length(); i++) {
				String s = expression.substring(i, i + 1);
				if (s.equals("*") || s.equals("/")) {
					result = findOperation(Operation.getOperation(s), expression, i);
					next = false;
					break;
				}
			}
			if (next) {
				for (int i = 0; i < expression.length(); i++) {
					String s = expression.substring(i, i + 1);
					if (s.equals("+") || (s.equals("-") && i != 0)) {
						result = findOperation(Operation.getOperation(s), expression, i);
						next = false;
						break;
					}
				}
			}
			operate(result);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an expression");
		operate(scanner.nextLine());
	}
}
