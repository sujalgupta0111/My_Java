/*Static block are the block which executes First 
then Initialize block execute  then constructor executes*/
package Constru_initializeblock;

public class Initialize_block3
{
  public static void main(String[] args) 
	{
		AA a = new AA ();
		a.show();
	}
	
}



class AA
{
	static int a;
	String s ="Sujal";
	void show()
	{
		System.out.println("Strind--> "+s +", int-->" +a);
	
	}
	AA()
	{
		System.out.println("I am Constructor XYZ ");
		s = "Chirag";
		a++;
		
	}
	{
		System.out.println("helo Initialize block abc 1");
		s ="raju";
		a++;
	}
	static
	{
		System.out.println("helo Static block abc 2");
		
		a++;
	}
	
}
