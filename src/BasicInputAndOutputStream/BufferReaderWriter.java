package BasicInputAndOutputStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderWriter {

    public static void main(String[] args) {
        try {
            // Create a new file named "myFile.txt"
            File file = new File("C:\\Faysal Resource\\Practice Programs\\myFileBufferReaderWriter.txt");

            // Write content to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("Hello, world!\n");
            writer.write("This is a text file.");
            writer.close();

            // Read content from the file
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

