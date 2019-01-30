import java.util.Scanner;

public class FindArrayProduct {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int resultado = 1;
		int valores = 0;

		System.out.println("Qual o tamanho do array? ");
		int n = input.nextInt();

		int[] a = new int[n];

		for (int i = 0; i < a.length; i++) {
			
			valores = input.nextInt();
			a[i] = valores;
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
