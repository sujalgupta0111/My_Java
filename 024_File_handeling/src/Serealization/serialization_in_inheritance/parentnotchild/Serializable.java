package Serealization.serialization_in_inheritance.parentnotchild;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable {
	public static void main(String... strings) throws IOException {
		String path = "./src/Object1.txt";
		File f = new File(path);
		Dog d = new Dog();

		if (!f.exists()) {
			f.createNewFile();
		} else {
			f.delete();
			f.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		try (oos) {
			oos.writeObject(d);

			System.out.println("Objects serialized successfully");
		}
	}
}
