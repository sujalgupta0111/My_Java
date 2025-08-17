package Static_Block;
class rty
{   static {System.out.println("Static rty 1");}    }



public class sblock2 
{
	    public static void main(String[] args) 
        {
		   rtx a = new rtx();//object of rtx
		   
/*When the object of a class created then if that class contain static run if we don't create object of that class static block of that class not executed*/
		  System.out.println("Main block");
		  
		  rty b = new rty();//object of rty
	    }
    
        static {   System.out.println("Static sblock2 1");  }

   
        static {   System.out.println("Static sblock2 2");  }
}


class rtx
{   static {System.out.println("Static rtx 1");}  }
