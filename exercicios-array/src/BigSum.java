import java.util.Scanner;

public class BigSum {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int tamanhoDoArray = 0;
		long totalDaSoma = 0;

		tamanhoDoArray = input.nextInt();

		long[] arr = new long[tamanhoDoArray];
		long valoresDoArray = 0;

		for (int i = 0; i < arr.length; i++) {
			
			valoresDoArray = input.nextInt();
			arr[i] = valoresDoArray;
			totalDaSoma += arr[i];
		}

		System.out.println(totalDaSoma);
	}
}
