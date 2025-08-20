package Serealization;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExample {
    public static void main(String... strings) throws IOException {
        Students s1 = new Students().setName("Sujal Gupta").setRollno(1);
        Students.al="19"; s1.al2="18";
        Students s2 = new Students().setName("Devesh Kumar").setRollno(2);
        Students s3 = new Students().setName("rupesh Kumar").setRollno(3).setClassroom(80);
        Students s4 = new Students().setName("Devprakhan").setRollno(4).setBaap("Sujal").setClassroom(90);
        String path = "/home/sujalgupta/Desktop/file/Object1.txt";
        File f = new File(path);

        if (!f.exists()) {
            f.createNewFile();
        }

        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(s1);
            oos.writeObject(s2);
            oos.writeObject(s3);
            oos.writeObject(s4);

            System.out.println("Objects serialized successfuprivate String name;lly!");
        }
    }
}
