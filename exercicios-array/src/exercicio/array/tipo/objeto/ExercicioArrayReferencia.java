package exercicio.array.tipo.objeto;

public class ExercicioArrayReferencia {
	public static void main(String[] args) {

		/*
		 * arrays s�o estruturas de dados e servem para guardar elementos (valores primitivos ou refer�ncias).
		 *  arrays s�o objetos por isso se d� new quando se cria um array de qualquer tipo. 
		 *  arrays tem tamanho fixo. 
		 *  arrays s�o inicializados com os valores padr�o de cada tipo. 
		 *  arrays de referencias guardam um conjunto de referencias que apontam para objetos.
		 */

		Object[] contas = new Object[5];

		ContaCorrente conta1 = new ContaCorrente(1233, 3344);
		ContaCorrente conta2 = new ContaCorrente(5434, 4455);
		
		Cliente cliente = new Cliente("Maria da Silva", "Rua das Flores");

		contas[0] = conta1;
		contas[1] = conta2;
		contas[2] = cliente;

		System.out.println("Todas as contas cadastradas");
		for (int i = 0; i < contas.length; i++) {
			System.out.println(contas[i]);
		}

		System.out.println("Conta na posi��o zero: " + contas[0]);

	}
}
