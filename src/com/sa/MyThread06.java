package com.sa;

public class MyThread06 extends Thread {
	
	int x;
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void run() {
		for(int i=1; i<=this.x; i++) {
			System.out.println(getName()+"Run"+i);
		}
	}

}
