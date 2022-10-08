package bil.classes;

/*
 * Herda todas as caracteristicas da classe Funcionario
 * Herda todos os comportamentos da classe Funcionario
 * Gerente também é um Funcionario
 * Isso gera a reutilização de código.
 * */
public class Gerente extends Funcionario {
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		return false;
	}
	
	public double getBonificacao() {
		return this.getSalario();
	}
}
