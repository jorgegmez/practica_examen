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

}
