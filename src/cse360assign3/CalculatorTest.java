package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	
	@Test
	public void testCalculator(){
		
		Calculator calc = new Calculator();
		
		assertNotNull(calc);
	}
	
	@Test
	public void testGetTotal(){
		
		Calculator calc = new Calculator();
		
		assertEquals(calc.getTotal(), 0);
		
	}
	
	@Test
	public void testAdd(){
		
		Calculator calc = new Calculator();
		
		calc.add(4);
		
		assertEquals(calc.getTotal(), 4);
		
		calc.add(5);
		
		assertEquals(calc.getTotal(), 9);
		
	}
	
	@Test
	public void testSubtract(){
		
		Calculator calc = new Calculator();
		
		calc.add(4);
		
		calc.subtract(2);
		
		assertEquals(calc.getTotal(), 2);
		
		calc.subtract(1);
		
		assertEquals(calc.getTotal(), 1);	
		
	}
	
	@Test
	public void testMultiply(){
		
		Calculator calc = new Calculator();
		
		calc.add(1);
		
		calc.multiply(5);
		
		assertEquals(calc.getTotal(), 5);
		
		calc.multiply(5);
		
		assertEquals(calc.getTotal(), 25);
			
	}
	
	@Test
	public void testDivide(){
		
		Calculator calc = new Calculator();
		
		calc.add(10);
		
		calc.divide(5);
		
		assertEquals(calc.getTotal(), 2);
		
		calc.divide(0);
		
		assertEquals(calc.getTotal(), 0);
		
		
	}
	
	@Test
	public void testGetHistory(){
		
		Calculator calc = new Calculator();
		
	}
	
}
