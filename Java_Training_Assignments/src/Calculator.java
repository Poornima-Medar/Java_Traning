import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Maths m = new Maths();
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int count = 0;

		while (flag) {
			System.out.println("Enter the value of a and b");
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println("choose an operator to perform calculation +, -, *, /, ^2, ^3");
			String operator = sc.next();
			count += 1;
			switch (operator) {
			case "+":
				m.add(a, b);
				break;
			case "-":
				m.substraction(a, b);
				break;
			case "*":
				m.multiplication(a, b);
				break;
			case "/":
				if (b == 0) {
					System.out.println("number is not divisible by zero");
				} else {
					m.division(a, b);
				}
				break;
			case "^2":
				m.square(a);
				break;
			case "^3":
				m.cube(a);
				break;
			default:
				System.out.println("no oprator found");
				break;
			}
			if (count == 10) {
				flag = false;
				System.out.println("Thank you");
			}

		}

	}

}
