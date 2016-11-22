import java.util.Scanner;

public class BeerSong {
	public static void main (String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int beerNum = 99;

		System.out.println();
		int speed = 2000;
		String word = "bottles";

		while (beerNum > 1) {

			if (beerNum == 1) {
				word = "bottle";
			}

			System.out.println(beerNum + " " + word + " of beer on the wall");
			Thread.sleep(speed);
			System.out.println(beerNum + " " + word + " of beer.");
			Thread.sleep(speed);
			System.out.println("Take one down.");
			Thread.sleep(speed/2);
			System.out.println("Pass it around.");
			Thread.sleep(speed/2);
			beerNum = beerNum - 1;

			if (beerNum > 0) {
				System.out.println(beerNum + " " + word + " of beer on the wall");
			} else {
				System.out.println("No more bottles of beer on the wall");
			}
			System.out.println("");
			Thread.sleep(speed*2);
		}
	}
} 
