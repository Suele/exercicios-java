package exercicio.arrayList;

import java.util.ArrayList;

import exercicio.array.tipo.objeto.Cliente;
import exercicio.array.tipo.objeto.ContaCorrente;

public class TesteArrayList {
	public static void main(String[] args) {

		ArrayList lista = new ArrayList<>();

		Cliente cliente1 = new Cliente("Maria da Silva", "Rua das Flores");
		Cliente cliente2 = new Cliente("Madalena das Flores", "Rua dos coqueiros");

		ContaCorrente cc1 = new ContaCorrente(12345, 3344);

		lista.add(cliente1);
		lista.add(cliente2);
		lista.add(cc1);

		Cliente ref = (Cliente) lista.get(0);

		System.out.println("Ref: " + ref);

		for (Object object : lista) {
			Cliente cliente = (Cliente) object;
			System.out.println(cliente.getNome());
		}
	}
}
