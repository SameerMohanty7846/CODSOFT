package p2;

import p1.*;
import java.util.Scanner;

public class StudentGradeMainClass {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("*****Student Grade Calculator******");
		System.out.println("Enter your name:-");
		String name = s.nextLine().toUpperCase();
		System.out.println("Enter the number of subject you have");
		int noOfSub = s.nextInt();
		int totalMark = 0;
		int i = 1;
		boolean p = false;
		while (i <= noOfSub) {
			System.out.println("Enter marks of sub no" + i + " :-");
			int mark = s.nextInt();
			if (mark < 0 || mark > 100) {
				System.out.println("Invalid mark! Marks must be in between 0 and 100");
				continue;
			}
			if (mark < 34 && mark > 0) {
				p = true;
			}
			totalMark = totalMark + mark;
			i++;

		}
		System.out.println("Total mark :-" + totalMark);
		if (p == true) {
			System.out.println("Result:- Fail");
		} else {
			System.out.println("Result:- Pass");

		}
		double per = totalMark / noOfSub;
		System.out.println("Pecentage:-" + per);

		System.out.println("If you want to check your grade press 1 and if not then enter 2");
		CheckGrade cg = new CheckGrade();

		int press = s.nextInt();
		if (press == 1) {
			System.out.println("*****Result Summary*****");
			System.out.println("Name:-" + name);
			System.out.println("Total Mark:-" + totalMark);
			System.out.println("Percentage:-" + per);
			System.out.print("Grade:-");
			cg.grade(per);
			System.out.println("THANK YOU..................");

		} else {
			System.out.println("*****Result Summary*****");
			System.out.println("Name:-" + name);
			System.out.println("Total Mark:-" + totalMark);
			System.out.println("Percentage:-" + per);
			System.out.println("Grade:-_______");
			System.out.println("THANK YOU..................");

		}

	}

}
