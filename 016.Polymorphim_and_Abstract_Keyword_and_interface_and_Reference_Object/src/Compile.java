class A
{
	void sum( int a, int b)
	{
		System.out.println("Integer-->"+(a+b));
	}
	 static void sum(double a , int b)
	{
		System.out.println("Double INt-->"+(a+b));
	}
	void sum( float a, float b)
	{
		System.out.println("Float-->"+(a+b));
	}
	void sum(double a, double b)
	{
		System.out.println("double-->"+(a+b));
	}
	String sum(String a , String b)
	{
		System.out.println("Strings-->"+(a+b));
		return a+b;
	}
}

public class Compile {

	public static void main(String[] args) 
	{
		A a = new A();
		
		a.sum("Sujal ", "gupta");
		a.sum(2.0f,3.0f);
		a.sum(35.5,67.5);
		a.sum(44,45);
		a.sum(44.99,44);
		/*It  don't matter if the method return type are different or method are static it 
		    the name of the function must be  same with different parameters*/
		
	}

}
