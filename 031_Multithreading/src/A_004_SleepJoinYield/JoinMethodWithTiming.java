package A_004_SleepJoinYield;

class MyThread6 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("JoinMethod.MyThread5= "+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}

public class JoinMethodWithTiming {

	public static void main(String[] args) throws InterruptedException {
		MyThread6 a = new MyThread6();
		a.start();
		for (int i = 0; i < 7; i++) {
			System.out.println("JoinMethod.main()= "+i);
			if (i == 2) {
				a.join(4000);
	//yhea mehod use karne se unlimitited amount ke liye await nahie kareag
			}
		}

	}

}
