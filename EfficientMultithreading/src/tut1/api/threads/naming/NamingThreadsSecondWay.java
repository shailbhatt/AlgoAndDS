package tut1.api.threads.naming;

import java.util.concurrent.TimeUnit;

import tut.common.LoopTaskC;

public class NamingThreadsSecondWay {

	public static void main(String[] args) {
		
		String currentThreadName = Thread.currentThread().getName();
		System.out.println(" [ " + currentThreadName + " ] Main Thread Starts here...");
		
	
		new Thread(new LoopTaskC(), "My Thread-1").start();
		
		Thread t2 = new Thread(new LoopTaskC());
		//t2.setName("My Thread-2");
		t2.start();
		
		try {
			TimeUnit.MILLISECONDS.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//changing name of the thread at runtime
		//Not advisable to do so
		t2.setName("My Thread-2");

		System.out.println(" [ " + currentThreadName + " ]Main Thread Ends here...");
	}

}
