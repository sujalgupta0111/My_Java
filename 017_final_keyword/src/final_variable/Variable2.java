package final_variable;
class C
{
	final int b ;//here final value is blank we give it through constructor 
	C(int a)//constructor
	{
		b=a;
		System.out.println(b);
	}
	
}
public class Variable2 {

	public static void main(String[] args) {
		C a = new C(70);
		C b = new C(20);
		//two final values for different objects
	

	}

}
