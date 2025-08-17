public class ex4co {
	int x;
	String y;
	void show() {
		System.out.println(x+y);
	}
	public static void main(String[] args) {
		ex4co a=new ex4co();
		a.x=10;
		ex4co b=new ex4co();
		b.y="Ram";
		a.show();
		b.show();
	}
}