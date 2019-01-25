import java.util.Scanner;

public class ToggleInString {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String letters = input.nextLine();

		String minusculas = letters.toLowerCase();
		String maiusculas = letters.toUpperCase();

		System.out.println(minusculas);
		System.out.println(maiusculas);
	}
}
