package com.test.pnt;

public class Exceptions_Class {

	public static void main(String[] args) {
		
		System.out.println("before try catch");
		
		try {
			int val1 = 20;
			int val2 = val1/0;
			System.out.println("The value is " + val2);

		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Excecution Ended");
		}
	}

}
