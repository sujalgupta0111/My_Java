package scannert;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Filessa {

	public static void main(String[] args) throws IOException {
		String path ="/home/sujalgupta/Desktop/file/files.txt";
		File a = new File(path);
		a.createNewFile();
		Scanner in = new Scanner(a);
		in.useDelimiter(",");
		
		while (in.hasNextLine()) {
            String line = in.next().trim();
            System.out.println(line);
        }

	}

}
