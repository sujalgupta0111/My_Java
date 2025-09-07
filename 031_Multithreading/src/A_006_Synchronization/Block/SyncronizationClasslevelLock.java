package A_006_Synchronization.Block;

class SyncroniClassLevel {

	void m1() throws InterruptedException {
		System.out.println("Enter M1 Thread " + Thread.currentThread().getName());
		Thread.sleep(2000);
		synchronized (SyncroniClassLevel.class) {
			for (int i = 0; i < 2; i++) {
				System.out.println("M1() " + Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}
		System.out.println("Exist M1 Thread " + Thread.currentThread().getName());

	}
}

class MyThread3 extends Thread {
	SyncroniClassLevel a = new SyncroniClassLevel();

	MyThread3() {
		super("My Thread");
	}

	public void run() {
		try {
			a.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class MyThread4 extends Thread {
	SyncroniClassLevel a = new SyncroniClassLevel();

	MyThread4() {
		super("My Thread2");
	}

	public void run() {
		try {
			a.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class SyncronizationClasslevelLock {
	public static void main(String[] args) throws InterruptedException {
		SyncroniClassLevel a = new SyncroniClassLevel();
		MyThread3 b = new MyThread3();
		MyThread4 b2 = new MyThread4();
//Yahan class ke method ko static bana kaar diya jisse humare thread ko class level lock ki zarurat padegi
//Yahan Object alalg alag gaye hai But class level Lock hone ki wjha se 
		b.start();
		b2.start();
		a.m1();

	}
}
