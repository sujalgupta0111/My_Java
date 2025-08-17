package JAVA.IO.ReadOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _03_BufferedReader {
	public static void main(String[] args) throws Exception {
		// Create a File object

		String path = "D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling";
		File d = new File(path, "write Operation.txt");
		FileReader r = new FileReader(d);
		BufferedReader br = new BufferedReader(r);
		
		//char c[] = new char[27];
		//char c[] = new char[2700];
		//char c[] = new char[270];
	
		String line = br.readLine();
		
		while(line!=null)
		{
			System.out.println(line);
			line = br.readLine();
			
		}
	}
}
