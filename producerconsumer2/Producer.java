package producerconsumer2;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {

	private Queue<Integer> sharedQueue;
	
	int MAX_SIZE = 5;
	
	public Producer(Queue<Integer> sharedQueue) {
		
		this.sharedQueue = sharedQueue;
		
		
	}

	@Override
	public void run() {
     
		while (true) {
			
			synchronized(sharedQueue) {
				
				while (sharedQueue.size() == 5) {
				 
					System.out.println("Producer is waiting for consumer");
					
					try {
					sharedQueue.wait();
					} catch(InterruptedException ex) {
						
						ex.printStackTrace();
						
					}
				}
				
				int data = new Random().nextInt(MAX_SIZE);
				
				sharedQueue.add(data);
				
				System.out.println("Producer produced " + data);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				sharedQueue.notify();
			}
			
		}
	}

}
