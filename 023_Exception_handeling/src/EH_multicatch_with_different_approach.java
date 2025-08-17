//with one try we can use multiple catchs or with one catch mention multiple exception 

public class EH_multicatch_with_different_approach {

	public static void main(String... strings) {
		int a = 0;
		int b = 10;
		int ar[] = new int[5];

		System.out.println("Start");
		try {
			a = a / b;
			int c = ar[8];
		} catch (RuntimeException bc) {
			// we can use all hirearcy members of execptions in this block
			System.out.println("1 with runtime");
			System.out.println(bc);
		}

		try {
			int c = ar[8];
			a = a / b;
		} catch (Exception bc) {

			System.out.println("2 with EXCEPTION");
			/*
			 * this has to use at last as if it uses before there is no scence of using
			 * other Exceptions after that as it already capture the whole Excetions and
			 * rest are not usefull only hirearchy bigger that this cam be use after that
			 */
			System.out.println(bc);
		}

		try {

			int c = ar[8];
			a = a / b;
		} catch (Throwable hj) {
			System.out.println("3 with Throwable");
			System.out.println(hj);
		}
		/*
		 * catch(Exception as) {} any lower hireachy after higher hirerchy are not
		 * allowed
		 */

		System.out.println("END");

	}
}
