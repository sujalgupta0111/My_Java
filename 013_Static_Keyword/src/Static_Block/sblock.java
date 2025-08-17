//Before JDK 1.6 static block run without main
//Static block in the memory are the one which executes 
//Static block in the memory are the one Which executed first in the memory 
// compiler executes first all static blocks then executes main block on a same class 
package Static_Block;

public class sblock 
{

	 static
	    {  System.out.println("Static Block 1");   }

	 public static void main(String...strings)
	    {  System.out.println("Main Block 1");     }
	 static
	    {  System.out.println("Static Block 2");   }
}
