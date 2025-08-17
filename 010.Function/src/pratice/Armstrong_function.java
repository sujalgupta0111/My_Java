package pratice;
import java.util.Scanner;
public class Armstrong_function 
{
static int digits(int x)
	{   int count=0;
		while(x!=0)
		{  
			x=x/10;
			count++;
		}
		return count; }
	
 static  void armstrong(int x,int c)
   {
	   int take,sum=1,check,result =0;
			   check=x; 
			   int num =x;
		
		while(num!=0)
		{
			take = num%10;
			for(int y=1;y<=c; y++)
			{   sum= sum*take; }
			   
			   num = num/10;
			   result = result + sum;
		       sum=1;
	    }
		
		if(check == result)
	    System.out.println("Armstrong");
		else 	 
		System.out.println("not Armstrong");		
}

public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
	System.out.printf("Enter the Number = ");
	int num = input.nextInt();
	armstrong(num,digits(num));
		
}// main class closing

}//closing

