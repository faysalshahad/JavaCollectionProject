package BasicInputAndOutputStream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputOutputStream {
    public static void main(String[] args) {
        try {
            // Create a new file named "myFile.txt"
            FileOutputStream fos = new FileOutputStream("C:\\Faysal Resource\\Practice Programs\\BufferInputOutputStreammyFile.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            // Write content to the file
            byte[] data = "Hello, world!\nThis is a text file.".getBytes();
            bos.write(data);

            // Close the output streams
            bos.close();
            fos.close();

            // Read content from the file
            FileInputStream fis = new FileInputStream("C:\\Faysal Resource\\Practice Programs\\BufferInputOutputStreammyFile.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            int c;
            while ((c = bis.read()) != -1) {
                System.out.print((char) c);
            }

            // Close the input streams
            bis.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

