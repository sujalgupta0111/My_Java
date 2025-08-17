package JAVA.IO;
import java.io.*;
import java.util.*;


public class File_io3_Charater_stream {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String file = "D:\\Notes and Learning\\Pratices\\JAVa\\Java Bross\\File handeling\\Sujal.txt\\";
		System.out.println("Enter a String:");
		String s=sc.nextLine();
		sc.close();
		//char c[]=s.toCharArray();
		
		
		try {
			//Character Stream
			FileWriter f=new FileWriter(file,true); //write mode
			//FileWriter f=new FileWriter("abc.txt",true); //append mode
			//f.write(c);//(ek ek charater kaar ke bhi print karwa sakte ho)
			f.write("\n \n");
			f.write(s);//allowed(sara string ek sath bhi de sakte ho)
			f.close();
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}