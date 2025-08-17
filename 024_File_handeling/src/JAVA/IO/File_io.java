package JAVA.IO;
import java.io.*;
import java.util.*;


public class File_io {

	public static void main(String[] args)  throws IOException{
		
		//create file 
		File myfile = new File("D:\\Notes and Learning\\Pratices\\JAVa\\Java Bross\\File handeling\\Sujal.txt\\");
		/*this line create a object of file not file itself*/
		
		System.out.println(myfile.exists());
		//if file not created then it return false
		
		//myfile.createNewFile();//this create a file 
	      //myfile.mkdir();// this is use to make afolder or directories
	      
	     System.out.println( myfile.getAbsolutePath());
	     System.out.println( myfile.getPath());
	     System.out.println( myfile.getCanonicalPath());
	     
		
	}
}