package Serealization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DEserializable {
	Students obj;

	public static void main(String... strings) throws IOException, ClassNotFoundException {
		String path = "/home/sujalgupta/Desktop/file/Object1.txt";
		File f = new File(path);
		Students obj = new Students();

		if (!f.exists()) {
			System.out.println("File not found!");
			return;
		}

		try (FileInputStream fis = new FileInputStream(f); ObjectInputStream ois = new ObjectInputStream(fis)) {
			obj = (Students) ois.readObject();
			while (obj != null) {
				System.out.println(obj);
				obj = (Students) ois.readObject();

			}

		} catch (Exception E) {
			System.out.println("Object Deserialized Successfully ");

		}
	}
}
