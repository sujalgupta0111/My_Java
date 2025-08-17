//Inheritance means making a new class with the properties of existing class

class AA
{
	static int b = 15;
 int c = 10;
	
  void print()
   {
	  System.out.println("Inside AA class"); 
   }
}
class bb extends AA
{
	
}
public class Inherit1 
{

	public static void main(String[] args)
	{
		bb b = new bb();
		AA a = new AA();
		System.out.println("Static var of AA before change through b->"+a.b);
		// Static keyword of AA change through bb 
		b.b =19;
		System.out.println("Static var of AA "+a.b);
		// static keyword of a parent class change through child class
		System.out.println("Normal var of AA "+b.c);
		a.c=17;
		// normal variable  of a parent class not change through child class
		//because object of AA and bb are different
		System.out.println("Normal var of AA "+b.c);
		
		b.print();
		a.print();
		
		
	
		
		 

	}

}
