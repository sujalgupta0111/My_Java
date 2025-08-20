package Serealization.savingdiiferentobjectinfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DEserializable {

	public static void main(String... strings) throws IOException, ClassNotFoundException {
		String path = "/home/sujalgupta/Desktop/file/Object1.txt";
		File f = new File(path);

		if (!f.exists()) {
			System.out.println("File not found!");
			return;
		}
		FileInputStream fis = new FileInputStream(f); 
		ObjectInputStream ois = new ObjectInputStream(fis);
		try (ois) {
//always remember that in the order you enter the different Object in the file in that same order you need to retrive it 
// if you dont know the order then use instanceof operator
			while(true) {
			Object obj = ois.readObject();
			if( obj instanceof dog)
			{
				dog d =(dog)obj;
				System.out.println(d);
			}
			if( obj instanceof cat)
			{
				cat c =(cat)obj;
				System.out.println(c);
			}
			}

		} catch (Exception E) {
			System.out.println("Object Deserialized Successfully ");

		}
	}
}
