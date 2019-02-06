import java.util.Scanner;

public class AprendendoSobreStringsParte4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadeDeVogais = 0;
		int quantidadeDeNumeros = 0;

		System.out.print("Digite uma palavra: ");
		String palavraOuFrase = entrada.nextLine();

		System.out.println(palavraOuFrase + ": tem " + palavraOuFrase.length() + " caracteres.");

		System.out.println(palavraOuFrase.toUpperCase());

		System.out.println(palavraOuFrase.startsWith("UNI"));

		System.out.println(palavraOuFrase.startsWith("UNI", 0));

		System.out.println(palavraOuFrase.endsWith("rio"));

		// conta o número de vogais que tem na palavra ou frase.
		for (int i = 0; i < palavraOuFrase.length(); i++) {

			if ((palavraOuFrase.toLowerCase().charAt(i) == 'a') || (palavraOuFrase.toLowerCase().charAt(i) == 'e')
					|| (palavraOuFrase.toLowerCase().charAt(i) == 'i')
					|| (palavraOuFrase.toLowerCase().charAt(i) == 'o')
					|| (palavraOuFrase.toLowerCase().charAt(i) == 'u')) {

				quantidadeDeVogais++;
			}
		}

		System.out.println("Número de vogais na string " + quantidadeDeVogais);

		for (int j = 0; j < palavraOuFrase.length(); j++) {

			if (Character.isDigit(palavraOuFrase.charAt(j))) {

				quantidadeDeNumeros++;
			}
		}

		System.out.println("Quantidade de caracteres númericos na string " + quantidadeDeNumeros);

	}
}
