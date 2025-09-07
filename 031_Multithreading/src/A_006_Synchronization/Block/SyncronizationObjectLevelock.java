package A_006_Synchronization.Block;

class Syncroni {
	void m1() throws InterruptedException {
		System.out.println("Enter M1 Thread " + Thread.currentThread().getName());
		Thread.sleep(2000);
		synchronized (this) {
			for (int i = 0; i < 2; i++) {
				System.out.println("M1() " + Thread.currentThread().getName());
				Thread.sleep(1000);
			}
		}
		System.out.println("Exist M1 Thread " + Thread.currentThread().getName());

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

	@Override
	public void run() {
		try {
			a.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	@Override
	public void run() {
		try {
			a.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class SyncronizationObjectLevelock {

	public static void main(String[] args) throws InterruptedException {
		Syncroni a = new Syncroni();
		MyThread b = new MyThread(a);
		MyThread2 b2 = new MyThread2(a);
//Kyuki  Object Lock ek hie Object ka chyia hota hai is liye hume same object ko pass karna pada 		
//Object Level Lock ek hie method paar kaam karta hai ek Object ke but Differet Object ke liye yhea object lock kisi kaam ka nahi hoga
//Class  Level Lock haar object ka method ek hie condier hota hai mtlb thread class level lock le kaar pure class ka malik baan jata hai kuch time ke liye 		
		b.start();
		b2.start();
		a.m1();

	}

}
