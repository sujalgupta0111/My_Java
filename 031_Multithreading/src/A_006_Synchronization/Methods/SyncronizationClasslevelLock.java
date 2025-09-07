package A_006_Synchronization.Methods;

class SyncroniClassLevel {
	static public void m2() {
		for (int i = 0; i < 2; i++) {
			System.out.println("M2() " + Thread.currentThread().getName());
		}
	}

	static synchronized void m1() {
		for (int i = 0; i < 2; i++) {
			System.out.println("M1() " + Thread.currentThread().getName());
		}
	}

	static void m3() {
		for (int i = 0; i < 2; i++) {
			System.out.println("M3() " + Thread.currentThread().getName());
		}
	}
}

class MyThread3 extends Thread {

	MyThread3() {
		super("My Thread");
	}

	public void run() {
		SyncroniClassLevel.m1();
		SyncroniClassLevel.m2();
		SyncroniClassLevel.m3();

	}
}

class MyThread4 extends Thread {

	MyThread4() {
		super("My Thread2");
	}

	public void run() {
		SyncroniClassLevel.m1();
		SyncroniClassLevel.m2();
		SyncroniClassLevel.m3();

	}
}

public class SyncronizationClasslevelLock {
	public static void main(String[] args) {
		Syncroni a = new Syncroni();
		MyThread3 b = new MyThread3();
		MyThread4 b2 = new MyThread4();
//Yahan class ke method ko static bana kaar diya jisse humare thread ko class level lock ki zarurat padegi
		b.start();
		b2.start();
		SyncroniClassLevel.m1();
		SyncroniClassLevel.m2();
		SyncroniClassLevel.m3();

	}

}
