package rference_object;
class H
{
	
  int a=30;
 static int b = 40;
  
}
class I extends H
{
	 int a=23;
	 static int b = 34;
}
public class refferenceex3
{
  static public void  main( String ... sujal)
  {//child me parent nahi ghusega
	  // E a = new C();
	  
	  H a = new I();
	 System.out.println("non Static integer-->"+a.a);
	 System.out.println(" Static integer-->"+a.b);
	 //variable is bind through reference
	 
	  
  }
  
}
