package classes.conta.abstrato;

public class ContaCorrente extends Conta implements Tributavel {
	
	private double taxa = 0.01;
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorASacar = valor - this.taxa;
		return super.sacar(valorASacar);
	}

	// usado como exemplo
	@Override
	public void depositar(double valor) {
		super.saldo += valor - ( this.taxa * valor );  
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * taxa;
	}
}
