import java.util.Scanner;

public class FindArrayProduct {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int resultado = 1;

		System.out.println("Qual o tamanho do array? ");
		int n = input.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i] = i + 1);
		}

		System.out.println("----------");

		for (int i = 0; i < a.length; i++) {
			resultado *= a[i];
			System.out.println(">>>" + resultado);
		}

		// 1*2*3*4*5 = 120
		//System.out.println(resultado);
	}
}
