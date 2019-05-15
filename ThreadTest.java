package com.tpb.bot;

public class ThreadTest extends Thread{
	Hello h1=new Hello();

	 public void run() {
		 while (true) {
			 try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                System.out.println(e);
	            }
			 h1.HelloWorld();
	        }
	 }
	    public static void main(String args[]) {
	        ThreadTest t1 = new ThreadTest();
	        t1.start();
	    }

}
