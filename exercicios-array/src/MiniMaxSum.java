import java.util.Scanner;

public class MiniMaxSum {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		long[] arr = new long[5];

		long valor = 0;
		long max = 0;
		long min = 0;

		for (int i = 0; i < arr.length; i++) {

			valor = input.nextInt();
			arr[i] = valor;
		}

		for (int i = 0; i < 4; i++) {
			min += arr[i];
		}

		for (int j = 1; j < arr.length; j++) {
			max += arr[j];
			System.out.println(">>>>" + max);
		}
		System.out.println(min + " " + max);
	}
}
