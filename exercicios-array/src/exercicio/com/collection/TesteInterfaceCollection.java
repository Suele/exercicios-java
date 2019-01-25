package exercicio.com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import exercicio.array.tipo.objeto.Cliente;

public class TesteInterfaceCollection {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("Maria da Silva", "Rua das Flores");
		Cliente c2 = new Cliente("Paula da Silveira", "Rua das Palmeiras");
		Cliente c3 = new Cliente("Amanda Pereira", "Rua dos Cravos");

		List<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(c1);
		clientes.add(c2);
		clientes.add(c3);

		System.out.println("Clientes cadastradas.");
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}
		
		System.out.println("");
		System.out.println("Busca pelo indice: " + clientes.get(1));
		
	}

}
