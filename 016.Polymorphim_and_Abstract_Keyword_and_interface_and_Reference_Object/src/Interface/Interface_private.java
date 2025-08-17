package Interface;
interface h
{
	//In JDK 8 java introduce static and  default method in interface
	/*In JDK 9 java also introduce private to interface  as now private member access by
	  static and default */
	
	private void stu()
	{
		System.out.println("Interface h stu");
	}
	 static  private void stud()
	{
		System.out.println("Interface h stud");
	}
	default void rty()
	{
		System.out.println("Interface h default rty to acces private ");
		stu();
	}
	static void hui()
	{
		System.out.println("Interface h static stud");
	   //stu();//error static method take static members	
		stud();
	}
}

class K implements h
{
	}
public class Interface_private {

	public static void main(String[] args) 
	{ 
	h a = new K();
		//a.stu();//error not visibe because private
		//a.stud();//error not visible
	    a.rty();//to acces private 
		h.hui();//direct call by name of interface to acces private static 
	}

}
