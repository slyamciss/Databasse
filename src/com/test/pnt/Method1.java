package com.test.pnt;

public class Method1 {

	public static void main(String[] args) {
		Method1 m1obj = new Method1();
		m1obj.addNumber();
		m1obj.subNumber();
		m1obj.addNumberNew(30, 20);
		int mulnum = m1obj.mulNumber(5, 10);
		

	}

	public void addNumber() {
		int number1 = 10;
		int number2 = 20;
		int total = number1 + number2;
		System.out.println("The total is " + total);
	}
	
	public void subNumber() {
		int number1 = 10;
		int number2 = 20;
		int sub = number1 - number2;
		System.out.println("The sub is " + sub);
	}
	
	public void addNumberNew(int number1, int number2) {		
		int sum = number1 + number2;
		System.out.println("The total is " + sum );
	}
	
	public int mulNumber(int number1, int number2) {		
		int mulnum = number1 * number2;
		System.out.println("The multiply is " + mulnum);
		return mulnum;
	}


}
