package Serealization.customize_serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializable {

	public static void main(String... strings) throws IOException, ClassNotFoundException {
		String path = "./src/Object1.txt";
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
			while (true) {
				Accounts obj = (Accounts) ois.readObject();
				System.out.println(obj);

			}

		} catch (Exception E) {
			System.out.println("Object Deserialized Successfully ");

		}
	}
}
