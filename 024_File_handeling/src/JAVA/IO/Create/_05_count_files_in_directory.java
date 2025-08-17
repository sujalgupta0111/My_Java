package JAVA.IO.Create;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class _05_count_files_in_directory {
	public static void main(String[] args) throws Exception {
    	String path ="D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling\\";
    	
    	File F = new File(path);
    	String a[] = F.list();
    	System.out.println("name Of files and folder-->"+Arrays.toString(a));
    	
    	int Files=0;
    	int Folders=0;
    	
    	for(int i=0; i<a.length;i++)
    	{
    		File t = new File(path,a[i]);
    		if(t.isFile())
    			Files++;
    			else
    			Folders++;
    	}
    	
           System.out.println("Files-->"+ Files);
           System.out.println("Folders-->"+ Folders);
	}
	
}
