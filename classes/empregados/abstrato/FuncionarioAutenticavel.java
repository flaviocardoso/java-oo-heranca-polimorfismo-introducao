package classes.empregados.abstrato;

public class FuncionarioAutenticavel extends Funcionario {
	
	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		return this.senha == senha;
	}

	@Override
	public double getBonificacao() {
		return 0;
	}

}
