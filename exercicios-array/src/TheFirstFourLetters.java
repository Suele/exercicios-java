import java.util.Scanner;

public class TheFirstFourLetters {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um nome: ");
		String name = input.next();

		if (name.length() >= 4) {
			
			System.out.println(">>> " + name.substring(0, 4));
		} else if (name.length() <= 3) {
			
			System.out.println(">>> " +  name.substring(0, name.length()));
		}
	}

}
