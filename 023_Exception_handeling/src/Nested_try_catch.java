
public class Nested_try_catch {

	public static void main(String[] args) {
		int a = 0;
		int b=10;
		int ar[] = new int[5];
		
		
		System.out.println("start");
	try {
		System.out.println("try");
		    try 
		    {System.out.println("nested try");
		    	a=b/a;
		    }catch(ArithmeticException abs)
			{
		    	System.out.println("nested arthi");
		    	System.out.println(abs);
		    }
		int c = ar[8];
			a=a/b;
		
		
		}
		catch(ArithmeticException abs)
		{
			System.out.println("arthi");
			System.out.println(abs);}
	    catch(ArrayIndexOutOfBoundsException bc) 
	    {	System.out.println("aoodbe");
	        System.out.println(bc);}
	
	System.out.println("END");

	}

}
