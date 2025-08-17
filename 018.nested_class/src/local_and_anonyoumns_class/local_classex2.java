package local_and_anonyoumns_class;
class AA
{
	int a =15;
	static int b= 20;
	
	 void B()
	{//allowed inside normal method allowed in constroctor
		int c =30;
	
		class B
		{//local class can't be static or non static
			void display()
			{ int d= 40;
			
//all members of outer class and outer method are allowed here
			  System.out.println("Class B");
			  System.out.println("Member of AA inside method inside class B:-"+a);
			  System.out.println("Member of AA inside method inside class B:-"+b);
			  System.out.println("Member of  method inside class B:-"+c);
			  System.out.println("Member of  method inside class B:-"+d);
				
			}
			
			
		}
		B a = new B();
		a.display();
		
	}
	 
	 
}
public class local_classex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AA a = new AA();
		a.B();

	}

}
