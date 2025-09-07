package A_001_Defining_Thread;

/*
start() method me 70k line ka code hota hai jo
 *Thread ko thread scheduler paar register karta hai aur 
 *aur baki mandatories activites perform karta hi
 *fir last me run() method ko invoke karta hai 
*/
//This is Defining a thread
class MyThread3 extends Thread {

	@Override
	public void run() {
		// This is a job of thread
		for (int i = 0; i < 5; i++) {
			System.err.println("MyThread.run()");

		}
	}
}

public class MT_3_DifferenceBetweenStartAndRun {
	public static void main(String... strings) {
		MyThread3 a = new MyThread3();
//Here is we use start but we can directly call run() for job done by Thread
		a.start();
//by using start() a new thread is created and then that seperate thread performed a job
		// a.run();
//by using run() a no new thread is created and job performed by main thread only

		for (int i = 0; i < 5; i++) {
			System.out.println("Main()");

		}
	}
}
