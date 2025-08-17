package local_and_anonyoumns_class;

class AAA {
	int a = 13;

	void m1() {

	}
}
/// esme anunomyomous class basically extend kaar rahi hai class ko
public class Anomomous_extended_classes {
	public static void main(String... Sujal) {
		AAA a = new AAA() { // int a= 30;//it is allowed so means it is inheritance rather expansion
			void m1() {
				a = 30;
				System.out.println("hello ");
				System.out.println(a);
			}
		};
		a.m1();
	}
}
