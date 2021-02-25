package com.sa;

public class MyThread08 extends Thread {
	
	public void run() {
		System.out.println("run()");
		
	}
	
	public void start() {
		System.out.println("start()");
		super.start();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread08 th=new MyThread08();
		th.start();
		System.out.println("main()");

	}

}
