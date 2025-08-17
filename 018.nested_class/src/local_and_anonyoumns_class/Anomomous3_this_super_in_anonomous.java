package local_and_anonyoumns_class;

abstract class Test {
	int x = 100;

	abstract void show();
}

class raj {
	int x = 1000;
}

class Outer extends raj {
	int x = 10;

	void test() {
		Test obj = new Test() {
			int x = 20;

			void show() {
				System.out.println("Local x: " + this.x);
				// this.x essa acces ho raha hai anonyomous class ka x
				System.out.println("Outer class x: " + Outer.this.x);
				// Outer.this.x essa access ho raha hai outer class ka variable
				System.out.println("abstract class test ka  x: " + super.x);
				// super.x essa access kaar raha hai test ke x ko kyo ki anonomouys class text
				// ko extend kaar rahi hia
				System.out.println("raj class x: " + Outer.super.x);
				// Outer.super.x access kar raha hai raj ke x ko

			}
		};
		obj.show();
	}
}

public class Anomomous3_this_super_in_anonomous {
	public static void main(String[] args) {
		new Outer().test();
	}
}
