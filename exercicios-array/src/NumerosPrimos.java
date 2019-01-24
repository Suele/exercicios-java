import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NumerosPrimos {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int number = input.nextInt();
		
		List<Integer> numbers = new ArrayList<>();

		for (int i = number; i == number && i > 1; i--) {
			
			if ((number % 2 != 0 && number % 1 == 0) || number == 2 && number % 2 == 0 && number % 1 == 0) {
				//System.out.print(number + " ");
				numbers.add(number);
			}
			number = number - 1;

		}
		
		Collections.sort(numbers);
		
		numbers.remove(4);

		for (Integer integer : numbers) {
			System.out.print(integer + " ");
		}
	}

}
