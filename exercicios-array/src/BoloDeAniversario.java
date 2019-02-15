
/*
 * Conta quantos elementos dentro do array são iguais.*/

import java.util.Scanner;

public class BoloDeAniversario {

	public static void main(String[] args) {

		Scanner entradaDeDados = new Scanner(System.in);

		int tamanhoDoArray = entradaDeDados.nextInt();
		String vela = null;
		int maiorVela = 1;
		int maiorValor = 0;
		int contandoMaiorValor = 0;

		int[] bolo = new int[tamanhoDoArray];

		// para inserir dados.
		for (int i = 0; i < bolo.length; i++) {
			vela = entradaDeDados.next();
			bolo[i] = Integer.parseInt(vela);

		}

		for (int j = 0; j < bolo.length && maiorVela < bolo.length; j++) {
			
			// se for a primeira interação verifica as duas posições qual é a maior.
			if (j == 0) {
				if (bolo[j] > bolo[maiorVela]) {
					maiorValor = bolo[j];
				} else if (bolo[maiorVela] > bolo[j]) {
					maiorValor = bolo[maiorVela];
				}
			}

			// se o maiorValor for menor que algum elemento do array.
			// então altera-se pelo valor do array.
			if (j > 0) {
				if (bolo[j] > maiorValor) {
					maiorValor = bolo[j];
				}

			}

		}

		// conta quantos elementos iguais ao maior valor tem no array.
		for (int v = 0; v < bolo.length; v++) {
			if (bolo[v] == maiorValor) {
				contandoMaiorValor++;
			}
		}

		System.out.println(maiorValor);
		System.out.println(contandoMaiorValor);
	}
}
