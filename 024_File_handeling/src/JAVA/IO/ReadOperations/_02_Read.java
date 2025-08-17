package JAVA.IO.ReadOperations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _02_Read {
	public static void main(String[] args) throws Exception {
		// Create a File object

		String path = "D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling";
		File d = new File(path, "write Operation.txt");
		FileReader r = new FileReader(d);
		//char c[] = new char[27];
		//char c[] = new char[2700];
		//char c[] = new char[270];
		
		//best approach to save memory
		char c[] = new char[(int)d.length()];
		System.out.println("Number of charater in a file-->"+r.read(c));
		System.out.println(new String(c));

	}
}
