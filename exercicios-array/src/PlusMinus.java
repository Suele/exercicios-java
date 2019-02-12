/*
 * Conta quantos números são Positivos, Negativos ou Zero 
 * e divide está quantidade pelo número de elementos do array*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {

		Scanner entradaDeDados = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.000000");

		int tamanhoDoArray = entradaDeDados.nextInt();
		int elementosDoArray = 0;
		double numerosPositivos = 0;
		double numerosNegativos = 0;
		double numerosZero = 0;

		if (tamanhoDoArray > 0 && tamanhoDoArray <= 100) {
			float[] array = new float[tamanhoDoArray];

			// adiciona os elementos no array.
			for (int i = 0; i < array.length; i++) {
				elementosDoArray = entradaDeDados.nextInt();
				array[i] = elementosDoArray;
			}

			// conta quantos elementos P,N ou Z tem no array.
			for (int j = 0; j < array.length; j++) {
				if (array[j] > 0) {
					numerosPositivos++;
				} else if (array[j] < 0) {
					numerosNegativos++;
				} else {
					numerosZero++;
				}
			}

			// divide e formata.
			System.out.println(df.format(numerosPositivos / tamanhoDoArray));
			System.out.println(df.format(numerosNegativos / tamanhoDoArray));
			System.out.println(df.format(numerosZero / tamanhoDoArray));

		} else {
			System.out.println("O tamanho do array aceitado é entre 0 e 100.");
		}
	}

}
