package producer_consumer;

class Resource {
	private int i = 0;
	private boolean available = false;

	public synchronized void get() {
		while (!available) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}
		}
		System.out.println("CONSUMED : " + i);
		available = false;
		notify();
	}

	public synchronized void put() {
		while (available) {
			try {
				wait();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
				return;
			}
		}
		i++;
		System.out.println("PRODUCED : " + i);
		available = true;
		notify();
	}
}

class Producer implements Runnable {

	Resource r;

	Producer(Resource r) {
		this.r = r;
		Thread t1 = new Thread(this, "Producer");
		t1.start();
	}

	@Override
	public void run() {
		while (true) {
			r.put();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Consumer implements Runnable {

	Resource r;

	Consumer(Resource r) {
		this.r = r;
		Thread t2 = new Thread(this, "Consumer");
		t2.start();
	}

	@Override
	public void run() {
		while (true) {
			r.get();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

public class ProducerConsumerDemo {
	public static void main(String[] args) {
		Resource r = new Resource();
		Producer p = new Producer(r);
		Consumer c = new Consumer(r);
	}
}