
public class pattren6 {

	public static void main(String[] args) {
		int a= 5,b=9,e=1;
		
		for(int c=1;c<=a;c++)
		{
			for(int d=2;d<=e;d++)
			{
			System.out.print(" ");
			}
			for(int d =1;d<=b;d++)
			{
			System.out.print("*");
			}
			System.out.println();
			b-=2;
			e++;
		}

	}

}
