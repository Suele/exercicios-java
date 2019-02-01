import java.util.Scanner;

public class Backwards {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Quantas palavras você deseja digitar? ");
		int numberOfWords = input.nextInt();

		String word = null;
		char caracterPorCaracter;

		for (int i = 0; i < numberOfWords; i++) {

			System.out.print("Digite a palavra: ");
			word = input.next();

			System.out.println(word.length());

			for (int j = word.length() - 1; j >= 0; j--) {

				caracterPorCaracter = word.charAt(j);
				System.out.println(caracterPorCaracter);
			}
		}
	}

}
