package producerconsumer1;

import java.util.Queue;

public class Consumer implements Runnable {

private Queue<Integer> sharedQueue;

public Consumer(Queue<Integer> shareQueue) {
	
	this.sharedQueue = shareQueue;
}

@Override
public void run() {
	
	while(true) {
		
		synchronized(sharedQueue) {
		
		while(sharedQueue.isEmpty()) {
			
			System.out.println("Consumer is waiting for producer");
			
			try {
				sharedQueue.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
			int consumedData = sharedQueue.poll();
			
			System.out.println("consumer consumed data" + consumedData);
			
			sharedQueue.notify();
		
		
		
		
	}
}



}

}
