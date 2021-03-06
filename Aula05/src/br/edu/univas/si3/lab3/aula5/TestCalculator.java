package br.edu.univas.si3.lab3.aula5;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testSum() {
		Calculator calc = new Calculator();
		assertEquals(5, calc.sum(2, 3));
		assertEquals(9, calc.sum(4, 5));
	}
	
	@Test
	public void testCalcPlus() {
		CalculatorPlus calc = new CalculatorPlus();
		
		assertEquals(0, calc.result, 0.01);
		
		calc.sum(4);
		assertEquals(4, calc.result, 0.01);
		
		calc.subtract(1);
		assertEquals(3, calc.result, 0.01);
		
		calc.multiply(4);
		assertEquals(12, calc.result, 0.01);
		
		calc.clear();
		assertEquals(0, calc.result, 0.01);
		
		CalculatorPlus otherCalc = new CalculatorPlus();

		otherCalc.sum(50);
		otherCalc.multiply(20);
		assertEquals(1000, otherCalc.result, 0.01);
	}

	@Test
	public void testCalcDiv() {
		CalculatorPlus calc = new CalculatorPlus();
		calc.sum(300);

		assertTrue(calc.divide(6));//o divide tem que retornar true
		assertEquals(50, calc.result, 0.01);
		
		assertFalse(calc.divide(0));//o divide tem que retornar false
		assertEquals(50, calc.result, 0.01);
	}
}
