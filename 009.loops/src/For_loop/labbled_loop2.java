package For_loop;

public class labbled_loop2 {
	public static void main(String ... sujal)
	{
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
	    				 break himanshu;
	    			 }
	    		 }
		     }
	     }
	}

}
