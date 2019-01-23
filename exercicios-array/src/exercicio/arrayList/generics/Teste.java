package exercicio.arrayList.generics;

import java.util.ArrayList;
import java.util.List;

import exercicio.array.tipo.objeto.Cliente;
import exercicio.array.tipo.objeto.ContaCorrente;

public class Teste {
	public static void main(String[] args) {

		Cliente c1 = new Cliente("Maria da Silva", "Rua das Flores");
		Cliente c2 = new Cliente("Paula Cunha", "Rua das Palmeiras");

		ContaCorrente cc1 = new ContaCorrente(123, 3344);
		ContaCorrente cc2 = new ContaCorrente(456, 3344);

		List<Cliente> clientes = new ArrayList<>();
		clientes.add(c1);
		clientes.add(c2);

		System.out.println("Acessa o elemento direto pelo indice.");
		System.out.println(clientes.get(0));

		System.out.println("O tamanho da lista de clientes é: " + clientes.size());

		System.out.println("A lista de clientes está vazia: " + clientes.isEmpty());

		System.out.println("Na lista contem o c1: " + clientes.contains(c1));

		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}

	}
}
