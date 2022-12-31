package producerconsumerforloop;


import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

private BlockingQueue<Integer> sharedQueue;


public Producer(BlockingQueue<Integer> sharedQueue) {
	
	this.sharedQueue = sharedQueue;
}
	
	

@Override
public void run() {

	while(true) {
	for(int i=0 ; i<=10 ; i++) {
		
		System.out.println("Producer produced " + i);
		
		try {
			sharedQueue.put(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	try {
		Thread.sleep(2000);
		
	} catch (InterruptedException ex) {
		ex.printStackTrace();
	}
		
	}
	
}
	
}


}
