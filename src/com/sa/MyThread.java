package com.sa;

public class MyThread extends Thread{
	public void run() {
		System.out.println("MyThread class run method");
	}
	
	public static void main(String args[]) {
		
		MyThread mt=new MyThread();
		mt.start();
		System.out.println("Main Method");
	}
	

}
