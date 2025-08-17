import p1.*;
import p2.*;
import p3.A;
//if you
public class Import2_similar_class_different_package {

	public static void main(String[] args) {
		A a = new A();
		a.show();
//The Object of "class A" here is which package specifies the class in import section
//here import.p3.A;
		System.out.println("-----------------------");
		p1.A b = new p1.A();
		b.show();
		
		System.out.println("-----------------------");
		p2.A c = new p2.A();
		c.show();
		
		System.out.println("-----------------------");
		p3.A d = new p3.A();
		d.show();
		
	}

}
