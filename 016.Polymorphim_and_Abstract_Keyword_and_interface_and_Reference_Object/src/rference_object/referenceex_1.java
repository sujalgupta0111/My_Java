package rference_object;
class A
{
	int a=18;
	static int b =23;
	 void xyz()
	 {    
		 System.out.println("Class A Xyz");  
	  }
	 
	static void abc()
	 {    
		System.out.println("Class A static  Abc");   
	 }
}
 class B extends A
 {
	 int a=88;
		static int b =77;
		 void xyz()
		 {    System.out.println("Class B Xyz");   
		 }
		 
		static void abc()
		 {
			System.out.println("Class B static  Abc");   
			}
		
		void ab()
		{
			System.out.println("Class B   bc");
		}
 }
public class referenceex_1 {

	public static void main(String[] args) 
	{
		//B a = new A();//Reference of child cannot store the Object of Parent 
		
		A b = new B();
		System.out.println(b.a);
		//show the result of class  A thus variable is bind through reference
		
		System.out.println(b.b);
		//show the result of class  A thus static variable is bind through reference
		
		b.xyz();
		//show the result of class  A thus non static method  is bind through object
		b.abc();
		//show the result of class  A thus static method  is bind through reference
		//b.ab();
	}

}
