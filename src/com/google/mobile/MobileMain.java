package com.google.mobile;

import java.util.Scanner;

public class MobileMain {

	public static void main(String[] args) {

		PhoneView pv = new PhoneView();
		Scanner sc = new Scanner(System.in);
		
		Phone p1 = new Phone();
		Phone p2 = new Phone(100);
		Phone p3 = new Phone(80, "silver");
		Phone p4 = new Phone(1000, "BLACK", 200);
		
		pv.view(p1);
		pv.view(p2);
		pv.view(p3);
		pv.view(p4);
		
		//Phone phone = new Phone(); // new phone 생성자 호출
		//Phone phone2 = new Phone();
		//phone2.price=100;

		Pad pad = new Pad("Apple", 200);
		Pad pad2 = new Pad();
		
		
		
		
	}

}
