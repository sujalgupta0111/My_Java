/*private member of the parent class is inherit in child but not 
accessable by the child class*/

class xy
{
	private int a = 10;
	void print()
	{
		System.out.println("private a-->" +a);
	}
}

class ab extends xy
{
	
}



public class Inherit2 {

	public static void main(String[] args) 
	{
		
		ab d = new ab();
		/*System.out.println(d.a);// error because a is private and the 
		 * accessbility is not to ab class*/
		
	     
		d.print();
		/*but tis print execute this proof that the private member is inherit 
		 *but not accessable to the class ab */
		

	}

}
