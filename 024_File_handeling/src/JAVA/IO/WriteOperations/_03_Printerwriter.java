//filerwrite me hume nmanually / n daalna padth tha jaab hum multiple write() karte hai tho iski 
//problem solve karne ke liye bufferwriter use kiya
package JAVA.IO.WriteOperations;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class _03_Printerwriter {
	public static void main(String[] args) throws Exception {
		// Create a File object

		String path = "D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling";
		File d = new File(path, "write Operation.txt");
		
		//PrintWriter pw = new PrintWriter(new FileWriter(d,true));agar append karna ho tho yhea 
		PrintWriter pw = new PrintWriter(d); 

		int a =100;
		double b =10.6;
		char c= 'c';
		String s="Printer writer tho kamal ki cheez hai";
		boolean t = true;
		
		pw.print(a);
		pw.println(c);
		pw.print(b);
		pw.println(t);
		pw.print(s);
		
// es me hum jo phela dono write ke metho tho use kaar sakte ahi sath me print aur println ka maja bhi le sakte hai  
		pw.flush();
		pw.close();
		System.out.println("done");

	}
}
