package main;

import classes.empregados.abstrato.Autenticavel;
import classes.empregados.abstrato.Gerente;
import classes.empregados.abstrato.Cliente; // cliente está na package de empregados, mas ele não é um empregado, é só um utilizador do sistema.
import classes.empregados.abstrato.Adminstracao;
import classes.empregados.abstrato.SistemaInterno;

public class TesteAutenticavel {
	public static void main (String[] args) {
		// Podemos ver aqui o uso de interface.
		// Em SistemaInterno que tem um método, que tem como de parametro tipo uma uma interface.
		// Essa interface foi implementada nessas classes, afim de obter um contrato com essa classes.
		// Isso nos faz entender no que foi pedido na interface, seja implementada nessas classes como os métodos pedidos que não tem implementação.
		// Então toda vez que temos como referencia de interface, podemos chamar as classes que foram implementadas com esta interface, sem causar erros.
		// Devemos ter cuidado quando usamos interface para não causar repetição de código. 
		// Nosso código é um exemplo e por isso que tem repetição de código.
		// Deveriamos implementar uma funcionalidade diferente para cada classe usando os métodos da interface.
		// Podemos fazer do uso a composição que concentra nossa funcionalidade em uma classe util que nos ajuda a mantermos a reutilização do código.
		Autenticavel ge = new Gerente();
		ge.setSenha(1312);
		Autenticavel ci = new Cliente();
		ci.setSenha(1311);
		Autenticavel ad = new Adminstracao();
		ad.setSenha(1312);
		
		SistemaInterno si = new SistemaInterno();
		si.autentica(ge);
		si.autentica(ci);
		si.autentica(ad);
		
		
	}
}
