class A
{   int b =10;
	A()
	{
		a++;
		b=b+a;
	}
	static int a=10;
	//int b =10;
	void Show()
	{
		System.out.println(b);
	}
}
public class arrays_of_Object {

	public static void main(String[] args) {
		
		A b[] = new A[5];
		
		for(int i=0; i<=b.length-1;i++)
			
		{
			b[i]= new A();
		}
		
		for (A k : b) {
			System.out.println(k.a);
			k.Show();
			
		}
		

	}

}
