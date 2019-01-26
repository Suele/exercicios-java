/*
 * Adicionar um tamanho para o array, inserir elementos e soma-los.*/

import java.util.Scanner;

public class SumArraySimples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int sum = 0;

		int number = 0;
		int size = input.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			number = input.nextInt();
			arr[i] = number;

			sum += arr[i];

		}

		System.out.println("array size: " + arr.length);
		System.out.println("sum: " + sum);
	}
}
