//it is a class that don't inherit but Its object formed
 final class A
 {//method of final class is not final by default.
	 int a =10;
	 void max()
	 {
		 System.out.println("Final class A");
	 }
}
 
// class B extends A {}// error //bcz class A is final class and cannot inherit
public class FINAL_CLASS {

	public static void main(String[] args)
	{
		A b = new A();//object of final class created
		System.out.println(b.a);
		b.max();
		

	}

}
