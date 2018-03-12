import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int a = scanner.nextInt();
			String op = scanner.next();
			int b = scanner.nextInt();
			if (op.contains("+")) {
				int result = add(a, b);
				System.out.println(result);
			} else if (op.contains("-")) {
				int result = sub(a, b);
				System.out.println(result);
			} else if (op.contains("*")) {
				int result = mult(a, b);
				System.out.println(result);
			} else if (op.contains("/")) {
				int result = div(a, b);
				System.out.println(result);
			}
		}
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static int sub(int a, int b) {
		return a - b;
	}

	public static int mult(int a, int b) {
		return a * b;
	}

	public static int div(int a, int b) {
		return a / b;
	}
}
