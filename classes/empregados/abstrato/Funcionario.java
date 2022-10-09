package classes.empregados.abstrato;

public abstract class Funcionario {
	private String nome; // somente a propria classe pode ser acessado, a instancia não tem acesso.
	private String cpf;
	private double salario;
	private double taxaBonificacao = 0.1;
	// protected double salario; // somente a propria classes e classes filhas o atribulo pode ser acessado, a instância não tem acesso. 
	// Quer dizer que funciona como publica nas classes filhas.
	
	// construtor
	/*
	 * O construtor padrão é aquele que não recebe nenhum parâmetro.
	 * O construtor é chamado na iniciação do objeto.
	 * */
	public Funcionario() {}
	
	// getters e setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getTaxaBonificacao() {
		return this.taxaBonificacao;
	}
	
	// method sem copo
	public abstract double getBonificacao();
}
