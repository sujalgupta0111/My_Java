package A_004_SleepJoinYield;
//yeild() method is one of the way to prevent thread from Execution

//Yeild method karta kiya hai ki vo thread ka execution becch me rok kaar us thread ko
/*waiting me bhej deta hai aur es thread ke brabar priority vala thread continuie kaar pata hai 
aapna execution*/
/*agar yeild method jis thread me use hua hai uski priority 5 hai aur koi low priorty vala thread 
aakar CPU mangta hai tho es case me yeild koi kaam nahi karega */
/*Ek baar threa yeild ka use kaarke waiting list me chala gya then vo kaab dubara vapis aayega yhea 
  thread sheduler paar deped karta hai*
/*Aisa nahi hoga ki jis thread ke liye cpu chora tha uska task compelete hone paar threa ko dubara
 * CPU mil jaye*/
/*Some OS systems Dont provied support for yield Method*/
/*Yhea ek native method ahi java me nahi likha gaya */

class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("MyThread = "+i);
			if(i==3)
				Thread.yield();
			

		}

	}
}

class MyThread2 extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 7; i++) {
			System.out.println("MyThread2 = "+i);

		}

	}

}

public class YIELDMETHOD {
	public static void main(String[] args) {
		MyThread withYield = new MyThread();
		MyThread2 withoutYield = new MyThread2();
		Thread.currentThread().setPriority(8);
		withoutYield.setPriority(3);
		withYield.start();
		//withoutYield.start();
//without yild ke liye nahi rukega Mythread but main ke liye ruk jayea kyuki dono ki same hai 		
//last MyThread2 Chalega		
		
		for (int i = 0; i < 7; i++) {
			System.out.println("main ="+i);

		}

	}
}
