class Exercise1b {
	int x = 5;
	while (x > 1) {
		x = x - 1;
		if (x < 3) {
			System.out.println("small x");
		}
	}
}

/**
*PREDICTION: The program will not compile successfully. The class lacks a main method and will not
*            be executed by the virtual machine. The code should be wraped in a main method.
*
*OUTCOME: Compiler failed to create .class file due to many syntax errors.
*
*/
