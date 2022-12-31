package producerconsumer2;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerTest {

public static void main (String args[]) {
	
	Queue<Integer> queue = new LinkedList<>();
	
	Producer producer = new Producer(queue);
	Consumer consumer = new Consumer(queue);
	
	Thread t1 = new Thread(producer);
	Thread t2 = new Thread(consumer);
	
	t1.start();
	t2.start();
	
}



}
