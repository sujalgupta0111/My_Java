package A_001_Defining_Thread;

//Not Recommended to override Start method if we do then start we run is declare run always
//if we want to override start() then inside our start we may call super.start to call thread class start() method 
//also recommend that we must  override run otherwise dont go for multi threading concept
class MyThread4 extends Thread {

	public void start() {
		System.out.println("Thread created");// this is run by main thread
		//to calling start() of thread Thread Class 
		super.start();
		
		System.out.println("Thread Job Done ");

	}

	@Override
	public void run() {
/*the statements only in @Override run() method run by thread that is created
  by this class  other that all executed by main thread*/
		System.err.println("MyThread.run()");// this is run by child thread

	}
}

public class MT_5_ThreadName {
	public static void main(String... strings) {
		MyThread4 a = new MyThread4();
		a.start();
		System.out.println("bhai jaan");//this is run by main thread
	}
}
