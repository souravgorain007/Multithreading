package com.sa;

public class MyThread04 extends Thread{
	
	public void run() {
		for(int i=5; i<=5; i++) {
			System.out.println(getName()+"Run"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyThread04 th1=new MyThread04();
		th1.start();
		
		MyThread04 th2=new MyThread04();
		th2.start();
		
		MyThread04 th3=new MyThread04();
		th3.start();

	}

}
