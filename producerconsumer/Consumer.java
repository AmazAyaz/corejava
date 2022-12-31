package producerconsumer;

import java.util.Queue;

public class Consumer implements Runnable {

    private Queue<Integer> sharedQueue;
    
    private int MAX_SIZE = 5;
    
    public Consumer(Queue<Integer> sharedQueue) {
    	
    	this.sharedQueue = sharedQueue;
    }
    
    
	
	
	@Override
	public void run() {
		
		while(true) {
			
			synchronized(sharedQueue) {
				
				while (sharedQueue.isEmpty()) {
					
					try {
					
					System.out.println("Consumer is waiting for producer to produce object..");
					
					sharedQueue.wait();
					
					} catch (InterruptedException e) {
						
						e.printStackTrace();
					}
					
				}
			
				int data = sharedQueue.poll();
				System.out.println("Consumed::"+data);
				sharedQueue.notify();
			}
		}
		
	}

 


}
