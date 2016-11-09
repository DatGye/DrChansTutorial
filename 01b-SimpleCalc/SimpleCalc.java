import java.util.Scanner;

public class SimpleCalc {

	public Scanner sc;
	public int ans;

	public static int opAddition() {
		System.out.println("Enter First Addend:");
		int a = sc.nextInt(System.in);
		System.out.println("Enter Second Addend:");
                int b = sc.nextInt(System.in);
		return a + b;
	} 

	public static int main(String[] args) {
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
				  return 0;
				  break;
		}
	}
} 

