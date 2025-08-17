package JAVA.IO.Create;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class _06_Select_specfic_subdirectoryorfile_in_dir {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
    	String path ="D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling\\";
    	int count =0;
    	File F = new File(path);//es path ke under folders hai unmese kisi ek ko chun kaar usme file banani hai 
    	String o[] = F.list();
    	
    	for(int i=0; i<o.length;i++)
    	{
    		File t = new File(path,o[i]);
    		if(t.isDirectory())
    		{
    			File f = new File(path,o[i]+"\\suar.txt");
    			if(f.createNewFile()) {
    			count++;
    			System.out.println("created "+count+" time");
    			}
    			
    		
    		}
    			
    	}
    
    
    	
    	
    
    	
	}
	
}
