package BasicInputAndOutputStream;

import java.io.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataInputOutputStream2 {

    public static void main(String[] args) {
        try {
            // Write text to a file using DataOutputStream
            FileOutputStream fos = new FileOutputStream("C:\\Faysal Resource\\Practice Programs\\DataInputOutputStreamdatamyFile.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            String text = "Hello, world!\nThis is a text file.";
            byte[] data = text.getBytes();
            dos.write(data);

            dos.close();
            fos.close();

            // Read text from the file using DataInputStream
            FileInputStream fis = new FileInputStream("C:\\Faysal Resource\\Practice Programs\\DataInputOutputStreamdatamyFile.txt");
            DataInputStream dis = new DataInputStream(fis);

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = dis.read(buffer)) != -1) {
                String line = new String(buffer, 0, bytesRead);
                System.out.println(line);
            }

            dis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


