class A
{
	A()
	{
		System.out.println("In constructor of A");
	}
	{
		System.out.println("Initialize block of  A");
	}
	static
	{
		System.out.println("Static block of  A");	
	}
	
}
class B extends A
{
	B()
	{
		System.out.println("In constructor of B");
	}
	{
		System.out.println("Initialize block of  B");
	}
	
	static
	{
		System.out.println("Static block of  B");	
	}
	
	
}
public class Inherit_constructor {

	public static void main(String[] args) 
	{
		
		B a = new B();
/*This proof When We create an object of B then 
  it first create a object of  A then come to child class */
		

	}

}
