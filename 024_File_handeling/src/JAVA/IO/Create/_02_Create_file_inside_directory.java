package JAVA.IO.Create;

import java.io.File;
import java.io.IOException;

public class _02_Create_file_inside_directory{
    public static void main(String[] args) throws Exception {
        // Create a File object
		//yaha paar jo path denga us
    	String path ="D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling\\Sujal.text";
		File f = new File(path);//this line not create any file it just create a memeory object that represent that file
		File d = new File(path,"Sujalfolder");
		//agar file ka path ho uske under kuch aur bana file yhea directory then you just seperated by comma.
		System.out.println(f.exists());
		System.out.println(d.exists());
		System.out.println("-----------------------------------");
		

		System.out.println(f.createNewFile());//this create File in memory
		System.out.println(d.mkdir());//this create File in memory
		System.out.println("-----------------------------------");

		
		System.out.println(f.exists());
		System.out.println(d.exists());
		
		
    }
}
