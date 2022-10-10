package main;

import classes.conta.abstrato.ContaCorrente;
import classes.conta.abstrato.SeguroDeVida;
import classes.conta.abstrato.CalculadorImposto;

public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1332, 345);
		cc.depositar(100);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(seguro);
		
		System.out.println("Quantidade de imposto: " + ci.getTotalImposto());
	}
}
