package JAVA.IO.ReadOperations;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class _01_Read {
	public static void main(String[] args) throws Exception {
		// Create a File object

		String path = "D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling";
		File d = new File(path, "write Operation.txt");
		FileReader r = new FileReader(d);

		int unicode = -2;
		do {
			unicode = r.read();
			System.out.print((char) unicode);

		} while (unicode != -1);
      
		/*
		int uni = r.read();// --> read jab sare charater padgh leta hai then return karta hai -1
		while (uni != -1) {
			System.out.print((char) unicode);
			unicode = r.read();
		}
		*/	
	}
}
