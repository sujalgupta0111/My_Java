package rference_object;
class F
{
 static  void max()
  {
	  System.out.println(" static Max OF class F");
  }
  
}
class G extends F
{
	static  void max()
	  {
		  System.out.println("Static Max of class G");
	  }
}
public class refferenceex2
{
  static public void  main( String ... sujal)
  {//child me parent nahi ghusega
	  // E a = new C();
	  
	  F a = new G();
	  a.max();// static method bind through Reference 
	  
  }
  
}
