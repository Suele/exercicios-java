import java.util.Scanner;

public class ManipulateStrings {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String phrase = "cncndDERT";

		for (int i = 0; i < phrase.length(); i++) {

			System.out.println(phrase.toLowerCase());
		}
	}
}
