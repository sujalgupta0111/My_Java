package p1;
import p1.C;

public class B extends C{
	int b =15;
	static int bb =25;
	public void show()
	{
		System.out.println("package p1 A");
		System.out.println(b);
		System.out.println(bb);
	}
	public static void display()
	{
		System.out.println("package p1 A");
		System.out.println(bb);
	}
}
