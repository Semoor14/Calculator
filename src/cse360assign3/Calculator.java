/**
 * Class performs basic calculator operations on total including
 * add, subtract, multiply, and divide. Calculator also returns a history
 * of operation performed.
 * 
 * @author Scott Moore @version 3  
 * */
package cse360assign3;

public class Calculator {

	private int total;
	
	private String history;
	
	public Calculator () {
		
		total = 0;  // not needed - included for clarity
		
		history = "0"; // initializes history string to 0 for base case
		
	}
	
	/**Returns the total calculated by Calculator methods called. */
	public int getTotal () {
		
		return total; 
		
	}
	
	/**
	 * Adds value passed to total and updates history to reflect operation performed.
	 * 
	 * @param value	Value added to the total, history string updated with " + " followed by value
	 */
	public void add (int value) {
		
		total += value;
		
		history = history + " + " + value;
		
	}
	
	/**
	 * Subtracts value passed to total and updates history to reflect operation performed.
	 * 
	 * @param value Value subtracted from the total, history string updated with " - " followed by value
	 */
	public void subtract (int value) {
		
		total -= value;
		
		history = history + " - " + value;
		
	}
	
	/**
	 * Multiplies value passed to total and updates history to reflect operation performed.
	 * 
	 * @param value Value multiplied by the total, history string updated with " * " followed by value
	 */
	public void multiply (int value) {
		
		total *= value;
		
		history = history + " * " + value;
		
	}
	
	/**
	 * Divides value passed to total and updates history to reflect operation performed.
	 * 
	 * @param value Value divided by the total, history string updated with " / " followed by value
	 */
	public void divide (int value) {
		
		if (value == 0){ //if dividing by 0 make total 0
			
			total = 0;
			
		}
		else{ //else divide total by passed value
			
			total /= value;
		
		}
		
		history = history + " / " + value;
	}
	
	/**
	 * Contains a record of operations in string form  ex. "0 + 1 * 2"
	 * @return history 
	 */
	public String getHistory () {
		
		return history;
	}
}