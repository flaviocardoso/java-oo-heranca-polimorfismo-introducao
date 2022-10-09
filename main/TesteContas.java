package main;

import classes.conta.*;

public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(232, 345);
		cc.depositar(500);
		
		ContaPoupanca cp = new ContaPoupanca(264, 564);
		cp.depositar(598);
		
		cc.transferir(76, cp);
		
		System.out.println("CC saldo: " + cc.getSaldo());
		System.out.println("CP saldo: " + cp.getSaldo());
	}
}
