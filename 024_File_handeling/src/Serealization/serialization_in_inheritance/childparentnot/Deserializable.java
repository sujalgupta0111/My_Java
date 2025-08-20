package Serealization.serialization_in_inheritance.childparentnot;

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
			while (true) {
				Dog obj = (Dog) ois.readObject();
//Serealization ke time i ke non serialize block se tha  but tho JVM ne file me uski value zero assign kaar di file me 
//Serealization ke time jo FIle me i store Hua the cat class ka uski value O gyi thi kyuki Cat ne serializablr interface implement nahi kiya 
//Deserialization ke time JVM ne dekha ki cat ne serialozable nhi implement kaar rakha hai
//Then use current class cat ke instance varibale ki value file se mile object me assign kaar di 		.f.

				System.out.println(obj.i);
				System.out.println(obj.j);

			}

		} catch (Exception E) {
			System.out.println("Object Deserialized Successfully ");

		}
	}
}
