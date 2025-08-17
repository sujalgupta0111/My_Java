//Function is not break like loop of here 
//we use return to break function
public class Function_with_simple_return {
 static void sum( int x , int y)
 {
	if((x+y)>200)
	{   System.out.println("Before Return");
		return;
		//System.out.println("After return");
		//error because return break the function so code is unreachable
	}
	    System.out.println("sum= "+(x+y));
 }
 static public  void main( String ... Sujal)
 {
	 sum(50,90);
	 sum(5,90);
	 sum(120,90);
 }
}
