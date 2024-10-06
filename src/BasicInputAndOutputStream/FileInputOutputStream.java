package BasicInputAndOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStream {

    public static void main(String[] args) {
        try {
            // Create a new file named "myFile.txt"
            FileOutputStream fos = new FileOutputStream("C:\\Faysal Resource\\Practice Programs\\myFileFileInputOutputStream.txt");

            // Write content to the file
            byte[] data = "Hello, world!\nThis is a text file.".getBytes();
            fos.write(data);

            // Close the output stream
            fos.close();

            // Read content from the file
            FileInputStream fis = new FileInputStream("C:\\Faysal Resource\\Practice Programs\\myFile.txt");
            int c;
            while ((c = fis.read()) != -1) {
                System.out.print((char) c);
            }

            // Close the input stream
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

