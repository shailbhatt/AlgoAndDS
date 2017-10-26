package tut1.api.executor.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tut.common.LoopTaskA;

public class UsingCachedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main Thread Starts here...");
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		//serialize execution of the task
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		
		executorService.shutdown();
		
		System.out.println("Main Thread Ends here...");
	}
}
