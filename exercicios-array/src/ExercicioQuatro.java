
public class ExercicioQuatro {
	public static void main(String[] args) {

		int[] numeros = new int[5];

		numeros[0] = 11;
		numeros[1] = 9;
		numeros[2] = 6;
		numeros[3] = 2;
		numeros[4] = 1;

		int par = 0;
		int impar = 0;

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				par++;
			} else {
				impar++;
			}
		}

		System.out.println("Par: " + par);
		System.out.println("Ímpar: " + impar);
	}
}
