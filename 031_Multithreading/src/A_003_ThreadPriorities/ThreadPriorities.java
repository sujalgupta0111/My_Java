package A_003_ThreadPriorities;


class MyThread2 extends Thread {

	@Override
	public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("Sujal ");
	}
	
	}
}

class MyThread extends Thread {


	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("MyThread");
		}
		
		}
		
	}


public class ThreadPriorities {
	public static void main(String... strings) {
		MyThread a = new MyThread();//priority with 100 thats why execute first
		MyThread2 b = new MyThread2();
		a.setPriority(10);
		a.start();
		b.start();
		for(int i=0;i<5;i++) {
			System.out.println("Main");
		}
	

	}
}
