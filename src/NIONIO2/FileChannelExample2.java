package NIONIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelExample2 {

    public static void main(String[] args) {
        try {
            // Create a new file
            Path filePath = Paths.get("myFile1.txt");
            Files.createFile(filePath);

            // Write content to the file
            String content = "Hello, world!\nThis is a text file.\n";
            Files.write(filePath, content.getBytes(), StandardOpenOption.APPEND);

            int content1 = 129835;
            String s1 = String.valueOf(content1);
            Files.write(filePath, s1.getBytes(), StandardOpenOption.APPEND);

            // Read content from the file
            String readContent = new String(Files.readAllBytes(filePath));
            System.out.println(readContent);

              // Delete the file
            //   Files.delete(filePath);

            //   // Check if the file exists
            //   if (Files.exists(filePath)) {
            //       System.out.println("File still exists.");
            //   } else {
            //       System.out.println("File deleted successfully.");
            //   }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


