//Super is a keyword used for chaining different classes
//It is used in inheritance
//either this or super is used with the constructor 
package Super_keyword;

class A
{ 
	A()
	{
		System.out.println("Constructor of Class A");
	}
	A(int b)
	{
		System.out.println("Parameterized Constructor of Class A");
	}
	
	
}
class B extends A
{
	 B()
	{
	//super();//there is always a super present here either you mention or not 
	System.out.println("Constructor of Class B");
	}
}
public class inhertiance_super {

	public static void main(String[] args)
	{
		B b = new B();

	}

}
