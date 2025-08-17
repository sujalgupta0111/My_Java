class A
{
	String s = "Sujal ";
	 static int b = 10;
	 
	 void show()
	 {
		 System.out.println("String ->"+s +", Integer->"+b);
	 }
	 A()
	 {
		 System.out.println("\n Inside a A Constructor");
		 System.out.println("String ->"+s +", Integer->"+b);
		 s="Chirag";
		/*System.out.println("String ->"+s +", Integer->"+b); 
		 show chirag in output because s change the value here */
		 b++;
	 }
}
public class Constructor3 {

	public static void main(String[] args) {
		
	   A a = new A();
	   A b = new A();
	   A c = new A();
	   System.out.println("----------------------------------------"); 
	   a.show();
	   b.show();
	   c.show();

	}

}
