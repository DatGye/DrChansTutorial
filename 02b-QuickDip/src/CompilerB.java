public static void main(String[] args) {
	int x = 5;
	while (x > 1) {
		x = x - 1;
		if (x < 3) {
			System.out.println("small x");
		}
	}
}

/**
*PREDICTION: The program will not compile successfully. The code lacks the class block to identify the source code's
*            class. Everything should be wrapped around a class CompilerB.
*
*OUTCOME: Compiler failed to create .class file due to many syntax errors.
*
*/
