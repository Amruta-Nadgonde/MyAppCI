package com.mycompany.app;
import static org.junit.Assert.*;

import org.junit.Test;

import com.mycompany.app.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		int exp = 30;
		Calculator cal = new Calculator();
		int act = cal.add(10, 20);
		assertEquals(exp, act);
	}
	
	@Test
	public void testmultiply() {
		int exp = 300;
		Calculator cal = new Calculator();
		int act = cal.multiply(10, 30);
		assertEquals(exp, act);
	}
	
	@Test
	public void testDivide() {
		int exp = 3;
		Calculator cal = new Calculator();
		int act = cal.divide(30,10);
		assertEquals(exp, act);
	}
	
	@Test
	public void testSubtract() {
		int exp = 20;
		Calculator cal = new Calculator();
		int act = cal.subtract(30,10);
		assertEquals(exp, act);
	}
	
	
	

}
