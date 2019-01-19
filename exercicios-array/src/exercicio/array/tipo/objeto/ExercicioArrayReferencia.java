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
		 * System.out.println("Conta na posi��o zero: " + referencias[0]);
		 */
		
		/*
		 * Como o tipo Object[] � generico porque aceita guardar quanquer tipo de
		 * referencia por isso � necessario fazer o type cast para acessar os metodos
		 * do objeto.
		 */
		System.out.println("Usando array do tipo Object");
		System.out.println(referencias[2]);
		System.out.println(((Cliente) referencias[2]).getNome());

		/*
		 * Agora se for um array do tipo Cliente[] e o objeto for do tipo Cliente n�o �
		 * necessario fazer type cast para acessar os metodos do object.
		 */
		System.out.println("");
		System.out.println("Usando array do tipo Cliente");
		System.out.println(clientes[0].getNome());
	}
}
