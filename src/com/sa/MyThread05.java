package com.sa;

public class MyThread05 extends Thread {

	int x;
	
	MyThread05(int x){
		this.x=x;
	}
	
	public void run() {
		for(int i=1; i<=this.x;i++) {
			System.out.println(getName()+"Run"+i);
		}
	}
}
