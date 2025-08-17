import java.util.*;
public class printrcolum 
{
	public static void main(String...strings)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Eetr the number-->");
		int a= input.nextInt();
		for (int b =1;b<=a;b++)
		{
			System.out.println(" * ");
			for (int c =1;c<=a;c++)
			{
			System.out.println(" * ");	
			}
		}
	}

}
