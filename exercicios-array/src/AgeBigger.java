import java.util.Scanner;

public class AgeBigger {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Quantas idades você deseja digitar");
		int size = input.nextInt();

		int[] ages = new int[size];
		String[] names = new String[size];

		int age = 0;
		String name = null;

		int ageBigger = 0;
		int ageSmaller = 0;

		for (int i = 0; i < ages.length; i++) {

			System.out.print("Digite a idade: ");
			age = input.nextInt();

			System.out.print("Digite o nome: ");
			name = input.next();

			System.out.println(" ");

			if (age >= 18) {
				ageBigger++;
				names[i] = name;
			} else {
				ageSmaller++;
			}
		}

		for (int j = 0; j < names.length; j++) {
			if (names[j] != null) {

				System.out.println(names[j]);
			}
		}

		System.out.println("\nMaiores de iddade: " + ageBigger);
		System.out.println("Menores de idade: " + ageSmaller);
	}
}
