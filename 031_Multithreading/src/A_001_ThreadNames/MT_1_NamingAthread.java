package A_001_ThreadNames;

class MyThread2 extends Thread {

	@Override
	public void run() {
		System.out.println("Enter My2Thread "+Thread.currentThread().getName());
		System.out.println("Enter My2Thread "+Thread.currentThread().getId());
		System.err.println("exit My2Thread");
	}
}

class MyThread extends Thread {
	MyThread(String s) {
		super(s);
	}

	@Override
	public void run() {
		System.out.println("Enter MyThread "+Thread.currentThread().getName());
		System.out.println("Enter MyThread "+Thread.currentThread().getId());

		System.err.println("exit MyThread");
	}
}

public class MT_1_NamingAthread {
	public static void main(String... strings) {
		MyThread a = new MyThread("Me Hu thread");
		MyThread2 b = new MyThread2();
		a.start();
		b.start();
		System.out.println("Enter main "+Thread.currentThread().getName());
		System.out.println("Enter main "+Thread.currentThread().getId());
		System.err.println("Exit main");

	}
}
