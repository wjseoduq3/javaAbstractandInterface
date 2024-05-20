package com.jdy.exer2;

public class Company {
	
	String name;  // 필드
	int age;  // 필드
	
	Human human = new Human();  // 필드
	

	Human human1 = new Human();
	Human human2 = new Human();
	Human human3 = new Human();
	Human human4 = new Human();
	
	public void work(Human human) {
		human.namePrint();
	}

}
