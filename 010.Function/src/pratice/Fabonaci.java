package pratice;
import java.util.Scanner;
public class Fabonaci 
{

	
	public static void main(String[] args) 
	{
	    Scanner input = new Scanner(System.in);
        System.out.printf("Enter The Number--->");
		int num = input.nextInt();
		
		int a=0,b=1,d=a+b;
		
		System.out.printf(a+" ");
		System.out.printf(b+" ");
		
		for(int c=1;c<=num-2;c++)
		{   
			System.out.printf((d)+" ");
			a=b;
			b=d;
			d = a+b;
		}

	
	}
}
