
public class Application {

	public static void main(String[] args) {
		int value = 0;

		// boolean loop = true;
		// boolean loop = 4 > 5;

		boolean loop = value < 20;

		System.out.println(loop);

		while (value < 10) {
			System.out.println("Hello " + value);

			value = value + 1;
		}
	}

}
