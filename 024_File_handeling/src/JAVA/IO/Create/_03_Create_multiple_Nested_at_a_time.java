package JAVA.IO.Create;

import java.io.File;
import java.io.IOException;

public class _03_Create_multiple_Nested_at_a_time{
    public static void main(String[] args) throws Exception {
        // Create a File object
	
    	String path ="D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling";
		File d = new File(path,"Direstory/nestedDirestory/nestedfolder/newfolder");
		 if(d.mkdirs())
			 System.out.println("done");
		 else
			 System.out.println("not done");
			 
		 
		
		
		
		
		
    }
}
