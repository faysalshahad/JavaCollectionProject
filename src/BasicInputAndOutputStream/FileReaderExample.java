package BasicInputAndOutputStream;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

    public static void main (String args []) {

        try { 
            FileReader reader = new FileReader("C:\\Faysal Resource\\Practice Programs\\class16.txt");

            int character;

            while ((character = reader.read()) !=-1) {
                System.out.print((char) character); // type casting. Converting integer value to character value to display character letters.

            }
            reader.close();
        } catch (IOException e) {
            // TODO: handle exception

            e.printStackTrace();
            System.out.println("Could not find the file");


        }
    }

}
