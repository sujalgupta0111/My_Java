package final_variable;
class A
{
	final int b =10;
	int c =10;
	//final variable is a constant varibale its value cannot be changed
	//final int c;//error
	//we cannot  blank the final variable but in three cases we can do that
	//final variable is inherited and also overriden but not changed
	
	
}
class B extends A
{
	final int b =20;
	int c =30;
}
public class Variable1 {

	public static void main(String[] args) {
		B a = new B();
		System.out.println(a.b);
	//	a.b=90;//erroe

	}

}
