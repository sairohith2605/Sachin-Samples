package com.fundamentals;

import com.calculator.*;
public class Application {
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		Application application = new Application();
		application.displayOutput();
		
		Arithmetic a = new Arithmetic();
		float sum = a.addNumbers(23, 50.4f);
		System.out.println(sum);
		Addition add = new Addition(145, 980);
		int sum_add = add.addDefault();
		System.out.println(sum_add);
		
		Multiplication mx = new Multiplication();
		int product = mx.multiply(635, 121);
		System.out.println(product);
	}
	
	public void displayOutput() {
		String s = "The result of the operation is";
		System.out.println("Output!");
	}
}
