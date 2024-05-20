package com.jdy.exer5;

public interface Car {
	
	String modelName = "galaxy";  // 인터페이스는 상수 필드만 선언 가능
	
	public void frontDrive();  // 인터페이스에서는 일반메소드로 선언해도 추상메소드가 됨
	public void rearDrive();
	public void stopDrive();
	public abstract void horn();  //abstract 사용 가능
	
}


