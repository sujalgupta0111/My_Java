
public class pattren001 {

	public static void main(String[] args) {
		int a=5,b=1;
		int f=1;
		for(int c=1;c<=a;c++)
		{
			for(int d =5; d>=b;d--)
			{
				if(d==f)
				{
					System.out.print("*");
					f++;
				
				}else {
				System.out.print(d);
				}
			}
			System.out.println();
		}
				

	}

}
