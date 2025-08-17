package static_nested_class;
class A
{
	int aa =10;
	static int ab=13;
	 void display()
	 {
		 System.out.println("This is class A");
		 //System.out.println(ba);//error not allow to show static class variable in outer class
		 //System.out.println(bb);//error not allowed static member too
		 System.out.println("Member of A in A:-"+aa);
		 System.out.println("Member of A in A:-"+ab);
		 
		 B c = new B();
		 System.out.println("Member of B in A with help of Object of b:-"+c.ba);
		 System.out.println("Member of B in A with help of Object of b:-"+c.bb);
		
		 
		 
	 }
	static class B
	{
		int ba =30;
		static int bb =67;
		void display()
		{
			 System.out.println("This is static class B");
			//System.out.println(aa);
			//It is allowed to Access outer class normal member in normal nested class
			//but it is not allow to access in static class
			 System.out.println("Member of A in B without object of A as it is static:-"+ab);
		   //allowed static member of outer class to access by inner static class
		
			 System.out.println("Member of B in B:-"+ba);
			 System.out.println("Member of B in B:-"+bb);
			 
			 A a = new A();//allowed normal variable with object
			 System.out.println("Member of A in B with help of Object of A :-"+a.aa);
			 a.display();

		}
		
	}
}

public class StaticClass_Ex2 {

	public static void main(String[] args) 
	{
		A.B c = new A.B();
		c.display();

	}

}
