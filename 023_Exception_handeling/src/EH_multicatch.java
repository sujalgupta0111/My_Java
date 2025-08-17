//with one try we can use multiple catchs or with one catch mention multiple exception 

public class EH_multicatch {
	
	
	public static void main(String ...strings )
	{
		int a = 0;
		int b=10;
		int ar[] = new int[5];
	try {
		
		int c = ar[8];
			a=a/b;
		
		
		}
		catch(ArithmeticException abs)
		{System.out.println(abs);}
	    catch(ArrayIndexOutOfBoundsException bc) 
	    {	System.out.println(bc);
	      //System.out.println(  bc.getMessage());//give info about what is exception
	    	
	    }
	
	   

	

}
}
