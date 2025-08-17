public class pattren26 {
	static public void main(String ... Sujal)
	{
		int a=9,b=1,c=8;
		 for(int d =1;d<=a;d++)
			{
			 for(int e=1; e<=b;e++)
			  {
				 System.out.print("*");
			  }
			 for(int e=1; e<=c;e++)
			  {
				 System.out.print(" ");
			  }
			 for(int e=1; e<=b;e++)
			  {
				 System.out.print("*");
			  }
			 System.out.println();
			 
			 if(d<=a/2)
			 {   b++;
				 c-=2; }
			 else 
			 {   b--;
				 c+=2; }
			}
	}

}
