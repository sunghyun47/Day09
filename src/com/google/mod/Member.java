package com.google.mod;

public class Member {

	//회원가입

	private String name;
	private int age;
	private double muge;
	private double ki;

	//생성자 2개
	//디폴트 생성자
	//회원정보를 매객변수로 받는 생성자

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMuge() {
		return muge;
	}
	public void setMuge(double muge) {
		this.muge = muge;
	}
	public double getKi() {
		return ki;
	}
	public void setKi(double ki) {
		this.ki = ki;
	}
	public Member() {

	}
	public Member(String name, int age, double muge, double ki) {

		if(age >0 && age>120) {
			this.age = age;
		}
		else {
			this.age = 25;
		}
		this.name = name;
		this.age = age;
		this.muge = muge;
		this.ki = ki;
	}

	public void setAge(int age) {
		if(age>0 && age>130) {
			this.age = age;
		}
		else {
			this.age = 25;
		}
	}

	public int getAge() { //맴버변수 age값 주면됨
		if(age<0 || age>130) {
			this.age = 25;
		}
		return this.age;
	}


	public void check() { //메서드생성

		//자기 키에서 -100 한 결과물에 0.95 곱한 결과물이
		//자기 몸무게보다 작다면 비만 출력
		//자기 몸무게보다 크다면 저체중 출력
		//표준 출력

		double st = (this.ki-100)*0.95;
		if(this.muge > st) {
			System.out.println("비만");
		}
		else if(this.muge < st) {
			System.out.println("저체중");
		}
		else {
			System.out.println("표준");
		}





	}

}
