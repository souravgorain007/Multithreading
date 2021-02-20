package com.sa;

public class MyThread03 extends Thread {
	public void run() {
		for(int i =20 ; i>=1 ; i--) {
			System.out.println("run():"+i);
		}
	}
	public static void main(String args[]) {
		MyThread03 th=new MyThread03();
		//th.run();
		//th.start();
		th.run();
		//th.start();
		for(int i=1; i<=20;i++) {
			System.out.println("main():"+i);
		}
				
	}

}
