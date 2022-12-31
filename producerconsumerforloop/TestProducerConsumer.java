package producerconsumerforloop;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class TestProducerConsumer {

public static void main(String[] args) {
	
	BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
	
	Producer producer = new Producer(queue);
	
	Consumer consumer = new Consumer(queue);
	
	Thread t1 = new Thread(producer);
	
	Thread t2 = new Thread(consumer);
	
	t1.start();
	
	t2.start();
	
	
	
}

}
