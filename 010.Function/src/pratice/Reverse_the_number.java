package pratice;
import java.util.Scanner;
public class Reverse_the_number 
{
	static int reverse(int num)
	{
		int take,sum=0;
		while(num!=0)
		  {
			take = num%10;
			sum = sum*10 + take;
			num = num /10;
		   }
		return sum;
		
	}

	public static void main(String[] args) 
	{
		int a,b;
	Scanner input = new Scanner(System.in);
	 System.out.println("Enter The Number =");
	 b = input.nextInt();
	 a= reverse(b);
	 System.out.println("The Reverse Number is="+a);
		

	}

}
