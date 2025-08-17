
public class EH_try_Catch_finally {

	public static void main(String... strings) {
		int a = 0;
		int b = 10;
		try {
			System.out.println("this line run ");
			int c = b / a;
			System.out.println("this line not run ");
		} catch (ArithmeticException e) {
			System.out.println("not divided by zero");
			System.out.println(e);
			e.printStackTrace();
		} finally {// this block either exception come or not
			System.out.println("\n\nFinally run at any condition either exception comes or not");
		}

		System.out.println("this line  run ");

	}

}
