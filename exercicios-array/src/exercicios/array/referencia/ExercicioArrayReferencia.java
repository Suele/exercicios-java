package exercicios.array.referencia;

public class ExercicioArrayReferencia {
	public static void main(String[] args) {

		/*
		 * arrays s�o estruturas de dados e servem para guardar elementos (valores primitivos ou refer�ncias).
		 * arrays s�o objetos por isso se d� new quando se cria um array de qualquer tipo. 
		 * arrays tem tamanho fixo.
		 * arrays s�o inicializados com os valores padr�o de cada tipo.
		 * arrays de referencias guardam um conjunto de referencias que apontam para objetos.
		 */

		ContaCorrente[] contas = new ContaCorrente[5];

		ContaCorrente conta1 = new ContaCorrente(123, 150.90);
		ContaCorrente conta2 = new ContaCorrente(54321, 290.00);

		contas[0] = conta1;
		contas[1] = conta2;

		for (int i = 0; i < contas.length; i++) {
			System.out.println(contas[i]);
		}
	}
}
