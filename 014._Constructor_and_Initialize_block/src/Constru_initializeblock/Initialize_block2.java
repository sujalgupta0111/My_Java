//Initialize block execute first then constructor
package Constru_initializeblock;

public class Initialize_block2 
{
    public static void main(String[] args) 
	{
		xyz a = new xyz();
		a.show();
	}
	
}



class xyz
{
	int a;
	String s ="Sujal";
	void show()
	{
		System.out.println("Strind--> "+s +",  integer-->" +a);
	}
	xyz()
	{
		System.out.println("I am Constructor XYZ ");
		s = "Chirag";
		
	}
	{
		System.out.println("helo IB abc 1");
		s ="raju";
	}
	{
		System.out.println("helo IB abc 2");
	}
	
}
