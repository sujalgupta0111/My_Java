package A_004_SleepJoinYield;
class MyThread3 extends Thread {
   public void run() {
      for (int i = 0; i < 5; ++i) {
         Thread.yield(); // By calling this method, MyThread stop its execution and giving a chance to a main thread
         System.out.println("Thread started:" + Thread.currentThread().getName());
      }
      System.out.println("Thread ended:" + Thread.currentThread().getName());
   }
}
public class YieldMethodTest {
   public static void main(String[] args) {
	   MyThread3 thread = new MyThread3();
      thread.start();
      for (int i = 0; i < 5; ++i) {
         System.out.println("Thread started:" + Thread.currentThread().getName());
      }
      System.out.println("Thread ended:" + Thread.currentThread().getName());
   }
}