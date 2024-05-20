package com.jdy.AbstactClass;

public abstract class Car {
	String model;
	String color;
	int carAge;
	
	public abstract void drive();  // 추상메소드는 바디(내용)이 없고 선언부만 있음
	
	
	public void horn() {
		System.out.println("빵빵");
	}
}
