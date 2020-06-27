import java.util.Scanner;

public class Main {

	private String expression;

	static void operate(String expression) {
		System.out.println(expression);

		try {
			System.out.println("The answer is " + Integer.valueOf(expression));
		} catch (NumberFormatException e) {
			String s3 = "";
			boolean next = true;
			for (int i = 0; i < expression.length(); i++) {
				String s = expression.substring(i, i + 1);
				if (s.equals("*") || s.equals("/")) {
					if (s.equals("*")) {
						int index = expression.indexOf("*");
						int tempIndex1 = index - 1;
						int tempIndex2 = index;
						int offset = 0;

						if (!(tempIndex1 - 1 < 0)) {

							while ((tempIndex1 - 1 >= 0)
									&& (!expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("+")
											&& !expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("/")
											&& !expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("*"))) {

								if (expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("-")
										&& tempIndex1 - 1 > 0) {
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
						int newIndexx = index - 1 - offset;
						int x = Integer.valueOf(expression.substring(newIndexx, index));

						int tempIndex1b = index + 1;
						int tempIndex2b = index + 2;
						int offsetb = 0;
						if (!(tempIndex2b + 1 > expression.length())) {
							while (!expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("-")
									&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("+")
									&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("*")
									&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("/")) {
								offsetb++;
								tempIndex1b++;
								tempIndex2b++;
								if (tempIndex1b == expression.length())
									break;
								if (tempIndex2b == expression.length())
									break;
							}
						}
						int newIndexy = index + 2 + offsetb;

						int y = Integer.valueOf(expression.substring(index + 1, newIndexy));
						int z = x * y;
						String s1, s2;
						if (index - 2 == 0 || index - 1 == 0)
							s1 = "";
						else {
							s1 = expression.substring(0, newIndexx);
						}
						if (index - 1 > expression.length())
							s2 = "";
						else
							s2 = expression.substring(newIndexy);
						s3 = s1 + String.valueOf(z) + s2;
						next = false;
						break;
					} else if (s.equals(("/"))) {
						int index = expression.indexOf("/");

						int tempIndex1 = index - 1;
						int tempIndex2 = index;
						int offset = 0;

						if (!(tempIndex1 - 1 < 0)) {
							while ((tempIndex1 - 1 >= 0)
									&& (!expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("+")
											&& !expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("/")
											&& !expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("*"))) {

								if (expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("-")
										&& tempIndex1 - 1 > 0) {
									System.out.println("break");
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
						int newIndexx = index - 1 - offset;

						int x = Integer.valueOf(expression.substring(newIndexx, index));

						int tempIndex1b = index + 1;
						int tempIndex2b = index + 2;
						int offsetb = 0;
						if (!(tempIndex2b + 1 > expression.length())) {
							while (!expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("-")
									&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("+")
									&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("*")
									&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("/")) {
								offsetb++;
								tempIndex1b++;
								tempIndex2b++;
								if (tempIndex1b == expression.length())
									break;
								if (tempIndex2b == expression.length())
									break;
							}
						}
						int newIndexy = index + 2 + offsetb;

						int y = Integer.valueOf(expression.substring(index + 1, newIndexy));
						int z = x / y;
						String s1, s2;
						if (index - 2 == 0 || index - 1 == 0)
							s1 = "";
						else {
							s1 = expression.substring(0, newIndexx);
						}
						if (index - 1 > expression.length())
							s2 = "";
						else
							s2 = expression.substring(newIndexy);
						s3 = s1 + String.valueOf(z) + s2;
						next = false;
						break;

					}
				}
			}
			if (next) {
				for (int i = 0; i < expression.length(); i++) {
					String s = expression.substring(i, i + 1);
					if (s.equals("+") || s.equals("-")) {
						if (s.equals("+")) {
							int index = expression.indexOf("+");

							int tempIndex1 = index - 1;
							int tempIndex2 = index;
							int offset = 0;

							if (!(tempIndex1 - 1 < 0)) {
								while ((tempIndex1 - 1 >= 0)
										&& (!expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("+")
												&& !expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("/")
												&& !expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("*"))) {
									if (expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("-")
											&& tempIndex1 - 1 > 0) {
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

							int newIndexx = index - 1 - offset;
							int x = Integer.valueOf(expression.substring(newIndexx, index));

							int tempIndex1b = index + 1;
							int tempIndex2b = index + 2;
							int offsetb = 0;
							if (!(tempIndex2b + 1 > expression.length())) {
								while (!expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("-")
										&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("+")
										&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("*")
										&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("/")) {
									offsetb++;
									tempIndex1b++;
									tempIndex2b++;
									if (tempIndex1b == expression.length())
										break;
									if (tempIndex2b == expression.length())
										break;
								}
							}

							int newIndexy = index + 2 + offsetb;
							int y = Integer.valueOf(expression.substring(index + 1, newIndexy));
							int z = x + y;
							String s1, s2;
							if (index - 2 == 0 || index - 1 == 0)
								s1 = "";
							else {
								s1 = expression.substring(0, newIndexx);
							}
							if (index - 1 > expression.length())
								s2 = "";
							else
								s2 = expression.substring(newIndexy);
							s3 = s1 + String.valueOf(z) + s2;
							break;
						} else if (s.equals("-") && i != 0) {
							int index = i;
							int tempIndex1 = index - 1;
							int tempIndex2 = index;
							int offset = 0;

							if (!(tempIndex1 - 1 < 0)) {
								while ((tempIndex1 - 1 >= 0)

										&& !expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("+")
										&& !expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("/")
										&& !expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("*")) {
									if (expression.substring(tempIndex1 - 1, tempIndex2 - 1).equals("-")
											&& tempIndex1 - 1 > 0) {
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
							int newIndexx = index - 1 - offset;
							int x = Integer.valueOf(expression.substring(newIndexx, index));
							int tempIndex1b = index + 1;
							int tempIndex2b = index + 2;
							int offsetb = 0;
							if (!(tempIndex2b + 1 > expression.length())) {
								while (!expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("-")
										&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("+")
										&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("*")
										&& !expression.substring(tempIndex1b + 1, tempIndex2b + 1).equals("/")) {
									offsetb++;
									tempIndex1b++;
									tempIndex2b++;
									if (tempIndex1b == expression.length())
										break;
									if (tempIndex2b == expression.length())
										break;
								}
							}
							int newIndexy = index + 2 + offsetb;

							int y = Integer.valueOf(expression.substring(index + 1, newIndexy));
							int z = x - y;
							String s1, s2;
							if (index - 2 == 0 || index - 1 == 0)
								s1 = "";
							else {
								s1 = expression.substring(0, newIndexx);
							}
							if (index - 1 > expression.length())
								s2 = "";
							else
								s2 = expression.substring(newIndexy);
							s3 = s1 + String.valueOf(z) + s2;
							break;
						}
					}
				}
			}
			operate(s3);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an expression");
		operate(s.nextLine());
	}
}
