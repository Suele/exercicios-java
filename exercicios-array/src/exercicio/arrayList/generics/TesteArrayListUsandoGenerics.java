package exercicio.arrayList.generics;

import java.util.ArrayList;

import exercicio.array.tipo.objeto.Cliente;
import exercicio.array.tipo.objeto.ContaCorrente;

public class TesteArrayListUsandoGenerics {
	public static void main(String[] args) {

		ContaCorrente contaDaMaria = new ContaCorrente(12345, 3344);
		ContaCorrente contaDaPaula = new ContaCorrente(23456, 3344);

		Cliente clienteMaria = new Cliente("Maria da Silva", "Rua das Flores");
		Cliente clientePaula = new Cliente("Paula das Neves", "Rua das Palmeiras");

		ArrayList<ContaCorrente> contasCorrentes = new ArrayList<ContaCorrente>();
		contasCorrentes.add(contaDaMaria);
		contasCorrentes.add(contaDaPaula);

		ArrayList<Cliente> clientes = new ArrayList<Cliente>();
		clientes.add(clienteMaria);
		clientes.add(clientePaula);

		for (ContaCorrente contaCorrente : contasCorrentes) {
			System.out.println(contaCorrente);
		}

		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNome());
		}

	}
}
