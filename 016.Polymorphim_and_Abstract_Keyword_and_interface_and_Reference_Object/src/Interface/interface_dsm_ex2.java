package Interface;
interface DD {
	void m();

	default void xyz() {//default is keyword not access specifier
		System.out.println("interfacae DD XYZ");
	}
}

interface CC {

	void m2();

	default void xyz() {
		System.out.println("Interface CC XYZ");
	}
}

class I implements CC
{
	public void m2() {}
    public void xyz()
	{
		
	}
}

class EE {

	public void xyz() {
		System.out.println("Class EE Xyz");
	}
}

class XX extends EE implements DD {
	public void m() {
		System.out.println("Hi X");
		xyz();// Class EE Xyz
	}
}

class YY implements DD, CC {
	public void xyz() {
		System.out.println("Class YY XYZ");
	}

	public void m() {
		System.out.println("Class YY m");
		xyz();// Class YY XYZ
	}

	public void m2() {
		System.out.println("Class YY m2");
		xyz();//Class YY XYZ
	}
}



public class interface_dsm_ex2 {
	public static void main(String[] args) {
		DD a;// interface DD
		a = new XX();// object xx with reference of interface A
		a.m();
		a.xyz();
		System.out.println("------------------------------");
		
		a = new YY();// object YY with reference of interface A
		a.m();
		a.xyz();
		System.out.println("------------------------------");

		XX x = new XX();// class XX
		x.m();
		x.xyz();
		System.out.println("------------------------------");

		YY y = new YY();// class YY
		y.m();
		y.m2();
		y.xyz();
	}
}
 