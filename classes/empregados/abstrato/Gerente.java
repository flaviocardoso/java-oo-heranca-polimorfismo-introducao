package classes.empregados.abstrato;

import classes.empregados.Bonificacao;

/*
 * Herda todas as caracteristicas da classe Funcionario
 * Herda todos os comportamentos da classe Funcionario
 * Gerente também é um Funcionario
 * Isso gera a reutilização de código.
 * */
public class Gerente extends Funcionario implements Autenticavel, Bonificacao {
	private AutenticacaoUtil util;
	
	public Gerente() {
		this.util = new AutenticacaoUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.util.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.util.autentica(senha);
	}
	
	// reescrita da classe pai.
	@Override
	public double getBonificacao() {
		return (1 + super.getTaxaBonificacao()) * super.getSalario(); // não está definido na classe e sim na classe pai.
	}
}
