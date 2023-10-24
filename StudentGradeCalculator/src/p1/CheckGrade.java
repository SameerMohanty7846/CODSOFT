package p1;

public class CheckGrade {
	public void grade(double per) {
		if (per < 34) {
			System.out.println("F(Ex)");
		}
		if (per > 34 && per < 40) {
			System.out.println("D-GRADE");

		} else if (per > 40 && per < 50) {
			System.out.println("C-GRADE");

		} else if (per > 50 && per < 60) {
			System.out.println("B-GRADE");
		}
		if (per > 60 && per < 70) {
			System.out.println("A-GRADE");
		}
		if (per > 70 && per < 80) {
			System.out.println("E-GRADE");
		}
		if (per > 80 && per < 100) {
			System.out.println("O-GRADE");
		}

	}

}
