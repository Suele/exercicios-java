package exercicio.arrayList.generics;

import java.util.ArrayList;

import exercicio.array.tipo.objeto.Cliente;
import exercicio.array.tipo.objeto.ContaCorrente;

public class TesteArrayListComGenerics {
	public static void main(String[] args) {

		ContaCorrente cc1 = new ContaCorrente(111, 3344);
		ContaCorrente cc2 = new ContaCorrente(111, 3344);

		ContaCorrente cc3 = new ContaCorrente(333, 3344);
		ContaCorrente cc4 = new ContaCorrente(444, 3344);

		ContaCorrente cc5 = new ContaCorrente(555, 3344);
		ContaCorrente cc6 = new ContaCorrente(666, 3344);

		ContaCorrente cc7 = new ContaCorrente(777, 2222);
		ContaCorrente cc8 = new ContaCorrente(888, 2121);

		ArrayList<ContaCorrente> contas = new ArrayList<>();
		contas.add(cc1);
		contas.add(cc2);
		contas.add(cc3);
		contas.add(cc4);
		contas.add(cc5);
		contas.add(cc6);
		contas.add(cc7);
		contas.add(cc8);

		int posicaocc1 = contas.indexOf(cc1);
		int posicaocc2 = contas.indexOf(cc2);
		int posicaocc3 = contas.indexOf(cc3);
		int posicaocc4 = contas.indexOf(cc4);
		int posicaocc5 = contas.indexOf(cc5);
		int posicaocc6 = contas.indexOf(cc6);
		int posicaocc7 = contas.indexOf(cc7);
		int posicaocc8 = contas.indexOf(cc8);

		System.out.println("Posição cc1: " + posicaocc1);
		System.out.println("Posição cc2: " + posicaocc2);
		System.out.println("Posição cc3: " + posicaocc3);
		System.out.println("Posição cc4: " + posicaocc4);
		System.out.println("Posição cc5: " + posicaocc5);
		System.out.println("Posição cc6: " + posicaocc6);
		System.out.println("Posição cc7: " + posicaocc7);
		System.out.println("Posição cc8: " + posicaocc8);
	}
}
