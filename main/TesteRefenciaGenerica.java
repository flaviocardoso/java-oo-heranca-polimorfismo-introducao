package main;

import classes.empregados.ControleBonificacao;

import classes.empregados.*;

public class TesteRefenciaGenerica {
	public static void main (String[] args) {
		
		// Polimorfismo
		/*
		 * Refência de funcionário que não tem método não funciona.
		 * Como exemplo em Gerente com autentica.
		 * Podemos usar interfaces para conserta o problema.
		 * */
		Bonificacao ger = new Gerente();
		ger.setSalario(5000);
		
		Bonificacao func = new Funcionario();
		func.setSalario(1200);
		
		Bonificacao edV = new EditorVideo();
		edV.setSalario(2000);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(ger);
		controle.registra(func);
		controle.registra(edV);
		
		System.out.println(controle.soma());
		
	}
}
