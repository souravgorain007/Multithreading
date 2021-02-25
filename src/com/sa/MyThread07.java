package com.sa;

public class MyThread07 extends Thread{
	
	int x;
	boolean xInitialized=false;
	
	public void setX(int x) {
		this.x=x;
		xInitialized=true;
	}
	
	public void run() {
		if(!xInitialized) {
			throw new IllegalStateException("Error: x is not initialized for the thread["+getName()+"]");
		}
		
		for(int i=1;i<=this.x;i++) {
			System.out.println(getName()+"Run"+i);
		}
	}

}
