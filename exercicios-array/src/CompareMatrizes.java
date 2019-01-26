import java.util.Scanner;

public class CompareMatrizes {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] a = new int[3];
		int valuesAlice = 0;
		int pontosAlice = 0;

		int[] b = new int[3];
		int valuesBob = 0;
		int pontosBob = 0;

		for (int i = 0; i < a.length; i++) {
			valuesAlice = input.nextInt();
			a[i] = valuesAlice;
		}

		for (int i = 0; i < b.length; i++) {
			valuesBob = input.nextInt();
			b[i] = valuesBob;
		}

		for (int j = 0; j < a.length && j < b.length; j++) {
			if (a[j] > b[j]) {
				pontosAlice++;
			}
			if (a[j] == b[j]) {
				System.out.println("Empate ninguem recebe pontos.");
			}
			if (b[j] > a[j]) {
				pontosBob++;
			}
		}

		System.out.println(pontosAlice);
		System.out.println(pontosBob);
	}
}
