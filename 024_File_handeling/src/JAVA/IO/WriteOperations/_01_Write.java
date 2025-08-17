package JAVA.IO.WriteOperations;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class _01_Write {
	public static void main(String[] args) throws Exception {
		// Create a File object

		String path = "D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling";
		File d = new File(path, "write Operation.txt");

//ploblem with ths is ki jab hum multiple karte the then kiya hota tha last me hume \n lagana padta tha 
		// new line ke liye jo bhout irritationg tha prgramer ke liye esliye next level writer buffer writer ka use kiya jata hia eski jagha 
		FileWriter fw = new FileWriter(d);
		int c = 99;
		char ch[] = { 's', 'u', 'j', 'a', 'l' };
		String s = "Hello my name is sujal";
		fw.write(c);
		fw.write(ch);
		fw.write(s);

		fw.flush();
		fw.close();
		System.out.println("done");

	}
}
