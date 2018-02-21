package com.ucenfotec.patrones.logic;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ucenfotec.patrones.*;

public class CalculadoraTest {

	@Test
	public void test1() {
		Calculadora calcTest = new Calculadora();
		assertEquals(0, calcTest.NumerosPrimos(1));
	}
	
	@Test
	public void test2() {
		Calculadora calcTest = new Calculadora();
		assertEquals(2, calcTest.NumerosPrimos(2));
	}
	
	@Test
	public void test3() {
		Calculadora calcTest = new Calculadora();
		assertEquals(3, calcTest.NumerosPrimos(3));
	}
	
	/*@Test
	public void test4() {
		Calculadora calcTest = new Calculadora();
		assertEquals(2, 2, calcTest.NumerosPrimos(4));
	}*/
	
	@Test
	public void test5() {
		Calculadora calcTest = new Calculadora();
		assertEquals(5, calcTest.NumerosPrimos(5));
	}
	
	/*@Test
	public void test6() {
		Calculadora calcTest = new Calculadora();
		assertEquals(2, 3, calcTest.NumerosPrimos(6));
	}*/
	
	@Test
	public void test7() {
		Calculadora calcTest = new Calculadora();
		assertEquals(7, calcTest.NumerosPrimos(7));
	}
	
	

}
