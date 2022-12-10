package com.java.generics;
/**
 * Class to create MaximumStringNumber with different methods
 */
public class MaximumAmongThreeNumber <T>{
	/*
	 * Declare the veriable
	 */
	T number1, number2, number3;
	/*
	 * Parameterized constructor
	 */
	public MaximumAmongThreeNumber(T number1, T number2, T number3){
		
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
	}
	/*
	 * Method Name:MaximumAmongThreeNumber
	 * Logic for checking the maximum Number For given value.
	 */
	public static <T extends Comparable<T>> T maxAmong3Number(T number1, T number2, T number3)
	{
		T maximum = number1;
		if(number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
			maximum = number1;
		else if(number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
			maximum = number2;
		else
			maximum = number3;
		return maximum;
	}
	public static void main(String[] args) {
		/*
		 * Program execution starts from main method
		 */
		System.out.println("The maximum Number Among 3 Integer numbers is: "+maxAmong3Number(1504,22,27));
		System.out.println("The maximum Number Among 3 Float numbers is: "+maxAmong3Number(32.5f,56.98f,78.99f));
		System.out.println("The maximum Number Among 3 String numbers is: "+maxAmong3Number("Apple", "Dragonfruit", "Banana"));
	}
}
