package BasicInputAndOutputStream;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;

public class FileCreationPractice {

    public static void main (String args []) throws IOException {

        File cFile = new File("C:\\Faysal Resource\\Practice Programs\\practiceCreateTextFile.txt");

        if (cFile.createNewFile())  {          
            System.out.println("New Text File has been created successfully.");
        }
            else{
            System.out.println("File already Exist.");
            }

            //if (cFile.exists()) {     
            
            System.out.println("Writing on this file. ");

            System.out.println("");

            try{

            FileWriter wFile = new FileWriter("C:\\Faysal Resource\\Practice Programs\\practiceCreateTextFile.txt");

                wFile.write("We are creating a new file. \n");
                wFile.write("We are writing on this new file. \n");
                wFile.write("We are going to read from this new file.\n");

                wFile.close();
                
            }
            catch (IOException e)  {
                System.out.println("We cannot write. File has not been found");
                e.printStackTrace();
            }


            System.out.println("Reading the content of this file. ");

            System.out.println("");

            
            try {

                FileReader rFile = new FileReader("C:\\Faysal Resource\\Practice Programs\\practiceCreateTextFile.txt");

                int character;

                while((character = rFile.read()) !=-1) {

                    System.out.print((char) character);

                }
                rFile.close();

            } catch (IOException e) {
                System.out.println("Cannot be read. File has not been found.");
                e.printStackTrace();
            }
   



    }

}
