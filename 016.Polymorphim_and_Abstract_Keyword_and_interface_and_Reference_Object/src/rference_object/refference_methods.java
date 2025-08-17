package rference_object;
class C
{
  void max()
  {
	  System.out.println("Max OF class C");
  }
  
}
class E extends C
{
	 void max()
	  {
		  System.out.println("Max of class E");
	  }
}
public class refference_methods
{
  static public void  main( String ... sujal)
  {//child me parent nahi ghusega
	  // E a = new C();
	  
	  C a = new E();
	  a.max();//non static method bind through object 
	  
  }
  
}
