package A_007_InteraThreaCommunication;

class MyThread2 extends Thread {
	long total = 0;
	MyThread c = new MyThread();

	MyThread2(MyThread c) {
		this.c = c;
	}

	@Override
	public void run() {
		synchronized (c) {
			try {
				c.wait(); // MyThread ke complete hone tak wait karega
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(c.total + " here Value");
		}
	}
}

class MyThread extends Thread {
	long total = 0;

	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0; i <= 999999; i++) {
				total += i;
			}
			this.notify(); // wait kar rahe thread ko notify karega
			this.notify(); // wait kar rahe thread ko notify karega
		}
	}
}

public class InteraThreadCommunication {
	public static void main(String[] args) throws InterruptedException {
		MyThread a = new MyThread();
		MyThread2 b = new MyThread2(a);

		// b ko wahi MyThread ka reference dena zaroori hai kyu i use uska Object Lock
		// chyia hoga
		b.start();
		a.start();

		synchronized (a) {
			a.wait(); // main thread wait karega jab tak MyThread notify nahi karta
		}
		System.out.println(a.total);
	}
}
