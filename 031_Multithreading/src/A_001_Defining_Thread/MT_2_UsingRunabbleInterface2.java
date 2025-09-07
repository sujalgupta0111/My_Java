package A_001_Defining_Thread;
//yhea jayada recommend kari jati hai use me esmehum use karsaktehai exteds ka bhi 
class MyThread5 implements Runnable {

	@Override
	public void run() {
		// This is a job of thread
		for (int i = 0; i < 5; i++) {
			System.err.println("MyThread2.run()");
		}
	}
}

public class MT_2_UsingRunabbleInterface2 {

	public static void main(String[] args) {
		Runnable my = new MyThread5();
		Thread thread = new Thread(my);
		thread.start();

	}

}
