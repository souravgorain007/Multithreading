package com.sa;

public class MultipleThreadWithSameLogic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread07 th1=new MyThread07();
		th1.setX(3);
		th1.start();
		
		MyThread07 th2=new MyThread07();
		th2.setX(4);
		th2.start();
		
		MyThread07 th3=new MyThread07();
		th3.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Main"+i);
		}

	}

}
