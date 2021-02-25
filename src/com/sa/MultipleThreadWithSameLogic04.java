package com.sa;

public class MultipleThreadWithSameLogic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddThread th1=new AddThread();
		th1.start();
		
		SubThread th2=new SubThread();
		th2.start();
		
		System.out.println("Main executed");

	}

}
