package Super_keyword;
class XX
{
	int a = 10;
	
	void sho()
	{  
      System.out.println("Show of Class XX"); 
	}
}
class YY extends XX
{
	int a =30;
	
	void show()
	{
		int a =50;
		System.out.println("a priority the value a in block->"+a);
		System.out.println("this.a priority the value instance a of class->"+this.a);
		System.out.println("super.a priority the vale a of parent class->"+super.a);
	}
	
	void display()
	{
		int a =90;
		System.out.println("a priority the value a in block->"+a);
		System.out.println("this.a priority the value instance a of class->"+this.a);
		System.out.println("super.a priority the vale a of parent class->"+super.a);
	}
	
	void sho()
	{  System.out.println("Show of Class YY");  }
	
	void fun()
	{
		super.sho();
		this.sho();
        //sho();//this same as this.sho();
	}
}
public class this_super_variable {

	public static void main(String[] args) 
	{
	
		YY a = new YY();
		System.out.println("\n");
        a.show();
		System.out.println("\n-------------------------------------------------\n");
		a.display();
		System.out.println("\n-------------------------------------------------\n");
		a.fun();
		

	}

}
