package com.google.overloading;

import com.google.mobile.Phone;

public class OverMain {

	public static void main(String[] args) {

		Cal cal = new Cal();
		CalView calView = new CalView();
		
		int hap = cal.plus(10, 20);
		float fhap = cal.plus(10.2f,  20.2f);
		calView.viewFloat(fhap);
		
		Phone phone = new Phone(); //핸드폰 객체는 만들수있음
		phone.info(); // public 이기 때문에 다른패키지에서 사용가능
		
		
		
		
	}

}
