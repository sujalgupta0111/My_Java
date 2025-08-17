class abc
{
	static int a=200 ;
	int s =200;
	  void rev()
	{
	//static int x;//error
	//static variable is not initialize inside a non static method
	System.out.println("Static a = "+a);
	//static variable is access by non static method
	}
	  
}
public class Svariable2 
{
	public static void main(String[] args) 
	{
		abc a  = new abc();
		a.rev();
		
	}

}
