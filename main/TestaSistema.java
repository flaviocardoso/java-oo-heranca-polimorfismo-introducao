package main;

import classes.empregados.abstrato.Gerente;
import classes.empregados.abstrato.SistemaInterno;

public class TestaSistema {
	public static void main (String[] args) {
		Gerente g = new Gerente();
		g.setSenha(1310);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(g);
	}
}
