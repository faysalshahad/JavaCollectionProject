package BasicInputAndOutputStream;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileWriterExample {

    public static void main (String args []) {

        System.out.println("");
        System.out.print("");
        System.out.printf("");


        try {

        FileWriter obj =  new FileWriter("C:\\Faysal Resource\\Practice Programs\\class16.txt");

        obj.write("Hello Everyone!");
        obj.write("This is the first file!");
        obj.write("This file is displaying the messages!");

        obj.close();

        System.out.println("Successfully wrote on the file");
            
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
            System.out.println("Could not find the file.");
        }


    }

}
