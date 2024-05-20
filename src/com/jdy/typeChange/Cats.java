package com.jdy.typeChange;

public class Cats extends Animal{
	String catname;
	
	public void catWorking() {
		System.out.println("고양이가 걷는다.");
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}
	
	
}
