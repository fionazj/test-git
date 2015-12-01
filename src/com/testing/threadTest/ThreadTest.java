package com.testing.threadTest;


public class ThreadTest extends Thread{
	public static void main(String args[]){
		ThreadTest tr1 = new ThreadTest();
		ThreadTest tr2 = new ThreadTest();
		tr1.start();
		tr2.run();
	}
	
//	public void run(){
//		System.out.println(this.getName());
//		System.out.println("mythread.run()");
//	}
}
