import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {

		Scanner entradaDeDados = new Scanner(System.in);

		int numeroDeAlunos = entradaDeDados.nextInt();

		int[] notas = new int[numeroDeAlunos];
		int nota = 0;

		for (int n = 0; n < notas.length; n++) {
			nota = entradaDeDados.nextInt();
			notas[n] = nota;
		}

		for (int j = 0; j < notas.length; j++) {

			for (int i = 0; i <= 100; i++) {

				if (i % 5 == 0 && i > notas[j]) {
					if ((i - notas[j]) < 3 && notas[j] >= 38) {
						notas[j] = i;

					} else if ((i - notas[j]) == 3) {
						notas[j] = notas[j];
					}

				}
				if (i % 5 == 0 && notas[j] < 38) {

					if (notas[j] < 38) {
						notas[j] = notas[j];
					}

				}

			}
		}

		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}

	}

}
