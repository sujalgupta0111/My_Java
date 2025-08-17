
class xyz 
{ 
	static int v=100;
	int x=200;
	static String y="Sujal";
	String z ="Gupta";
	void show()
	{
		System.out.println(v);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

public class Svariable1 
{
	public static void main(String[] args) 
	{
		
//we can call static variable with its class name but can't call normal variable like that 
		 System.out.println(xyz.v);
         System.out.println(xyz.y);
//show error      
        
         /* System.out.println(xyz.x);
         System.out.println(xyz.z);*/
         xyz.v =500;
         xyz.y ="Vedya";
         
         System.out.println(xyz.v);
         System.out.println(xyz.y);
         
         
     }
}
