package p2;
import java.util.Scanner;
import p1.*;




public class MainClassAtmProject {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("*******WELCOME*******");
		int count = 0;

		pqr: while (true) {
			System.out.println("Enter pin:");
			int pin = s.nextInt();
			if (pin >= 1111 && pin <= 9999) {
				
				VerifyPin vp = new VerifyPin();
				boolean b = vp.verify(pin);
				if (b) {
					System.out.println("Pin no verified .............");
					System.out.println();

					System.out.println("Please proceed.......");
					System.out.println("****USER DETAILS*****");
					System.out.println("Name:-Sameer Mohanty");
					System.out.println("Account No:-283XXXXXX203");
					System.out.println("Pin:-  *  *  *  * ");

					System.out.println("      PLEASE SELECT A SERVICE       ");

					System.out.println("\t1.Withdraw\n" + "\t2.Deposit\n" + "\t3.Check Balance");

					int choice = s.nextInt();
					switch (choice) {
					case 1:
						System.out.println("Enter the amount to withdraw");
						int amt1 = s.nextInt();

						if (amt1 >= 100 && amt1 % 100 == 0) {
							WithDraw wd = new WithDraw();
							wd.process(amt1);
						} else {
							System.out.println("Invaid amount to withdraw");
						}
						break pqr;
					case 2:
						System.out.println("Enter the amount to deposit");
						int amt2 = s.nextInt();
						Deposit dd = new Deposit();
						dd.process(amt2);
						break pqr;

					case 3:
						UserBalance ub = new UserBalance();
						System.out.println("Available Balance:-" + ub.getBal());
						break pqr;
					default:
						System.out.println("INVALID SERVICE CHOOSEN");
						break pqr;
					}

				} else {
					count++;
					System.out.println("Pin no is not correct..............");
				}

			} else {
				count++;
				System.out.println("Pin no must be of four digit..............");
			}
			if (count == 3) {
				System.out.println("Transaction Blocked......");
				break;
			}
		}


//end of loop
	}
}
