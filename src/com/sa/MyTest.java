package com.sa;

public class MyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th1=new Thread();
		th1.start();
		MyThread01 mt =new MyThread01();
		mt.start();
		MyRunnable mr=new MyRunnable();
		//mr.start();
		Thread th2=new Thread(mr);
		th2.start();
		Thread th3=new Thread(mt);
		th3.start();
		Thread th4=new MyThread01();
		th4.start();
		//Thread th5=new MyRunnable();
		Runnable r =new MyThread01();
		//r.start();
		

	}

}
