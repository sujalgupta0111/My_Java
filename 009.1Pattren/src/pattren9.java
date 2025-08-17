
public class pattren9 {

	public static void main(String[] args) {
		
	int a=9,b=1,c=4;
	 for(int d=1; d<=a;d++)
	 {
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
		 {
	       c--;
	       b++;
	       }
		 else
		 {
			 c++;
			 b--;
		 }
	 }

	}

}
