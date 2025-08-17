package JAVA.IO.Create;

import java.io.File;
import java.io.IOException;

public class _04_to_check_object_points_to_dir_or_file{
    public static void main(String[] args) throws Exception {
        // Create a File object
		String path = "D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling";
		File d = new File(path, "Sujalfolder2");
		File f = new File(path, "Sujalfolder2.txt");
		System.out.println(d.exists());
		System.out.println(d.isDirectory());
		System.out.println(d.isFile());
		
		System.out.println(d.mkdir());
		System.out.println(f.createNewFile());
		
		System.out.println(d.exists());
		System.out.println(d.isDirectory());
		System.out.println(d.isFile());
		
		 

    }
}
