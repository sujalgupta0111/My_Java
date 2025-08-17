package Super_keyword;
class AA
{ 
	AA()
	{
		System.out.println("Constructor of Class A");
	}
	AA(int b)
	{
		this();
		System.out.println("Parameterized Constructor of Class A");
	}
	
	
}
class BB extends AA
{
	 BB()
	{
     this(5);
	System.out.println("Constructor of Class B");
	}
	 BB(int a)
	 {
		 super(5);
		 System.out.println("Parameterized Constructor of Class B");
	 }
	 
}

public class inheri_super2 {

	public static void main(String[] args)
	{
		BB b = new BB();//object of BB class formed

	}

}
