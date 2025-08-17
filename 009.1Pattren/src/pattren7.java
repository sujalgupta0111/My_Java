//pyramids
public class pattren7 {

	public static void main(String[] args) {
		int a= 9,b=1,e=a/2;
		
		for(int c=1;c<=a;c++)
		{
			for(int d=1;d<=e;d++)
			{
			System.out.print(" ");
			}
			for(int d =1;d<=b;d++)
			{
			System.out.print("*");
			}
			System.out.println();
			if(c<=a/2)
				{
				b+=2;
				e--;
				
			    }
			else { 
				b-=2;
			    e++;
			}
			
		}
		

	}

}
