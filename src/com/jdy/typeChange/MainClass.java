package com.jdy.typeChange;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cats cats = new Cats();
		
		// Animal animal = new Animal();
		
		// 자동타입변환
		
//		int a=100;
//		byte b=10;
//		a = b;  no error
//		b = a;  error occur
		double c = 1.5;
		int d =10;
		// d = (int)c; no error

		// animal = cats;  // 업캐스팅
		// cats = animal; error occur
		// cats = (Cats) animal;  // 임시 형변환  --> 다운캐스팅
		 
		Dog dog = new Dog();
		Tiger tiger = new Tiger();
		Cats cats1 = new Cats();
		
		
		
		// Animal animal1 = new Animal(); 추상클래스로 선언되었기 때문에 에러 발생
		// 일반적으로 if문과 같이 사용됨(아래같이 단독으로 사용되는 경우는 없음)
//		animal1 = new Dog();
//		animal1 = new Tiger();
//		animal1 = new Cats();
		
		
	}

}
