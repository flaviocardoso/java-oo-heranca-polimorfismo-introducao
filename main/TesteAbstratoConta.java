package main;

import classes.conta.*;

public class TesteAbstratoConta {
	public static void main (String[] args) {
		// new Conta(); // não pode ser instânciada, pela classes conta ser abstrata.
		// O exemplo já não usava a conta diretamente. Agora com abstract, a classe conta não pode ser mais instianciada.
		// Isso permite a segunça de não mais usar a classe conta diretamente.
		// E ainda assim podemos usa o polimofismo nas classes.
		Conta cc = new ContaCorrente(232, 345);
		cc.depositar(500);
		cc.sacar(30);
	
		Conta cp = new ContaPoupanca(264, 564);
		cp.depositar(598);
		cp.sacar(79);
	
		cc.transferir(76, cp);
	
		System.out.println("CC saldo: " + cc.getSaldo());
		System.out.println("CP saldo: " + cp.getSaldo());
	}
	
}
