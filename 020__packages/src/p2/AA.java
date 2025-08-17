package p2;

public class AA {
	public int aaa =9990;
	private int a =1115;
	public static int aa =2225;
	public void show()
	{
		System.out.println("package p3 A");
		System.out.println("Private memeber of claas A p3 :-"+a);
		System.out.println(aa);
	}
	public static void display()
	{
		System.out.println("package p3 A");
		System.out.println(aa);
	}
	static {
		System.out.println("package p3 A");
		
	}
}
