import java.util.Arrays;

public class Array_initialization {

	public static void main(String ...strings )
	{
		int a1 []= {10,10};
	    int a2[] = new int [5];
	    int a3[]=new int []{10,10};
	    
	    
	    int a4[];
	     a4 =new int[] {10,10};
	    //a4= {10,10};//not allowed
	    
	    char c1[]={'h','e','l','l','o'};
	    char c2[] = new char [5];
	    
	    int a5[][] = new int[][] {{1,2,3},{4,5,6}};
	    int a6[][] = new int[][] {{1,2,3},{4,5,7}};
	    
	    
	  System.out.println( Arrays.equals(a1, a3));//to compare 1 d arrays 
	  
	  System.out.println( Arrays.deepEquals(a5, a6));// to compare mutli rrays
	  
	    
	   
	}
	
}
