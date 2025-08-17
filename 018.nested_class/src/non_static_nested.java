//nested classses use to make user ristected
class A {
	int a = 15;

	void sujal() {
		System.out.println("A class");
		// System.out.println(b);//member of B not access in A

		// member of B access in A by creating the object of B
		B a = new B();
		System.out.println(a.b);

	}

	class B {// this class is act as member of class A
				// inner class can access the member of the outer class but not via versa

		int b = 15;
		static int a = 13;

		void inner() {
			System.out.println("B class");
			System.out.println(a);
			sujal();
		}

	}
}

public class non_static_nested {

	public static void main(String[] args) {
		// B b = new B();//error
		/*
		 * for creating the object of B first create the Object of A We are not able to
		 * directly create the object of B
		 */

		A a = new A();// object of A
		A.B b = a.new B();// b is reference of object of B

		System.out.println(b.a);
		System.out.println(b.b);
		b.inner();

	}

}

