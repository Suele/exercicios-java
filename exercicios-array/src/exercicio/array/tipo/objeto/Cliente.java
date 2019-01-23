package exercicio.array.tipo.objeto;

public class Cliente {

	private String nome;
	private String endereco;

	public Cliente(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	@Override
	public boolean equals(Object obj) {

		Cliente cliente = (Cliente) obj;

		if (this.nome != cliente.getNome()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Cliente >>> nome: " + nome + ", endereco: " + endereco;
	}

}
