package exercicios.array.referencia;

public class ContaCorrente {

	private int numeroDaConta;
	private double saldo;

	public ContaCorrente(int numeroDaConta, double saldo) {
		this.numeroDaConta = numeroDaConta;
		this.saldo = saldo;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numeroDaConta=" + numeroDaConta + ", saldo=" + saldo + "]";
	}

}
