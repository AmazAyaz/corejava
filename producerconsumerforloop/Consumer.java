package producerconsumerforloop;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

private BlockingQueue<Integer> sharedQueue;

public Consumer(BlockingQueue<Integer> sharedQueue) {
	
	this.sharedQueue = sharedQueue;
	
}

public void run() {
	
	while (true) {
		
		try {
		System.out.println("consumer consumed" + sharedQueue.take() );
		
	} catch (Exception ex) {
		ex.printStackTrace();
	}
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		
		e.printStackTrace();
	}
	}
}






}
