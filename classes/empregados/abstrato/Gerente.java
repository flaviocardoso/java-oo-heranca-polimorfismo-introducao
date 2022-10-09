package classes.empregados.abstrato;

import classes.empregados.Bonificacao;

/*
 * Herda todas as caracteristicas da classe Funcionario
 * Herda todos os comportamentos da classe Funcionario
 * Gerente também é um Funcionario
 * Isso gera a reutilização de código.
 * */
public class Gerente extends Funcionario implements Bonificacao {
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
	
	// reescrita da classe pai.
	@Override
	public double getBonificacao() {
		return (1 + super.getTaxaBonificacao()) * super.getSalario(); // não está definido na classe e sim na classe pai.
	}
}
