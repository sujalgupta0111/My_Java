package A_007_InteraThreaCommunication;

import java.util.LinkedList;
import java.util.Queue;

class ProConsum {
	private final Queue<Integer> queue = new LinkedList<>();
	private final int capacity;

	public ProConsum(int capacity) {
		this.capacity = capacity;
	}

	public synchronized void produce(int value) {
		while (queue.size() == capacity) { // Buffer full
			try {
				System.out.println(Thread.currentThread().getName() + " waiting (Buffer full)");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		queue.add(value);
		System.out.println(Thread.currentThread().getName() + " produced: " + value);
		notifyAll(); // Notify all waiting threads (consumers + producers)
	}

	public synchronized void consume() {
		while (queue.isEmpty()) { // Buffer empty
			try {
				System.out.println(Thread.currentThread().getName() + " waiting (Buffer empty)");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		int val = queue.poll();
		System.out.println(Thread.currentThread().getName() + " consumed: " + val);
		notifyAll(); // Notify all waiting threads
	}
}

class Producer extends Thread {
	ProConsum buffer;
	Producer(String name,ProConsum buffer){
		super(name);
		this.buffer=buffer;
	}
	@Override	
	public void run() {
		for (int i = 1; i <= 5; i++) {
			buffer.produce(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Consumer extends Thread{
	ProConsum buffer;
	Consumer(String name,ProConsum buffer){
		super(name);
		this.buffer=buffer;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			buffer.consume();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}


public class ProducerConsumer {

	public static void main(String[] args) {
		ProConsum buffer = new ProConsum(5);
		Producer p = new Producer("Producer 1",buffer);
		Producer p1 = new Producer("Producer 2",buffer);
		Consumer c = new Consumer("Consumer 1",buffer);
		Consumer c1 = new Consumer("Consumer 2",buffer);
		p.start();
	//	p1.start();
		c.start();
		//c1.start();

	}

}
