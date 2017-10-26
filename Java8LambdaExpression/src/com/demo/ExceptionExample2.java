package com.demo;

public class ExceptionExample2 {
	
	public static void main(String[] args) {

		Thread t = new Thread(new MyThread(){
			public void run(){
				System.out.println("FOO");
			}
		});
		
		t.start();
	}


}

class MyThread implements Runnable {
	
	MyThread(){
		System.out.println("My Thread");
	}
	
	public void run() {
		System.out.println("bar");
	}
	
	public void run (String n ){
		System.out.println("Overloaded run method: "+ n);
		
	}
}