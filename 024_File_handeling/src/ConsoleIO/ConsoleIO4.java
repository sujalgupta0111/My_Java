package ConsoleIO;
import java.util.Scanner;

public class ConsoleIO4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String a=sc.nextLine();
		System.out.println("Entered String: "+a);
		System.out.println("Enter a Number");
		int b=sc.nextInt();
		System.out.println("Entered Number: "+b);
		System.out.println("Enter a Floating Point Number");
		double c=sc.nextDouble();
		System.out.println("Entered Floating Point Number: "+c);
		System.out.println("Enter a String");
		sc.nextLine();
		String aa=sc.nextLine();
		System.out.println("Entered String: "+aa);
		sc.close();
	}

}
