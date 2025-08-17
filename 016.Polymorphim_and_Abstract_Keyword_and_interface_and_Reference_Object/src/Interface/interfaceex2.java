package Interface;
interface AA
{ 
	int a =10;
	void AB();
	 default void BB()
	 {
	  // with the help of default keyword we will give body to the method 
		System.out.println("BB in interface A");
	 }
	 static void SS()
	 {//static method of interface is not inherited to class 
		 System.out.println("SS in interface A and it is static");
	 }
}
class BB implements AA
{
public void AB()
   {
	System.out.println("Class B's AB");
	}
}
public class interfaceex2 {

	public static void main(String[] args)
	{
		BB a = new BB();
		a.AB();
		a.BB();
		//a.SS();//error//because it is not inherit in the class the class 
         AA.SS();//static method of interface is directly called by its name 
	}

}
