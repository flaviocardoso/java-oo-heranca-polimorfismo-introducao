package classes.conta.abstrato;

public class ContaPoupanca extends Conta {
	
	private double taxa = 0.002;
	
	public ContaPoupanca(int agencia, int numero) {
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
}
