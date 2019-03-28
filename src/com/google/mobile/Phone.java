package com.google.mobile;

import java.nio.channels.Pipe;

public class Phone {

	String brand; //default
	int price;
	String color;
	int size;
	
	public Phone() {
		//윗줄 코드 : 디폴트 생성자, 빈생성자, 기본생성자(셋다 같은의미)
		//매개변수가 없는 생성자
		//클래스내에 생성자가 하나라도 없으면 컴파일러가 디폴트생성자를 하나 만들어줌
		
		//this.brand = "LG";
		//this.price = 200;
		//color = "RED"; //this. 생략가능
		//size = 15; //this. 생략가능
		//System.out.println("phone 제작 완료");
		//this.info();
		this(200);
	}
	
	public Phone(int price) {
		this(price, "RED");
		
//		this.brand = "LG";
//		this.price=price;
//		color = "RED"; //this. 생략가능
//		size = 15; //this. 생략가능
	}
	
	//가격 색깔 다르게 출력
	public Phone(int price, String color) {
		this(price, color, 15);
		
//		this.brand = "LG";
//		this.price = price;
//		this.color = color;
//		size = 15;
	}
	//가격 칼라 사이즈 다르게 출력
	public Phone(int price, String color, int size) {
		this.brand = "LG";
		this.price = price; //price : 매개변수
		this.color = color; //color : 매개변수
		this.size = size;
	}
	
	public void info() {
		System.out.println("phone~~~~~~~~~~~~~~");
	}
	
	
	
}
