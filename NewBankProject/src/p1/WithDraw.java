package p1;

public class WithDraw implements AtmInterface {

	public void process(int amount) {
		if (amount > ub.bal) {
			System.out.println("Insufficient amount to withdraw");
		} else {
			ub.bal = ub.bal - amount;
			System.out.println("Amount Withdrawn:-" + amount);
			System.out.println("Available Balane:-" + ub.bal);

		}

	}

}
