package A_002_ThreadStates;
//thread life cycle me kuch stages hoti hai 

//1. NEW -> jaab Thread initiate hota hai
//2.Runnanle -> jab Thread redy to run hota hai
//3. running-> jab thread run kaar raha hota hai 
//4. blocked/waitnig-> jab thread wait kaar raha hota hai aapni chance ka watinng queue me 
//5.terminate-> jaab thread aapna kaam pura kaar chuka hota hai 

//java me .getstatus se kisi thread ka pata kaar sakte hai jo ki ek state name ke enum me define hote hai 
//usme jo states hoti hai vo hai new runnable blocked waiting time waiting terminate

//es enum me running nahi hoti yhea esme runnaabue ka mtlb hie running hota hai 

class Mythread extends Thread {
	public void run() {
		System.err.println("Start");

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.err.println("End");

	}
}

public class ThreadStates {

	public static void main(String[] args) throws InterruptedException {
		Mythread t1 = new Mythread();
		System.out.println(t1.getState());// NEW
		t1.start();
		System.out.println(t1.getState());// RUNNABLE
		// t1.join();
		Thread.sleep(100);
		System.out.println(t1.getState());// TIMED_WAITING
		t1.join();
		System.out.println(t1.getState());// TERMINATED
		System.out.println("end");

	}

}
