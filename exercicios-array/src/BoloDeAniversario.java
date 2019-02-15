/*
 * Conta quantos elementos dentro do array são iguais.*/

import java.util.Scanner;

public class BoloDeAniversario {

	public static void main(String[] args) {

		Scanner entradaDeDados = new Scanner(System.in);

		int tamanhoDoArray = entradaDeDados.nextInt();
		int vela = 0;
		int maiorVela = 1;
		int maiorValor = 0;
		int contaVelasMaiores = 0;

		int[] bolo = new int[tamanhoDoArray];

		// para inserir dados.
		for (int i = 0; i < bolo.length; i++) {
			vela = entradaDeDados.nextInt();
			bolo[i] = vela;
		}

		for (int j = 0; j < bolo.length && maiorVela < bolo.length; j++) {

			if (j == 0) {
				if (bolo[maiorVela] > bolo[j]) {
					maiorValor = bolo[maiorVela];
					contaVelasMaiores++;
				} else if (bolo[j] > bolo[maiorVela]) {
					maiorValor = bolo[j];
					contaVelasMaiores++;
				} else if (bolo[j] == bolo[maiorVela]) {
					contaVelasMaiores++;
				}
			}

			if (j > 0 && j < bolo.length) {
				if (bolo[maiorVela] > bolo[j] && bolo[maiorVela] > maiorValor) {
					maiorValor = bolo[maiorVela];
				} else if (bolo[j] > bolo[maiorVela] && bolo[j] > maiorValor) {
					maiorValor = bolo[j];
				} else if (bolo[j] == bolo[maiorVela] && bolo[j] == maiorValor) {
					maiorValor = bolo[j];
					contaVelasMaiores++;
				} else if (bolo[maiorVela] > bolo[j] && bolo[maiorVela] == maiorValor) {
					maiorValor = bolo[maiorVela];
					contaVelasMaiores++;
				} else if (bolo[j] > bolo[maiorVela] && bolo[j] == maiorValor) {
					maiorValor = bolo[j];
					contaVelasMaiores++;
				}
			}

		}
		System.out.println(contaVelasMaiores);
	}
}
