class hello
{
	static int count=0;
	int plus =0;
	hello()
	{
		count++;
		plus++;
	}
	
}
public class Svariable3 {

	public static void main(String[] args)
	{
		hello a = new hello();
		hello b = new hello();
		hello c = new hello();
	//static Variable is same for every object of class 
		
	/*Every time object created then static count increase because  
	 * static variable is same for every object of that class*/
		
	 /*but the value of normal variable is 1 for every object as
	  *new instance of that object is created and for every new instance 
	  *new plus created and its increase by 1
	  */
	System.out.println(" -------------------For A-------------------------");
	System.out.println("Static variable for object a-->" +a.count);
	System.out.println(" variable for object a-->"+a.plus);
	
	System.out.println(" -------------------For B-------------------------");
	System.out.println("Static variable for object a-->" +b.count);
	System.out.println(" variable for object a-->"+b.plus);
	
	System.out.println(" -------------------For C-------------------------");
	System.out.println("Static variable for object a-->" +b.count);
	System.out.println(" variable for object a-->"+b.plus);
		
		

	}

}
