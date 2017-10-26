package tut1.api.threads.running;

import java.util.concurrent.TimeUnit;

public class SecondWay {
	public static void main(String[] args) {
		System.out.println("Main thread start..");
		
		new SecondTask();
		new SecondTask();
		
		System.out.println("Main thread end..");
	}

}

class SecondTask implements Runnable{
	
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
	
	SecondTask(){
		this.id = ++count;
		new Thread(this).start();
	}
	
}
