
public class AprendendoSobreStringsParte1 {

	public static void main(String[] args) {

		char[] array = { 'O', 'L', 'A', ',', 'C', 'O', 'M', 'O', ' ', 'V', 'O', 'C', 'Ê', ' ', 'V', 'A', 'I', '?' };

		System.out.println("Sem for ");
		System.out.println(array);

		System.out.println("Com for ");
		for (int i = 0; i < array.length; i++) {

			System.out.println(array[i]);
		}

		String montaFrase1 = new String(array);

		System.out.println(montaFrase1);

	}
}
