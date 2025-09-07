package A_004_SleepJoinYield;


class MyThread7 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("MyThread = "+i);
				try {
					Thread.sleep(0,(int)999999);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			

		}

	}
}


public class SleepMethod {
	public static void main(String[] args) {
		MyThread7 sleep = new MyThread7();
		sleep.start();

		
		

	}
}
