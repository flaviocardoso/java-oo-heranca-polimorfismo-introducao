package main;

import classes.empregados.abstrato.*;

public class TestePontoAbstratoFuncionarioGerente {
	public static void main (String[] args) {
		Funcionario fun0 = new Gerente(); // funcionário não pode instanciar funcionário.
		fun0.setNome("Funcionario 1");
		fun0.setCpf("999.999.999-99");
		fun0.setSalario(3000.00);
		
		System.out.println(fun0.getNome());
		System.out.println(fun0.getCpf());
		System.out.println(fun0.getSalario());
		System.out.println((float) fun0.getBonificacao());
	}
}
