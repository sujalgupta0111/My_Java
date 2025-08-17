//filerwrite me hume nmanually / n daalna padth tha jaab hum multiple write() karte hai tho iski 
//problem solve karne ke liye bufferwriter use kiya
package JAVA.IO.WriteOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class _02_BufferWrite {
	public static void main(String[] args) throws Exception {
		// Create a File object

		String path = "D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling";
		File d = new File(path, "write Operation.txt");
		FileWriter a = new FileWriter(d);
		//BufferedWriter is use wrtie the charater data 
		// buffer reader direct file se communicate nahi kar skate esliye usems file writer pass kiya jata hai
		BufferedWriter bw = new BufferedWriter(a);
		
		
		int c = 99;
		char ch[] = { 's', 'u', 'j', 'a', 'l' };
		String s = "Hello my name is sujal";
		bw.write(c);
		bw.newLine();
		bw.write(ch);
		bw.newLine();

		bw.write(s);
// esme bhi file writer ki trha chipak jayenge 3no agae newline method ka use nahi kiya tho
		bw.flush();
		bw.close();
		System.out.println("done");

	}
}
