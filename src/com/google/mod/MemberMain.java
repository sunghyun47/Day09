package com.google.mod;

public class MemberMain {

	public static void main(String[] args) {

		Member member = new Member("park", 29, 73, 181);
		member.check();
		
		// 관리후
		member.check();
		member.setAge(56);
		
		int age = member.getAge();
		System.out.println(age);
		
	}

}
