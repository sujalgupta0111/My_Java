class AA
{
	void hello()
	{   System.out.println("Hello A");  }
}

class B extends AA
{
	void hello()
	{    System.out.println("Hello B");  }
}
class C extends AA
{
	void hello()
	{  System.out.println("Hello C"); }
}
class D extends AA
{
	void hello()
	{
		System.out.println("Hello D");
	}
}

public class Run_Time {

	public static void main(String[] args) 
	{
		 AA a;
		 
		  a= new AA();
		  a.hello();
		  
		  a= new B();//upcasting
		  a.hello();
		  
		  a= new C();
		  a.hello();
		  
		  a= new D();
		  a.hello();

	}

}
