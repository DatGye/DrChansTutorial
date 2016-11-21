public class CompilerA {
	public static void main(String[] args) {
		int x = 1;
		while (x < 10) {
			if (x > 3) {
				System.out.println("big x");
			}
		}
	}
}

/**
*PREDICTION: The program's syntax is correct and can compile into bytecode. But will
*            create an infinity loop of an if statement that will never be true.
*
*OUTCOME: The prediction was entirely correct. Javac was successful at compiling and the
*         virtual machine did not terminate as nothing was outputted to the screen.
*/
