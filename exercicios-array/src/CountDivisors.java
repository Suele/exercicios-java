import java.util.Scanner;

public class CountDivisors {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int countDivisors = 0;

		int l = input.nextInt();

		int r = input.nextInt();

		int k = input.nextInt();

		// entre l e r quantos são divisiveis por k.

		for (int i = l; i <= r; i++) {

			if (i % k == 0) {
				countDivisors++;
			}
		}
		System.out.println(countDivisors);
	}
}
