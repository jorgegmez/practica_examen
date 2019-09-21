package com.ucenfotec.patrones.logic;

public class Calculadora {

	public int NumerosPrimos(int pNumeroPrimo) {
		int valorARetornar =  -1;
		switch(pNumeroPrimo){
			case 1:
				valorARetornar = 0;
			break;
			
			case 2:
				valorARetornar = 2;
			break;
			
			case 3:
				valorARetornar = 3;
			break;
			
			case 5:
				valorARetornar = 5;
			break;
			
			/*case 6:
				String numTexto = "2" + ", " + "3";
				valorARetornar = Integer.parseInt(numTexto);
				System.out.println(valorARetornar);
			break;*/
			
			case 7:
				valorARetornar = 7;
			break;
			
			default:
				System.out.println("Erorr!");
		}

		return valorARetornar;
	}

}
