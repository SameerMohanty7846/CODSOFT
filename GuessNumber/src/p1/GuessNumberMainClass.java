package p1;

import java.util.Scanner;
import java.util.Random;

public class GuessNumberMainClass {

	public void fun() {
		Scanner s = new Scanner(System.in);
		Random r = new Random();

		System.out.println("Enter lower limit");
		int ll = s.nextInt();

		System.out.println("Enter upper limit");
		int ul = s.nextInt();

		int count = 0;
		int generate = r.nextInt(ul - ll + 1) + ll;
		pqr: while (true) {
			System.out.println("Enter a number in between " + ll + "and" + ul);
			int num = s.nextInt();
			count++;
			if (num > generate) {
				System.out.println("Enter smaller number........");

			} else if (num < generate) {
				System.out.println("Enter greater number........");

			} else {

				System.out.println("You guesssed it properly in " + "__" + count + "__" + " times");
				break pqr;
			}

			if (count == 5) {
				System.out.println("Better luck next time........");
				break;
			}

		}

	}

	public static void main(String[] args) {

		System.out.println("*******Welcome to number guessing game*********");
		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("Instructions:-");
		System.out.println("1.First choose the upper limit and lower limit");
		System.out.println("2.Choose a number between upper limit and lower limit");
		System.out.println("3.You have 7 choices ");
		System.out.println("4.If you want to play again press 1 if not press 2");

		System.out.println("*******GAME STARTED*********");

		System.out.println();
		System.out.println();
		


		GuessNumberMainClass ob = new GuessNumberMainClass();
		Scanner s = new Scanner(System.in);
		int count = 0;
		p: do {
			ob.fun();

			System.out.println("If you want to play again press 1 if not press 2");
			count = s.nextInt();
			if (count == 2) {
				System.out.println("Thank you! Game end");
				break p;
			}
		} while (count == 1);
		System.exit(0);

	}

}
