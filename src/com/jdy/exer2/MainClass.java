package com.jdy.exer2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Company company = new Company();
		company.name = "홍길동";
		
		company.human1 = new Student();
		company.human2 = new Worker();
		company.human3 = new Solidger();
		// company.human4;
		
		Human human = new Worker();
		
		company.work(human);
	}

}
