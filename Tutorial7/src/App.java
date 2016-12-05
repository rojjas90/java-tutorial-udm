import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// Create scanner object
		Scanner input = new Scanner(System.in);

		// // Output the promt
		// System.out.println("Enter a line of text: ");
		//
		// // wait for the user to enter a line of text
		// String line = input.nextLine();

		System.out.println("Enter an integer");

		int value = input.nextInt();

		// Tell them what they entered
		System.out.println("You entered " + value);
	}
}
