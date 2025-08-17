package pratice;
import java.util.Scanner;
public class fact 
{
	static void fact(int num)
	{
		int fact=1;
		for(int c=1;c<=num;c++)
		{
			fact= fact*c;
		}
		System.out.println(fact);
		
	}

	public static void main(String[] args) 
	{
	  	Scanner input = new Scanner(System.in);
	  	System.out.printf("Enter the Number=>");
	  	
        int a = input.nextInt();
        fact(a);
	}

}
