package pratice;
import java.util.Scanner;



public class Armstromg {

	public static void main(String[] args) 
	{
		int take,sum=1,check,count=0,result =0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = input.nextInt();
		check=num;
		int x=num;
	//number of digits	
		while(x!=0)
		{
			x=x/10;
			count++;
		}
		while(num!=0)
		   {
			   take = num%10;
			   for(int y=1;y<=count;++y)
			       {  
				     sum= sum*take;
			       }
			   result = result + sum;
			   sum=1;
               num = num/10;
		  }
		
		if(check == result)
	    System.out.println("Armstrong");
		else 	 
		System.out.println("not Armstrong");
		
	}
	}

