package com.sa;

public class MyThread01 extends Thread {
	MyThread01(){
		super();
	}
	MyThread01(Runnable target){
		super(target);
	}
	public void run() {
		System.out.println("MyThread run()");
	}

}
