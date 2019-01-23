package exercicio.array.tipo.objeto;

public class ContaCorrente {

	private int numeroDaConta;
	private int agencia;

	public ContaCorrente(int numeroDaConta, int agencia) {
		this.numeroDaConta = numeroDaConta;
		this.agencia = agencia;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return agencia;
	}

	public void setSaldo(int agencia) {
		this.agencia = agencia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + agencia;
		result = prime * result + numeroDaConta;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		ContaCorrente outraContaCorrente = (ContaCorrente) obj;

		if (this.agencia != outraContaCorrente.agencia) {
			return false;
		}
		if (this.numeroDaConta != outraContaCorrente.numeroDaConta) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "ContaCorrente >>> numeroDaConta: " + numeroDaConta + ", agencia: " + agencia;
	}

}
