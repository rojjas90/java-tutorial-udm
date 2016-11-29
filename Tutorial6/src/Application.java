
public class Application {
	public static void main(String[] args) {

		int value = 15;

		if (value < 10)
			System.out.println("Value is less than 10");
		else if (value >= 10) {
			System.out.println("Value is equal or higher than 10");
		} else {
			System.out.println("None of the above");
		}

		// using break inside while loop

		int loop = 0;

		while (true) {
			System.out.println("Lopping " + loop);

			if (loop == 5) {
				break;
			}

			loop++;
		}

	}
}
