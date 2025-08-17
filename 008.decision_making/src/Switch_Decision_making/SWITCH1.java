//switch Does not work with boolean and floating point integers
//only work with Character and integer
package Switch_Decision_making;

public class SWITCH1 {

	public static void main(String[] args)
	{
java.util.Scanner sc=new java.util. Scanner( System.in );
		
		System.out.println("Enter a No: ");
		int a=sc.nextInt();
		switch(a) {
			case 1:
				System.out.println("Jan");
				break;
			case 2:
				System.out.println("Feb");
				break;
			case 3:
				System.out.println("March");
				break;
		
			default:
				System.out.println("Invalid No.!");
		}

	}

}
