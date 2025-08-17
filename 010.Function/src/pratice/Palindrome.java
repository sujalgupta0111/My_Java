package pratice;
import java.util.Scanner;
public class Palindrome {
	
	static void  rverse(int num)
	{
		int take,sum=0,check;
	
		check=num;
		while(num!=0)
		    {
			take = num%10;
			sum = sum*10 + take;
			num = num /10;  
			}
		if(check == sum)
		{  System.out.println("The number is Palindrome");   }
		
		else {  System.out.println("The number is not Palindrome"); }
	
	}

	public static void main(String[] args) 
{
		Scanner input =new Scanner(System.in);
		System.out.println("Enter The Number :- ");
		int a =  input.nextInt();
		 
		rverse(a);
	

	}

}
