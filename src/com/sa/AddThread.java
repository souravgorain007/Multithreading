package com.sa;

public class AddThread extends Thread {
	int sum=0;
	public void run() {
		for(int i=1;i<=50;i++) {
			sum +=i;
			System.out.println("Sum: "+sum);
		}
	}
}
