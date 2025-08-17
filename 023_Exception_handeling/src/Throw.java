//it use to explicitely throw exception by methods
//throw use karke hum kisi bhi method se exception fikwa sakte hai
public class Throw {
	
	public static void hello(int a) throws ArithmeticException
	{
		int b = 10/a;
		System.out.println(b);
	}
	
	public static void hi(int a) throws ArithmeticException,ArrayIndexOutOfBoundsException
	{
		int b = 10/a;
		int c[] = new int [4];
		System.out.println(b);
		System.out.println(c[8]);
	}
	
	public static void main(String[] args) {
		
		System.out.println("start");
         //hello(0);
		hi(5);
         
         System.out.println("end ");
		

	}

}
