package p1;

public class VerifyPin {
	public final int userPin = 7846;

	public boolean verify(int pin) {
		return switch (pin) {
		case userPin:
			yield true;

		default:
			yield false;

		};

	}
}