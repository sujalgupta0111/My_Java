package For_loop;
import java.util.*;
public class prime_flaging {
	public static void main(String ...strings ) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The NUmber-->");
		int num = input.nextInt();
		boolean isprime = true;
		if (num<2)
			isprime = false;
		else
			isprime = true;
		for(int i=2; i<=num/i;i++)
		{
			if((num%i)==0)
			{
				isprime =false;
				break;
				}
			
		}
		if(isprime)
		{
			System.out.println("Prime");
		}else
			System.out.println("Not Prime");
	}

}
