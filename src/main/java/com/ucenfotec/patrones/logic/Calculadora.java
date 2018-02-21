package com.ucenfotec.patrones.logic;

public class Calculadora {

	public int NumerosPrimos(int pNumeroPrimo) {
		int valorARetornar =  -1;
		switch(pNumeroPrimo){
			case 1:
				valorARetornar = 0;
			break;
			
			default:
				System.out.println("Erorr!");
		}
		return valorARetornar;
	}

}
