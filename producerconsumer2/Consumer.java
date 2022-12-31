package producerconsumer2;

import java.util.Queue;

public class Consumer implements Runnable {

	
	
	private Queue<Integer> sharedQueue;
	
	public Consumer(Queue<Integer> sharedQueue) {
		
		this.sharedQueue = sharedQueue;
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
						
						e.printStackTrace();
					}
					
				}
				
				int consumedData = sharedQueue.poll();
				
				System.out.println("Consumer consumed data " + consumedData);
				
				sharedQueue.notify();
			}
		}
		
	}







}
