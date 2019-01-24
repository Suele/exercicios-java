import java.util.Scanner;

public class NumerosPrimos {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int primo = 0;

		System.out.print("Digite um número inteiro: ");
		int number = input.nextInt();

		for (int i = number; i == number && i > 1; i--) {
			if ((number % 2 != 0 && number % 1 == 0) || number == 2 && number % 2 == 0 && number % 1 == 0) {
				System.out.println(">>>> " + number);

			}
			number = number - 1;

		}
	}
}
