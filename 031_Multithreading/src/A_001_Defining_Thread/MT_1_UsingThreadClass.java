package A_001_Defining_Thread;
//This is Defining a thread
/*Yahan output ki koi guarantee nahi hogi koi sa bhi kaabhi bhi run ho sakta 
  hai essa pata chalta hai ki thread ek independent r/un hote hai ek hie program 
  ke part hone paar bhi*/
/*Jab main thread t.start() call karta hai then ek naya thread banta hai jo 
 *ek seperalety job perfom karta hai */
/*Jo yaha thread bana aur ho main thread hai vo kaab kaab exeute honge vo 
 * decide kata hai thread sheduler by itd algorithms */
/*Hum output guess nahi kaar sakte kyuki Thread shedulers ki algo jvm to jvm 
  differ hoti hai so execution guess karna possibe nahi hai */
/*Thus it can provide various ouput*/
class MyThread extends Thread {

	@Override
	public void run() {
		// This is a job of thread
//this run() is only exectued by the thread created by this class oject when main thred created thread
		
		for (int i = 0; i < 5; i++) {
			System.err.println("MyThread.run()");
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class MT_1_UsingThreadClass {
	public static void main(String... strings) {
		MyThread a = new MyThread();
		a.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main()");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
