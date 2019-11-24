package com.calculator;

public class Addition {
	
	public Addition(int x, int y) {
		adx = x;
		ady = y;
	}

	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
	
	public int addDefault() {
		int c = adx + ady;
		return c;
	}
	
	// Instance Variables
	int adx, ady;
}
