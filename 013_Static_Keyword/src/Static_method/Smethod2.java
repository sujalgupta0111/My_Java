package Static_method;
class A
{
	static void raj()
	{
		System.out.println("A");
	}
}
class B extends A
{
	/*static void raj ()
	{
		System.out.println("B");
	}*/
}
public class Smethod2 {

	public static void main(String[] args) {
	B a = new B()	;
	a.raj();

	}

}
