package com.google.overloading;

public class Cal {

	public int plus(int a, int b) {
		int sum = a+b;
		return sum;
	}
	
	public float plus(int a, float b) {
		float sum = a+b;
		return sum;
	}
	
	public float plus(float a, float b) { // plus : 메소드 오버로딩
		return a+b;
	}
	
	
	
	
	
	
}
