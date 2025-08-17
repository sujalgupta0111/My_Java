class C {
	void max() {
		System.out.println("ClasS C");
	}

	class D// class D
	{
		void max() {
			System.out.println("ClasS D");
		}

		class E // class E
		{
			void max() {
				System.out.println("ClasS E");
			}

			class F// class F
			{
				void max() {
					System.out.println("ClasS F");
				}
			}
		}
	}
}

public class non_static_nested_2 {

	public static void main(String[] args) {

		C a = new C();// Object of C
		C.D b = a.new D();// object of D
		C.D.E c = b.new E();// object of E
		C.D.E.F d = c.new F();// object of F

		a.max();
		b.max();
		c.max();
		d.max();

	}

}
