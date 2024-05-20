package com.jdy.exer5;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Car car = new Car();  인터페이스는 객체 생성 못함
		Truck truck = new Truck();
		
		Car car;  // 인터페이스의 객체 선언까지는 가능
		
		car = truck;  // upcasting은 가능
		
		car.frontDrive();
		
		
		
		
		
		
		
	}

}
