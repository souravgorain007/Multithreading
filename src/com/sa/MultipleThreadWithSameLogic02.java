package com.sa;

public class MultipleThreadWithSameLogic02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread06 th1=new MyThread06();
		th1.setX(3);
		th1.start();
		
		MyThread06 th2=new MyThread06();
		th2.start();
		
		for(int i=1; i<=5; i++) {
			System.out.println("Main"+i);
		}

	}

}
