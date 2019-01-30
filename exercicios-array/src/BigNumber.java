import java.util.Scanner;

public class BigNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite 3 números inteiros: ");

		int numero = 0;
		int maiorValor = 0;
		int menorValor = 0;

		for (int i = 0; i < 3; i++) {

			numero = input.nextInt();

			if (i == 0) {
				maiorValor = numero;//10
				menorValor = numero;//10
			} else if (numero > maiorValor) {
				maiorValor = numero;
				System.out.println("entrei no primeiro else if");
			} else if (numero < menorValor) {
				menorValor = numero;
				System.out.println("entrei no segundo else if");
			}
		}

		System.out.println(">>> maior valor: " + maiorValor);
		System.out.println(">>> menor valor: " + menorValor);
	}
}
