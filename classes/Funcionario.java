package classes;

public class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
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
	
	// methods
	public double getBonificacao() {
		return this.salario * 0.1;
	}
}
