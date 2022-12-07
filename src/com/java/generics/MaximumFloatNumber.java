package com.java.generics;
/**
 * Class to create MaximumIntegerNumber with different methods
 */
public class MaximumFloatNumber {
	/*
	 * Method Name:maximumNumberInteger logic for checking the Maximum Number given
	 * among three Integer value
	 */
	public static Float maximumFloatNumber(Float number1, Float number2, Float number3) {
		Float maximum = number1;
		if (number1.compareTo(number2) > 0 && number1.compareTo(number3) > 0)
			maximum = number1;
		else if (number2.compareTo(number1) > 0 && number2.compareTo(number3) > 0)
			maximum = number2;
		else
			maximum = number3;
		return maximum;
	}

	/*
	 * Program execution starts from main method
	 */
	public static void main(String[] args) {
		System.out.println("Welcome to the Genarics Program");
		System.out.println("The Maximum Number Among 3 numbers is: " + maximumFloatNumber(186.45f,86.23f, 58.43f));
	}
}
