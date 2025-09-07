package A_003_ThreadPriorities;

class MyThread3 extends Thread {

	@Override
	public void run() {

//		System.out.println("Sujal ");
//		System.out.println(Thread.currentThread().getPriority());

	}
}

class MyThread4 extends Thread {

	@Override
	public void run() {

		// System.out.println("MyThread");

	}

}

public class ThreadPriorities2 {
	public static void main(String... strings) {
//Jo Thread start karta hai vo parent thread hota hai aur jo start hota hai vo child 
//thread hota hai aur jo parent thread ki priority hoti hai vo child iherit kaar leta hai
		MyThread3 b = new MyThread3();
		MyThread4 a = new MyThread4();
		b.start();
		a.start();
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(a.currentThread().getPriority());
		System.out.println(Thread.currentThread().getPriority());
	}
}
