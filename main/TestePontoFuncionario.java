package main;

import bil.classes.Funcionario;

public class TestePontoFuncionario {
	public static void main (String[] args) {
		Funcionario fun0 = new Funcionario();
		fun0.setNome("Funcionario 1");
		fun0.setCpf("999.999.999-99");
		fun0.setSalario(3000.00);
		
		System.out.println(fun0.getNome());
		System.out.println(fun0.getCpf());
		System.out.println(fun0.getSalario());
		System.out.println(fun0.getBonificacao());
	}
}
