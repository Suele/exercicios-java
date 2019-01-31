import java.util.Scanner;

public class CompareStrings {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String word = null;

		System.out.println("Quantas palavras você deseja digitar? ");
		int size = input.nextInt();

		String[] words = new String[size];

		for (int i = 0; i < words.length; i++) {

			word = input.next();
			words[i] = word;
		}

		for (int j = 0; j < words.length; j++) {

			if (words[j].equalsIgnoreCase("Maria")) {

				System.out.println(">>> " + words[j]);
			}
		}
	}
}
