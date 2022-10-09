package main;

import classes.*;
/*
 * Polimorfismo - exemplo veiculo
 * */
public class TesteVeiculo {
	public static void main (String[] args) {
		Veiculo moto = new Moto();
		moto.liga();
		
		Veiculo carro = new Carro();
		carro.liga();
		
	}
}
