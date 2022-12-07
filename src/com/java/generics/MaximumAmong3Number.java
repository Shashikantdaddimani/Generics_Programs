package com.java.generics;
/**
 * Class to create MaximumStringNumber with different methods
 */
class MaximumAmong3Number<T> {
	/*
	 * Declare the variable
	 */
	T number1, number2, number3, number4;
	/*
	 * Parameterized constructor
	 */
	public MaximumAmong3Number(T number1, T number2, T number3, T number4) {
		
		this.number1 = number1;
		this.number2 = number2;
		this.number3 = number3;
		this.number4 = number4;
	}
	/*
	 * Method Name:MaximumAmongThreeNumber
	 * Logic for checking the maximum Number For given value.
	 */
	public static <T extends Comparable<T>> T maximumAmong3Number(T number1, T number2, T number3, T number4)
	{
		T maximum = number1;
		if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0 && number1.compareTo(number4) > 0  )
			maximum = number1;
		else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0 && number2.compareTo(number4) > 0)
			maximum = number2;
		else if (number3.compareTo(number4) > 0)
			maximum = number3;
		else
			maximum = number4;
		return maximum;
	}
	/*
	 * 
	 */
	public static <E> void printMaximum(E number1, E number2, E number3, E number4, E maximum) {
		System.out.println(maximum);
	}
	public static void main(String[] args) {
		/*
		 * Program execution starts from main method
		 */
		System.out.println("The maximum Number Among 3 Integer numbers is: "+maximumAmong3Number(150,22,27,65));
		System.out.println("The maximum Number Among 3 Float numbers is: "+maximumAmong3Number(32.5f,56.98f,78.99f,65.23f));
		System.out.println("The maximum Number Among 3 String numbers is: "+maximumAmong3Number("Apple", "Dragonfruit", "Banana", "Grapes"));
	}

}
