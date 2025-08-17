public class pattren10
{
   public static void main(String[] args) 
   {
	int a=5,b=4;
	for(int c=1;c<=a;c++)
	{
		for(int d=1;d<=b;d++)
		{
		  System.out.print(" ");
		}
		for(int d=1;d<=a;d++)
		{
		  System.out.print("*");
		}
		System.out.println();
		b--;
	}
   }
}
