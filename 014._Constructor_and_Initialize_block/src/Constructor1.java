/*constructor is a method with a same name as a class and code in this block executed 
   instantly when the object of that class executed
 *  Constructor is a method does not required a return type 
 *  When  two constrstor with different parameter present in the program it called constructor overloading*/

class xyz
{
	 xyz ()//non  parameterized constructor 
	 {
		System.out.println("I am non parameterize constructor");
     }
	 xyz(int a,int b)//parameterized constructor
	 {
		 System.out.println("I am parameterized constructor perform addition");
		 System.out.println("Sum->"+(a+b));
	 }
}

public abstract class Constructor1 {
	
	public static void main(String[] args) 
	{
		System.out.println("\n");
		xyz a = new xyz();
		System.out.println("------------------------------------------");
		xyz b = new xyz(23,34);
    }

}
