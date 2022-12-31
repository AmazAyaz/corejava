package producerconsumer1;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest {

	public static void main(String[] args) {
		

	Queue<Integer> sharedQueue = new LinkedList<>();
	
	Producer producer = new Producer(sharedQueue);
	
	Consumer consumer = new Consumer(sharedQueue);
	
	Thread t1 = new Thread(producer);
	
	Thread t2 = new Thread(consumer);
	
	t1.start();
	t2.start();
	
	}

}
