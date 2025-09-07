package A_005_ThreadInterupption;

class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("Start Thread wait for 10 sec");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("I am Interuppted bcz of interuppted method at main");

		}
		System.out.println("End Thread");

	}

}

public class ThreadInteruption {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Start Wait for 3 sec");
		MyThread a = new MyThread();
		a.start();
		Thread.sleep(3000);
		a.interrupt();// yhea uska 10 sec ka sleep time me use disturb kaar dega
		System.out.println("Main end");

	}

}
