class B {
	static {
		System.out.println("Static of B");
	}// no 1 in every position
	
	C a = new C();
	{
		System.out.println("IB of B");
	}

	B() {
		System.out.println("Constructor of B");
	}
	// position depends on where it is before object of C after Object of C

	

	// C.D b =a. new D();
	// D c = new D();

	class C {

		static {
			System.out.println("Static of C");
		}
		D c = new D();
		{
			System.out.println("IB of C");
		}

		C() {
			System.out.println("Constructor of C");
		}

		

		class D {
			// D b = new D();
			static {
				System.out.println("Static of D");
			}
			{
				System.out.println("IB of D");
			}

			D() {
				System.out.println("Constructor of D");
			}
		}
	}

}

public class non_static_nested_4 {

	public static void main(String[] args) {
		B a = new B();
		// B.C b = a.new C();
		// B.C.D c = b.new D();
	}

}
