package com.jdy.AbstactClass;

public abstract class Phone {
	public String owner;

	public Phone(String owner) {
		super();
		this.owner = owner;
	}
	
//	public void turnOn() {
//		System.out.println("전원을 켭니다.");			
//	}
//	
//	public void turnOff() {
//		System.out.println("전원을 끕니다.");
	
	public abstract void turnOn();
	
	public abstract void turnOff();

	
	
}
