package exercicio.array.tipo.objeto;

public class ExercicioArrayReferencia {
	public static void main(String[] args) {

		/*
		 * arrays são estruturas de dados e servem para guardar elementos (valores primitivos ou referências).
		 *  arrays são objetos por isso se dá new quando se cria um array de qualquer tipo. 
		 *  arrays tem tamanho fixo. 
		 *  arrays são inicializados com os valores padrão de cada tipo. 
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

		System.out.println("Conta na posição zero: " + contas[0]);

	}
}
