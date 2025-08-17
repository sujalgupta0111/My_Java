package JAVA.IO.Create;

import java.io.File;
import java.io.IOException;

public class _01_CreateFile_and_directory{
    public static void main(String[] args) throws Exception {
        // Create a File object
	
    	String path ="D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling";
		File d = new File(path,"Sujalfolder2");
		System.out.println(d.length());
		 if(d.mkdir())
			 System.out.println("done");
		 else
			 System.out.println("not done");
		 File f = new File(d,"Sujalfolder2.txt");
		 
		 if(f.createNewFile())
			 System.out.println("done");
		 else
			 System.out.println("not done");	
			System.out.println(f.length());
			System.out.println(d.length());


    }
}
