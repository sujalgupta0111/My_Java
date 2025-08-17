package non_static_nested_class;
class E
{ 
	
	{System.out.println("IB of E"); 
	//E a = new E();
	A b =  new A();}
	class A
	{    //E a = new E();
		{System.out.println("IB of A");
		  B a = new B();}
		class B
		{
			{System.out.println("IB of B"); }
		}
	}
	
}
public class non_static_nested_5 {

	public static void main(String[] args) 
	{
		E a = new E();
		//E.A b =  a.new A();
		
	}

}
