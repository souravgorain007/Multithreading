package com.sa;

public class MultipleThreadWithSameLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread05 th1=new MyThread05(3);
		th1.start();
		
		MyThread05 th2=new MyThread05(4);
		th2.start();
		
		MyThread05 th3=new MyThread05(5);
		th3.start();

	}

}
