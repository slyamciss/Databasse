package com.test.pnt;

public class Method_Overloading {
/*
 * same name of methods with different parameters
 */
	public static void main(String[] args) {
		Method_Overloading mover = new Method_Overloading();
		mover.multiplyNumber();
		mover.multiplyNumber(5, 24);

	}

	public void multiplyNumber() {
		int num1 = 10;
		int num2 = 20;
		int result = num1 * num2;
		System.out.println("the result is " +result);
	}
	
	public void multiplyNumber(int num1,int num2) {
		int result = num1 * num2;
		System.out.println("the result is " +result);
	}
}
