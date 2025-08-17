package For_loop;

public class Forloop {

	public static void main(String[] args) {
//different ways of using for loop
System.out.println("----------------------------Method 1--------------------------------------");
		
		
		for(int a=1; a<=5;a++)
		{ 
			System.out.println(a); 
		}
		
System.out.println("----------------------------Method 2--------------------------------------");	
		
		
		for(int a=1; a<=5;)
		{ 
		  System.out.println(a);
		  a++;
		}
		
System.out.println("----------------------------Method 3--------------------------------------");
		

        int b=1;
		for(;b<=5;)
		{    
		System.out.println(b);
            b++;
		}
		
System.out.println("----------------------------Method 4--------------------------------------");
		

        int c =1;
		for(; ;)
		{  
			if(c<=5)
		
			{
			System.out.println(c);
			if(c==5)
			  break;
			}
		
		     c++;
		}
System.out.println("------------------------------------------------------------------");
		
		
	}

}
