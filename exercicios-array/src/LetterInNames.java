import java.util.Scanner;

public class LetterInNames {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Quantos nomes você deseja digitar?");

		int size = input.nextInt();
		String name = null;

		String[] names = new String[size];

		// adiciona elementos no array
		for (int i = 0; i < names.length; i++) {

			name = input.next();
			names[i] = name;
		}

		// percorre os elementos do array
		for (int j = 0; j < names.length; j++) {

			if (names[j].toUpperCase().startsWith("A")) {
				System.out.print(" >>> " + names[j]);
			}
		}

	}
}
