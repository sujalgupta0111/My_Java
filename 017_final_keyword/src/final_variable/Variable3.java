package final_variable;
class D
{
	final int b ;//here final value is blank we give it through constructor 
	
	{//final value give through initialize block
		b=30;
		System.out.println(b);
	}
	
}
public class Variable3{

	public static void main(String[] args) {
		D a = new D();
		D b = new D();
		//two final values for different objects
	

	}

}
