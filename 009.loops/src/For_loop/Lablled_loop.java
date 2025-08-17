package For_loop;
public class Lablled_loop 
{
	public static void main(String ...strings )
	{ //labbled loop labled as sujal
	     sujal : for(int a=1; a<=2;a++)
	     {
	    	 System.out.println("Inside Sujal");
	    	 chirag : for(int b=1; b<=2;b++)
		     {
	    		 System.out.println("Inside Chirag");
	    		 himanshu :for(int c=1; c<=3;c++)
	    		 {
	    			 System.out.println("Inside Himanshu");
	    			 if(c==2)
	    			 {
	    				 break sujal;
	    			 }
	    		 }
		     }
	     }
	    	 
	}

}
