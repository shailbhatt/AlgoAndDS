package tut1.api.threads.running;

import java.util.concurrent.TimeUnit;

public class ThirdWay {
	public static void main(String[] args) {
		System.out.println("Main thread start..");
		
		new Thread(new ThirdTask()).start();
		
		Thread t = new Thread(new ThirdTask());
		t.start();
		
		System.out.println("Main thread end..");
	}

}

class ThirdTask implements Runnable{
	
	private static int count = 0;
	private int id ;
	
	@Override
	public void run() {
		for(int i=10 ; i>0 ; i--){
			System.out.println("<"+ id + "> TICK TICK..."+i);
			try {
				TimeUnit.MILLISECONDS.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	ThirdTask(){
		this.id = ++count;
	}
	
}
