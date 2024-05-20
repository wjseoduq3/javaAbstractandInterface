package com.jdy.AbstactClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Car car = new Car();  //추상클래스는 객체를 못만듦 --> 상속용도로만 사욜
		// Phone phone = new Phone();  추상클래스라 사용안됨.
		
		Smartphone smartphone = new Smartphone("홍길동");
		
		smartphone.turnOn();
		smartphone.turnOff();
		smartphone.internetSearch();
	}

}
