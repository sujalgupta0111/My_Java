//Constructor calling must the first statement of the block
//Constructor Chaining
package Constru_this;

class xyz 
{
	xyz(int a, int b)
	    {
		  this();
		  System.out.println("I am xyz constructor with  2 parameter");
	      System.out.println(" Sum --> " +(a+b));
	    }
	xyz()
	    {
		//this(45,98);
		System.out.println("I am xyz constructor without parameter");
	    }
	xyz(int a, int b,int c)
    {
	  this(78,98);
	  System.out.println("I am xyz constructor with 3 parameter");
      System.out.println(" Sum --> " +(a+b+c));
    }
}

public class Cons_this {

	public static void main(String[] args) 
	{   
		xyz a1 = new xyz (45,98,76);  
	}

}
