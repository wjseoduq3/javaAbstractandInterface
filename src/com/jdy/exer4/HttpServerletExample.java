package com.jdy.exer4;

public class HttpServerletExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		추후에 아랫부분 수정 필요
//		method(new LoginServelet());
//		method(new FileDownLoadServelet());
	}
	
	public static void method(HttpServerlet servelet) {
		servelet.service();	

	}

}
