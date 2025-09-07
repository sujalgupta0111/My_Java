package A_001_Defining_Thread;

//java me haar thread ka nmase hota hai ab vo cahae vo hum de yhea JVM koi randomly denerate kare
class MyThread6 implements Runnable {

	@Override
	public void run() {
		try {
		System.err.println("MyThread.run()1");
		Thread.sleep(1000);
		System.err.println("MyThread.run()2");
		Thread.sleep(1000);
		System.err.println("MyThread.run()3");
		System.err.println("MyThread.run()4");
		Thread.sleep(1000);
		System.err.println("MyThread.run()5");
		Thread.sleep(1000);
		System.err.println("MyThread.run()6");
		Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

public class MT_4_NotRecommendToDo {
	// by default JVM jo name generate karta hai vo hai Thread-0 Thread-1
	public static void main(String... strings) {
		Runnable a = new MyThread6();
		Thread t = new Thread(a, "Sujal Thread");
		Thread t2 = new Thread(a);
		t.start();
	}
}
