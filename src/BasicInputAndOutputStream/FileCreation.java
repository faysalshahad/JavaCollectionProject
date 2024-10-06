package BasicInputAndOutputStream;

import java.io.File;
import java.io.IOException;



public class FileCreation {
    public static void main (String args []) throws IOException{

        File createFile = new File("C:\\Faysal Resource\\Practice Programs\\createClass17.txt");

        if (createFile.createNewFile()) {
            System.out.println("Create a Text File Successfully.");            
        } else{
            System.out.println("File Already Exist.");
        }

        File createFile1 = new File("C:\\Faysal Resource\\Practice Programs\\createClass17.xls");

        if (createFile1.createNewFile()) {
            System.out.println("Create a Microsoft Excel File Successfully.");            
        } else{
            System.out.println("File Already Exist.");
        }

        File createFile2 = new File("C:\\Faysal Resource\\Practice Programs\\createClass17.doc");

        if (createFile2.createNewFile()) {
            System.out.println("Create a Microsoft Word File Successfully.");            
        } else{
            System.out.println("File Already Exist.");
        }

        File createFile3 = new File("C:\\Faysal Resource\\Practice Programs\\createClass17.pdf");

        if (createFile3.createNewFile()) {
            System.out.println("Create a Microsoft PDF File Successfully.");            
        } else{
            System.out.println("File Already Exist.");
        }

        File createFile4 = new File("C:\\Faysal Resource\\Practice Programs\\createClass17.pptx");

        if (createFile4.createNewFile()) {
            System.out.println("Create a Microsoft Powerpoint File Successfully.");            
        } else{
            System.out.println("File Already Exist.");
        }

        File foundFile = new File("C:\\Faysal Resource\\Practice Programs\\createClass17.txt");

        if (foundFile.exists()) {

            System.out.println("File Name = " + foundFile.getName());
            System.out.println("File Location = " + foundFile.getAbsolutePath());
            //System.out.println("File Delete = " + foundFile.delete()); //to delete the file
            
        } else {
            System.out.println("File do not exist");
        }
    }

}
