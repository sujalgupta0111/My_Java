package A_006_Synchronization.Methods;

class Syncroni {
	public void m2() {
		for (int i = 0; i < 2; i++) {
			System.out.println("M2() " + Thread.currentThread().getName());
		}
	}

	synchronized void m1() {
		for (int i = 0; i < 2; i++) {
			System.out.println("M1() " + Thread.currentThread().getName());
		}
	}

	void m3() {
		for (int i = 0; i < 2; i++) {
			System.out.println("M3() " + Thread.currentThread().getName());
		}
	}
}

class MyThread extends Thread {
	Syncroni a;

	MyThread() {
		super("My Thread");
	}

	MyThread(Syncroni a) {
		super("My Thread");
		this.a = a;
	}

	public void run() {
		a.m1();
		a.m2();
		a.m3();

	}
}

class MyThread2 extends Thread {
	Syncroni a = new Syncroni();

	MyThread2() {
		super("My Thread2");
	}

	MyThread2(Syncroni a) {
		super("xyz");
		this.a = a;
	}

	public void run() {
		a.m1();
		a.m2();
		a.m3();

	}
}

public class SyncronizationObjectLevelock {

	public static void main(String[] args) {
		Syncroni a = new Syncroni();
		MyThread b = new MyThread(a);
		MyThread2 b2 = new MyThread2(a);
//Kyuki Object Lock ek hie Object ka chyia hota hai is liye hume same object ko pass karna pada 		
//
		b.start();
		b2.start();
		a.m1();
		a.m2();
		a.m3();

	}

}
