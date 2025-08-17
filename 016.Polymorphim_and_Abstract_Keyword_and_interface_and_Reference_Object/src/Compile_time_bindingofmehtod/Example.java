package Compile_time_bindingofmehtod;

class A {
	static int a = 10;
	int b = 30;

	A() {
		// Constructor me print() call ho raha hai
		print();
		/*
		 * Yaha method overriding ke wajah se print() call hoga B ka (kyunki runtime par
		 * object B ka bana hai).
		 * 
		 * Variables (a aur b) compile time par jis class me declare hain usi se bind
		 * hote hain. Lekin kyunki yaha B.print() execute ho raha hai, uske andar ke
		 * variables B ke hain, isliye B ke values print hongi.
		 */
	}

	public void print() {
		System.out.println("A print a=" + a + " y=" + b);
	}
}

class B extends A {
	static int a = 1;
	int b = 3;

	B() {
		// super() automatically call hoga
	}

	@Override
	public void print() {
		System.out.println("B print a=" + a + " y=" + b);
	}
}

public class Example {
	public static void main(String[] args) {
		new B();
	}
}
