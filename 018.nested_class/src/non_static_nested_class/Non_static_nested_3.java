package non_static_nested_class;
class D
{
	class B
	{
		class C
		{
			static int a =40;
			static void sujal()
			{
				System.out.println("Class C  inside B inside A");
			}
		}
	}
}
public class Non_static_nested_3 {

	public static void main(String[] args) {
		
		D.B.C.sujal();//give full path to access static members 
		System.out.println("Static Var Inside C->"+D.B.C.a);
		
	}

}
