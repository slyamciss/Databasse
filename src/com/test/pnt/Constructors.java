package com.test.pnt;

public class Constructors {

	public static void main(String[] args) {
		Constructors const1 = new Constructors();
		Constructors const2 = new Constructors(10, 5);
		const2.print_Name();
	}

	public Constructors() {
		System.out.println("Inside the default constructor");

	}

	public Constructors(int num1, int num2) {
		int total = num1 + num2;
		System.out.println("The total is " + total);
	}
	
	public void print_Name() {
		System.out.println("My name is selenium");

	}

}
