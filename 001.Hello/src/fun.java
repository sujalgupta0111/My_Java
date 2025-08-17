class mythread extends Thread
{
	public void run()
	{
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("BY my thread");
	}
}
class mera implements Runnable
{
	public void run()
	{
		System.out.println("by runnable");
	}
}

public class fun
{
	public static void main(String ... sujal)
	{
		mythread a = new mythread();
		a.start();
		
		mera b = new mera();
		Thread t = new Thread(b);
		t.start();
	}
}