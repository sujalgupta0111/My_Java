package pratice;
import java.util.Scanner;
public class Artithematic {
	
static void sum(int a, int b) {  System.out.println( "The Sum is = "+(a+b));   }
	
static void Sub(int a, int b){   System.out.println("The Sub is ="+(a-b));   }

static void option()
{
	
}

public static void main(String[] args) 
{
  int x ,y,z;
  
  Scanner input = new Scanner(System.in);
  
  System.out.printf("Enter the Number 1 =");
     x =input.nextInt();
  System.out.printf("Enter the Number 1 =");
     y =input.nextInt();
    
     System.out.println(); 
     System.out.println("Press 1 for SUM");
     System.out.println("Press 2 for SUB");
     System.out.println("Press 3 for MUL");
     System.out.println("Press 4 for DIV");
     System.out.println("Press 5 for all");
     z =input.nextInt();
     
     System.out.println(); 
    

  

}
static void mul(int a, int b){  System.out.println("The Multiply is ="+(a*b));   }
	
static void div(int a, int b){  System.out.println("The Division is ="+(a/b));   }

}
