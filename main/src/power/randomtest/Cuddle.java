package power.randomtest;

public class Cuddle {
	private Cuddle() {
		System.out.println("Cuddle initialised!!");
	}

	public void Activate() {
		System.out.println("Cuddle activated!\n*cuddle*");
	}

	public static Cuddle GetCuddle() {
		return new Cuddle();
	}
}
