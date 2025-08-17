
public class pattre27 {
	public static void main(String [] sujal)
	{
		int a=9,b=1,c=5;
		 for(int d =1;d<=a;d++)
			{
			 for(int e=1; e<=c;e++)
			  {
				 System.out.print("*");
			  }
			 for(int e=2; e<=b;e++)
			  {
				 System.out.print(" ");
			  }
			 for(int e=1; e<=c;e++)
			  {
				 System.out.print("*");
			  }
			 System.out.println();
			 
			 if(d<=a/2)
			 {   b+=2;
				 c--; }
			 else 
			 {   b-=2;
				 c++; }
			}
	}

}
