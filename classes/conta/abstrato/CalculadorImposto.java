package classes.conta.abstrato;

public class CalculadorImposto {
	
	private double totalImposto;

	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.totalImposto += valor;
	}
	
	public double getTotalImposto() {
		return this.totalImposto;
	}
}
