package ConsoleIO;
import java.io.*;

public class Console1 {

	public static void main(String[] args)  {
		try {
			System.out.println("Enter a Character");
			int a=System.in.read();//return asci code in integer
			System.out.println("Entered Character is");
			System.out.println(a);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
