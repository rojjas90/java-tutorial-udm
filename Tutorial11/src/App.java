
public class App {
	public static void main(String[] args) {
		String[] words = new String[3];

		words[0] = "hello";
		words[1] = "to";
		words[2] = "you";

		System.out.println(words[0]);

		String[] fruits = { "Banana", "Apple", "Banana" };

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

	}
}
