package Serealization.savingdiiferentobjectinfiles;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExample {
	public static void main(String... strings) throws IOException {
		String path = "/home/sujalgupta/Desktop/file/Object1.txt";
		File f = new File(path);
		dog d = new dog("kutta", 4);
		cat c = new cat("cat", 40);
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
			oos.writeObject(c);

			System.out.println("Objects serialized successfully");
		}
	}
}
