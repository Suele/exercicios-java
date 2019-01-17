/*
 * Retorna o indice do maior valor.
 */

public class ExercicioCinco {
	public static void main(String[] args) {

		int indiceDoMaiorValor = 0;

		int[] v = { 4, 10, 13, 2, 24 };

		for (int i = 0; i < v.length; i++) {

			if (v[i] > v[indiceDoMaiorValor]) {
				indiceDoMaiorValor = i;
			}
		}
		System.out.println(indiceDoMaiorValor);
	}
}
