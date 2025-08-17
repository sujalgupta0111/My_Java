package JAVA.IO;
import java.io.*;
import java.util.*;


public class File_io2_bytestream {

	public static void main(String[] args)  throws IOException{
		
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		
		byte b[]=s.getBytes();
		System.out.println();
		
		try {
			//Byte Stream
//			FileOutputStream f=new FileOutputStream("D:\\java codes\\abc.txt");
//			FileOutputStream f=new FileOutputStream("abc.txt");//write mode
			File abcd = new File("D:\\Notes and Learning\\Pratices\\JAVa\\Java Bross\\File handeling\\Sujal.txt\\");
			abcd.createNewFile();
			FileOutputStream f=new FileOutputStream(abcd,true);//append mode(true na likhne se jo pura data hoga vo haat kaar naya data aajayega  )
			//f.write('\n');
			f.write(b);
			f.close();
		}catch (Exception e) {
			System.out.println(e);
		}
		
	}
}