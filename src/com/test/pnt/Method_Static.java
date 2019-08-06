package com.test.pnt;

public class Method_Static {

	public static void main(String[] args) {
		/*
		 * A static method belong to the class and not to the object. Don't need to
		 * create an object inside of the class to access the static method.
		 */
		addNumber(20, 15);
	}

	public static int addNumber(int number1, int number2) {
		int total = number1 + number2;
		System.out.println("The total is " + total);
		return total;
	}

}
