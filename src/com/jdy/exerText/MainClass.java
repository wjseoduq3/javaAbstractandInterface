package com.jdy.exerText;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();
		tire.run();

	}

}
