package tut1.api.executor.running;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import tut.common.LoopTaskA;

public class UsingFixedThreadPool {

	public static void main(String[] args) {
		System.out.println("Main Thread Starts here...");
		
		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		//start all task concurrently
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		executorService.execute(new LoopTaskA());
		
		executorService.shutdown();
		
		System.out.println("Main Thread Ends here...");
	}
}
