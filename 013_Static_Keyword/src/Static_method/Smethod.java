package Static_method;
class xyz
{
	int a=10;
	static int b=5;
	static void display()
	{
		System.out.println("Inside Static display of xyz");
		//System.out.println("Inside Static display of xyz" +a);//error
		//static method only access static variables
		System.out.println("Inside Static display of xyz b-->" +b);
	}
	void show()
	{
		System.out.println("Inside show of xyz");
		System.out.println("Inside display of xyz a-->" +a);
		System.out.println("Inside display of xyz b-->" +b);
	}
}
public class Smethod {
  public static void main(String[] args) 
   {
	  xyz a =new xyz();
	  abc c = new abc();
	  a.show();
	  c.show();
	  System.out.println("-------------------------------------------------------");
	   abc.display();
	   xyz.display();
	   
	   
	   
	   //abc.show();
	   //xyz.show();// non static method cannot access by class name 
    }
 }

class abc
{
	int a=50;
	static int b=54;
	static void display()
	{
		System.out.println("Inside Static display of xyz");
		//System.out.println("Inside Static display of abc" +a);//error
		//static method only access static variables
		System.out.println("Inside Static display of abc b-->" +b);
	}
	void show()
	{
		System.out.println("Inside show of xyz");
		System.out.println("Inside  display of abc a-->" +a);
		System.out.println("Inside  display of abc b-->" +b);
	}
}
