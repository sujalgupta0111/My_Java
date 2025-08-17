package JAVA.IO.Create;

import java.io.File;

public class variousfunction {

	public static void main(String[] args) throws Exception{
		String path = "D:\\Workplace\\JAVA\\Eclipse\\024_file_handeling\\FileHandeling";
		File d = new File(path, "write.txt");
		d.createNewFile();
		
		System.out.println("name of file"+d.getName());
		System.out.println("name of parentdir "+d.getParent());
		System.out.println("name of parentdir "+d.getAbsoluteFile());
		System.out.println("is absolute "+d.isAbsolute());//return  true is path is absolute  and false when path is relative
		System.out.println(" readable "+d.canRead());
		System.out.println(" writeable "+d.canWrite());
		System.out.println(" File LAst modify "+d.lastModified());
		System.out.println(" File LAst modify "+d.lastModified());
		System.out.println(" Size of File "+d.length());



		

	}

}
