/**
 * Class tests basic Calculator method operations, constructor is tested as well as
 * addition, subtraction, multiplication, division and history.
 * 
 * @author Scott Moore @version 3  
 * */
package cse360assign3;


import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	
	@Test
	public void testCalculator(){
		
		Calculator calc = new Calculator();
		
		assertNotNull(calc); //calc private variables initializes as 0 not NULL
	}
	
	@Test
	public void testGetTotal(){
		
		Calculator calc = new Calculator();
		
		assertEquals(calc.getTotal(), 0); //constructor initializes total to 0 expected value 0
		
	}
	
	@Test
	public void testAdd(){
		
		Calculator calc = new Calculator();
		
		calc.add(4);
		
		assertEquals(calc.getTotal(), 4); // 4 added to initialized total of 0
		
		calc.add(5);
		
		assertEquals(calc.getTotal(), 9);// 5 added to previous total value of 4 equaling 9
		
	}
	
	@Test
	public void testSubtract(){
		
		Calculator calc = new Calculator();
		
		calc.add(4); //4 added to total value of 0 to test subtraction
		
		calc.subtract(2);
		
		assertEquals(calc.getTotal(), 2);// 2 subtracted from 4 to equal 2
		
		calc.subtract(1);
		
		assertEquals(calc.getTotal(), 1);// 1 subtracted from 2 to equal 1
		
	}
	
	@Test
	public void testMultiply(){
		
		Calculator calc = new Calculator();
		
		calc.add(1); //1 added to total of 0 to test multiplication
		
		calc.multiply(5);
		
		assertEquals(calc.getTotal(), 5);//1 multiplied by 5 equaling 5
		
		calc.multiply(5);
		
		assertEquals(calc.getTotal(), 25);//5 multiplied by 5 equaling 25
			
	}
	
	@Test
	public void testDivide(){
		
		Calculator calc = new Calculator();
		
		calc.add(10);//10 added to total of 0 to test division
		
		calc.divide(5);
		
		assertEquals(calc.getTotal(), 2);//10 divided by 5 to equal 2
		
		calc.divide(0);
		
		assertEquals(calc.getTotal(), 0);//2 divided by 0 to equal 0 per special case in calculator class
		
		
	}
	
	@Test
	public void testGetHistory(){
		
		Calculator calc = new Calculator();
		
		calc.add(2); //2 added to test history "0 + 2"
		
		calc.subtract(1);//1 subtracted to test history "0 + 2 - 1"
		
		calc.divide(0);//0 divided to test history "0 + 2 - 1 / 0"
		
		calc.add(5);//5 added to test history " 0 + 2 - 1 / 0 + 5"
		
		calc.multiply(2);//2 multiplied to test history "0 + 2 - 1 / 0 + 5 * 2"
		
		assertEquals(calc.getHistory(),"0 + 2 - 1 / 0 + 5 * 2");
	}
	
}
