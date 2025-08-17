package pratice;
import java.util.Scanner;

public class Prime {

 static void prime(int x)
 {
	
   for(int c=2;c<=x/2;c++){
		if (x%c==0 )
		{ 
		System.out.println("Number is Prime"); 
		}
		else
		System.out.println("Number is Not Prime");
	 }
 }
public static void main(String[] args) 
{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the Number-->");
	int num = input.nextInt();
	 prime(num);
	
	
	
}

}
