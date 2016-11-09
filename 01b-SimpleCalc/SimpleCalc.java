import java.util.Scanner;

public class SimpleCalc {

	public static Scanner sc;
	public static int ans;

	public static int opAddition() {
		System.out.println("Enter First Addend:");
		int a = sc.nextInt();
		System.out.println("Enter Second Addend:");
                int b = sc.nextInt();
		return a + b;
	}

	public static int opSubtraction() {
                System.out.println("Enter Minuend:");
                int a = sc.nextInt();
                System.out.println("Enter Subtrahend:");
                int b = sc.nextInt();
                return a - b;
        }

	public static int opMultiplication() {
                System.out.println("Enter First Factor:");
                int a = sc.nextInt();
                System.out.println("Enter Second Factor:");
                int b = sc.nextInt();
                return a * b;
        }

	public static int opDivision() {
                System.out.println("Enter Dividend:");
                int a = sc.nextInt();
                System.out.println("Enter Divisor:");
                int b = sc.nextInt();
                return a / b;
        }

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		char operation;

		System.out.println("Select Arithmetic Operation:");
		System.out.println(" [+] Addition");
		System.out.println(" [-] Subtraction");
		System.out.println(" [*] Multiplication");
		System.out.println(" [/] Division");
		operation = sc.next().charAt(0);

		switch (operation) {
			case '+': ans = opAddition();
				  break;
			case '-': ans = opSubtraction();
				  break;
			case '*': ans = opMultiplication();
				  break;
			case '/': ans = opDivision();
				  break;
			default:  System.out.println("Input Invalid!");
				  System.exit(0);
		}

		System.out.print("The answer is: ");
		System.out.println(ans);
		System.exit(0);
	}
} 

