import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numeroDigitado = entrada.nextInt();

		//System.out.println(--numeroDigitado);
		System.out.println(numeroDigitado -1);

	}
}
