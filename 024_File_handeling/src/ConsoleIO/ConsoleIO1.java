package ConsoleIO;
import java.io.IOException;

public class ConsoleIO1 {
//System.in ek input stream file hai jo help karti hai input karane me 

	public static void main(String[] args)  {
		try {
			System.out.println("Enter a Character");
			int a=System.in.read();
			System.out.println("Entered Character is");
			System.out.println((char)a);
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
