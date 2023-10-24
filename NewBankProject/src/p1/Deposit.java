package p1;

public class Deposit implements AtmInterface {

	public void process(int amount) {
		ub.bal = ub.bal + amount;
		System.out.println("Amount deposited:-" + amount);
		System.out.println("Available Balane:-" + ub.bal);

	}
}
