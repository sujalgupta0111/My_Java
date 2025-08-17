package Interface;
class A
{
 public void xyz()
     {
        System.out.println("Class A Xyz");
     }
 public void abc ()
    {
    System.out.println("Class A Xyz");
    }
}
interface D
{
	void abc();
}
interface C  
{
     void xyz();
}
class B extends A implements C,D
{// it is not required here to override xyz() of interface as it comes from  class A
	
/*thus it is the reason that compiler say first compile all the class on program and then check '
	  the interface */
 
}

public class interfaceex1 {

	public static void main(String[] args)
	{
		B a = new B();
		a.xyz();

	}

}
