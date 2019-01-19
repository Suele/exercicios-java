/*
 * Retorna o indice do maior valor.
 */

public class ExercicioCinco {
	public static void main(String[] args) {

		int maior = 0;
		int menor = 0;

		int[] v = { 4, 10, 13, 2, 24 };

		for (int i = 0; i < v.length; i++) {
			System.out.println("indice: " + v[i] + "indice:" + v[maior]);

			if (v[i] > v[maior]) {
				maior = i;
			}
		}
		System.out.println("Posição do maior valor: " + maior);

		for (int i = 0; i < v.length; i++) {

			if (v[i] < v[menor]) {
				menor = i;
			}
		}
		System.out.println("Posição do menor valor: " + menor);
	}
}
