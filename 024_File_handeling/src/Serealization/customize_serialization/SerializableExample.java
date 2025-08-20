package Serealization.customize_serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExample {
	public static void main(String... strings) throws IOException {
		String path = "./src/Object1.txt";
		File f = new File(path);
		Accounts account = new Accounts();
		Accounts account2 = new Accounts();
		account.setId("1").setPass("sujalgupta");
		account2.setId("2").setPass("ashagupta");
		if (!f.exists()) {
			f.createNewFile();
		} else {
			f.delete();
			f.createNewFile();
		}
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		try (oos) {
			oos.writeObject(account);
			oos.writeObject(account2);

			System.out.println("Objects serialized successfully");
		}
	}
}
