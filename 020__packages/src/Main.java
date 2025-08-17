//single public class allowed in a java program
//the members you want to import make them public 
//import p1.* //use to impor all classes of p1
import p1.A;
import p1.B;

class Mainy
{
	}
public class Main {

	public static void main(String[] args) {
	   	A.display(); //after import static member of class is directly call by class name 
		 System.out.println("-----------------------");
		System.out.println(A.aa);
		System.out.println("-----------------------");
		 A a= new A();
		
		 System.out.println(a.aaa);
		 System.out.println("-----------------------");
		 a.show();
		 
		 B b =new B();
		 System.out.println("-----------------------");
		 b.show1();
		

	}

}
