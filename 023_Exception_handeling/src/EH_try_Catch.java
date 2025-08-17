//Exception is some unexpected error that comes in program 
//hirercy --> object--> throwables-->Exceptions-->checked and unchecked 
/*in try block code execute until the exception not found at which line they find
exception after that it not run code and throw execption and run the entire code 
in sequence*/
// when line throw exception it catch by catch block the it show result
public class EH_try_Catch {
	
	
	public static void main(String ...strings )
	{
		int a = 0;
		int b=10;
	try {
		System.out.println("this line run ");
			int c= b/a;
			System.out.println("this line not run ");
		}
		catch(ArithmeticException e)
		{
			System.out.println("not divided by zero");
			System.out.println(e);
			e.printStackTrace();
		}
        
	System.out.println("this line  run ");
	
	}
	
	

}
