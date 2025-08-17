class  C
{
	void max()
	{
		System.out.println("Non Final  Method max Class c");
	}
	final void min()
	{
		System.out.println("Final  Method min class C");
	}
}

class D extends C
{
	void test()
	{
		max();
		min();// final method is inherit and called 
	}
	/*void min()
	{//but final method cannot be overridden   }
	*/
	
	 void max()
	{
		System.out.println("Non Final  Method max class D");
	}
   
}
public class FInal_Method {

	public static void main(String[] args) 
	{
		 C a = new D();
		 //a.test();
		 a.max();
		 a.min();
     }

}
