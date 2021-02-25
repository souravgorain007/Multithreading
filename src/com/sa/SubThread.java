package com.sa;

public class SubThread extends Thread{
	int dif=0;
	public void run() {
		for(int i=50;i>=1;i--) {
			dif -=i;
			System.out.println("Dif: "+dif);
		}
	}

}
