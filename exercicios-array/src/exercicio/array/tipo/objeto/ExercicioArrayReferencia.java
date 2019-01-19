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

		Object[] referencias = new Object[5];
		Cliente[] clientes = new Cliente[5];

		ContaCorrente conta1 = new ContaCorrente(1233, 3344);
		ContaCorrente conta2 = new ContaCorrente(5434, 4455);
		
		Cliente cliente = new Cliente("Maria da Silva", "Rua das Flores");

		referencias[0] = conta1;
		referencias[1] = conta2;
		referencias[2] = cliente;
		clientes[0] = cliente;

		/*
		 * System.out.println("Todas as contas cadastradas"); for (int i = 0; i <
		 * referencias.length; i++) { System.out.println(referencias[i]); }
		 * 
		 * System.out.println("Conta na posição zero: " + referencias[0]);
		 */
		
		/*
		 * Como o tipo Object[] é generico porque aceita guardar quanquer tipo de
		 * referencia por isso é necessario fazer o type cast para acessar os metodos
		 * do objeto.
		 */
		System.out.println("Usando array do tipo Object");
		System.out.println(referencias[2]);
		System.out.println(((Cliente) referencias[2]).getNome());

		/*
		 * Agora se for um array do tipo Cliente[] e o objeto for do tipo Cliente não é
		 * necessario fazer type cast para acessar os metodos do object.
		 */
		System.out.println("");
		System.out.println("Usando array do tipo Cliente");
		System.out.println(clientes[0].getNome());
	}
}
