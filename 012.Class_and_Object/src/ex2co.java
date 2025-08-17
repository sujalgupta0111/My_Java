import java.util.Scanner;
class B
{ 
	String name ="Sujal";
	int salary = 1000;
	void input(String s, int a )
	{
		 name =s;
		 salary = a;
    }
	void show( )
	{
	System.out.printf("Name ="+name +" ,");
	System.out.printf("Salary ="+salary+" \n");
	}
}
public class ex2co 
{
	static public void main(String ... Sujal)
	{
		B a =new B();
		B b =new B();
		B c =new B();
		System.out.println("-----------------------------------------");
		a.show();
		b.show();
		c.show();
		System.out.println("-----------------------------------------");	
		a.input("Raj",2000);
		b.input("Subhas",5000);
		c.input("Sujeet",6879);
		
		a.show();
		b.show();
		c.show();
		
		
		
	}

}
