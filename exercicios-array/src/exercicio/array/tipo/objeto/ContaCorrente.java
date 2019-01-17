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
	public String toString() {
		return "ContaCorrente >>> numeroDaConta: " + numeroDaConta + ", agencia: " + agencia;
	}

}
