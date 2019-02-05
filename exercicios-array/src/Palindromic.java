import java.util.Scanner;

public class Palindromic {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");
		String palavra = input.nextLine();

		char[] palavrasInvertidas = new char[palavra.length()];

		int pi = 0;

		int naoEPalindromo = 0;
		int ehUmPalindromo = 0;

		for (int p = palavra.length() - 1; p >= 0 && pi < palavra.length(); p--) {

			palavrasInvertidas[pi] = palavra.charAt(p);
			pi++;
		}

		System.out.println(palavra);
		System.out.println(palavrasInvertidas);

		for (int i = 0; i < palavra.length(); i++) {

			if (palavrasInvertidas[i] != palavra.charAt(i)) {
				naoEPalindromo++;
			} else {
				ehUmPalindromo++;
			}
		}

		if (naoEPalindromo > 0) {
			System.out.print(palavra + " e ");
			System.out.print(palavrasInvertidas);
			System.out.print(" não são palindromos.");
		} else {
			System.out.print(palavra + " e ");
			System.out.print(palavrasInvertidas);
			System.out.print(" são palindromo.");
		}

	}
}
