package local_and_anonyoumns_class;
class A
{
	A()
	{
		class B
		{//local class can't be static
			
		}
	}
	
	{//allowed inside initialize block
		class B
		{//local class can't be static
			
		}
	}
	static 
	{//allowed inside static block
		class B
		{//local class can't be static
			
		}
		
	}
	
	void B()
	{//allowed inside normal method allowed in constroctor
		class B
		{//local class can't be static or non static
			
		}
	}
}
public class local_classex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
