package static_nested_class;

class AA {
	static class BB {
		int a=30;
		
		void display() {
			System.out.println("Hello static Class BB");
		}

	}
}

public class StaticClass_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AA.BB a = new AA.BB();
		a.display();

	}

}
