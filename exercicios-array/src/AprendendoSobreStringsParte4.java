import java.util.Scanner;

public class AprendendoSobreStringsParte4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidadeDeVogais = 0;

		System.out.print("Digite uma palavra: ");
		String palavraOuFrase = entrada.nextLine();

		System.out.println(palavraOuFrase + ": tem " + palavraOuFrase.length() + " caracteres.");

		System.out.println(palavraOuFrase.toUpperCase());

		System.out.println(palavraOuFrase.startsWith("p"));

		System.out.println(palavraOuFrase.startsWith("p", 0));

		for (int i = 0; i < palavraOuFrase.length(); i++) {

			if ((palavraOuFrase.charAt(i) == 'a') || (palavraOuFrase.charAt(i) == 'e')
					|| (palavraOuFrase.charAt(i) == 'i') || (palavraOuFrase.charAt(i) == 'o')
					|| (palavraOuFrase.charAt(i) == 'u')) {

				quantidadeDeVogais++;
			}
		}
		
		System.out.println(quantidadeDeVogais);
	}
}
