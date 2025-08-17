package IF_Statement_decision_making;

public class Nested_if {

	public static void main(String[] args)
	{
		
	if(true)
	{	
	   System.out.println("Inside 1 if");
		if(false)
		{
			 System.out.println("Inside 2 if");
			  if(true)
			  {
		      System.out.println("Inside 3 if ");
			  }
			  else {System.out.println("Inside 3 else");}
		}
		else {
			System.out.println("Inside 2 else");
			  if (true)
				  System.out.println("Inside 2 else if's  ");
				  
			}
	}
	else {System.out.println("Inside 1 else");}
		}

	}


