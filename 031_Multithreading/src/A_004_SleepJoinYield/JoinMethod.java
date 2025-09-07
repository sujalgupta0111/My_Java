package A_004_SleepJoinYield;

class MyThread5 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("JoinMethod.MyThread5");
		}

	}
}

public class JoinMethod {

	public static void main(String[] args) throws InterruptedException {
		MyThread5 a = new MyThread5();
		a.start();
		for (int i = 0; i < 7; i++) {
			System.out.println("JoinMethod.main()");
			if (i == 2) {
				a.join();//yhea bol raha hai ki threa a ke compelete hone taak current tread wait karo
			}
		}

	}

}
