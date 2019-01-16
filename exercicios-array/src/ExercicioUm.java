
public class ExercicioUm {
	public static void main(String[] args) {

		int[] idades = new int[5];

		idades[0] = 10;
		idades[1] = 16;
		idades[2] = 21;
		idades[3] = 32;
		idades[4] = 45;

		int countMaioresDeIdade = 0;
		int countMenoresDeIdade = 0;

		for (int i = 0; i < idades.length; i++) {
			if (idades[i] > 18) {
				System.out.println(idades[i] + " anos.");
				countMaioresDeIdade++;
			}
		}
		System.out.println("Número de pessoas maior de idade: " + countMaioresDeIdade);
		System.out.println("Número de pessoas menor de idade: " + (idades.length - countMaioresDeIdade));

	}
}
