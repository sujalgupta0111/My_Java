package While_do_while_loop;
import java.util.Scanner;
public class reverse_the_number 
{

	public static void main(String[] args) 
	{ int take,rev=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a no.: ");
		int a =input.nextInt(); 
		
		while(a!=0)
		{
			take = a%10;
			rev=rev*10 + take;
			a=a/10;
			/*if(a==0)
			{
				System.out.println(sum);
			}*/
		}
		
		System.out.println(rev);
		
		
		

	}

}
