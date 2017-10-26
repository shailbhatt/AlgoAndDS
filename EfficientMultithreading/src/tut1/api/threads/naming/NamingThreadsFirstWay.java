package tut1.api.threads.naming;

import tut.common.LoopTaskB;

public class NamingThreadsFirstWay {

	public static void main(String[] args) {
		
		String currentThreadName = Thread.currentThread().getName();
		System.out.println(" [ " + currentThreadName + " ] Main Thread Starts here...");
		
		
		//Here naming the threads within the task thread
		new Thread(new LoopTaskB()).start();
		
		Thread t2 = new Thread(new LoopTaskB());
		t2.start();

		System.out.println(" [ " + currentThreadName + " ]Main Thread Ends here...");
	}

}
