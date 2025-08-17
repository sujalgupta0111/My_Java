class emp
{
	int salary = 10000;
	String name = "Sujal gupta";
}
public class ex1co {
	
	static public void main (String ...strings )
	{
		emp a = new emp();
		emp b = new emp();
	    System.out.println("--------------before change a-----------------");
	    System.out.println(a.salary);
	    System.out.println(a.name);
	    System.out.println("--------------before change b-----------------");
	    System.out.println(b.salary);
	    System.out.println(b.name);
	    
	    System.out.println("--------------After change a-----------------");
	    a.salary = 3456;
	    a.name ="Rajveer Gupta";
	    System.out.println(a.salary);
	    System.out.println(a.name);
	    
	    System.out.println("--------------After change b-----------------");
	    a.salary = 12345;
	    a.name ="Madhad Gupta";
	    System.out.println(a.salary);
	    System.out.println(a.name);
	    
	}	

}
