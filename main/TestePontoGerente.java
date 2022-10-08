package main;

import bil.classes.Gerente;

public class TestePontoGerente {
	public static void main (String[] args) {
		Gerente ger0 = new Gerente();
		ger0.setNome("Gerente 1");
		ger0.setCpf("999.999.999-99");
		ger0.setSalario(9000.00);
		
		System.out.println(ger0.getNome());
		System.out.println(ger0.getCpf());
		System.out.println(ger0.getSalario());
		
		// sem seta senha
		boolean autentica = ger0.autentica(2233);
		
		System.out.println(autentica);
		
		// setando senha
		ger0.setSenha(2233);
		autentica = ger0.autentica(2233);
		
		System.out.println(autentica);
	}
}
