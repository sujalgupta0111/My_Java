package Serealization.serialization_in_inheritance.parentnotchild;

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
				Dog obj = (Dog) ois.readObject();
				System.out.println(obj.i);
				System.out.println(obj.j);

			}

		} catch (Exception E) {
			System.out.println("Object Deserialized Successfully ");

		}
	}
}
