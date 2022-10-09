package classes.empregados;

public class ControleBonificacao {
	public double soma;
	
	// Aplicacão do Polimorfismo de classe. Funcionario é a classe genérica mais alta.
	public void registra(Bonificacao b) {
		System.out.println(b);
		double bonl = b.getBonificacao();
		this.soma += bonl;
	}
	
	public double soma() {
		return this.soma;
	}
}
