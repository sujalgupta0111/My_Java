import java.util.Scanner;

public class IF_else_IF_Statement {

	static public void main(String ...strings )
	{
		Scanner input = new Scanner(System.in);
		int a= input.nextInt();
		if (a==10)
		{
		  System.out.println("1 Sahi hai");
		}
		else if (a==90)
		{
		  System.out.println(" 2 bhi Sahi hai");
		}
		
		else if (a==88)
		{
			System.out.println(" 3 GAlat ho gaya");
		}
		
		else
			System.out.println(" muje kiya matlb sab galat hai");
			
	}
}
