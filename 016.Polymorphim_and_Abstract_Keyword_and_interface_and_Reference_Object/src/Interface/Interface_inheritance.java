package Interface;
import java.lang.*;

interface S
{
	void xyz();
	default void yut()
	{
		System.out.println("interface S yut");
	}
	
}
interface T extends S
{
	void ctu();
}
class U implements T
{
	@Override//<--- this is called annotation and helps two ways 
	/*1.It  which method is Overriden 
	 *2. IF you write the wrong name of a overrideen method it show error otherwise 
	     if there are many method  in program  then it is complex to find  which one is error which o*/
	public void xyz() 
	{
		System.out.println("Class U Xyz");
	}
	@Override
    public  void ctu()
	{
		System.out.println("Class U ctu");
	}
	//@Override//this show error in xty bcz compiler thinks xty have to override but not find .
	void xty()
	{
		System.out.println("Class U xty");
	}
	
	}
public class Interface_inheritance {

	public static void main(String[] args) 
	{
	     U a = new U();
	     a.xyz();
	     a.ctu();
	     a.xty();
	     a.yut();
	     
	     System.out.println("-----------------------------------------");
	     
	     T b = new U();
	     b.xyz();
	     b.ctu();
	     b.yut();
	    // b.xty();//error refernce not have members
	     System.out.println("-----------------------------------------");
	     S c =new U();
	     c.xyz();
	     c.yut();
	    // c.ctu();//error  reference not having members
	     
	     
	}

}
