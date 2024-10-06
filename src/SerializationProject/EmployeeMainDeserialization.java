package SerializationProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class EmployeeMainDeserialization {

    public static void main (String args []) {


        try{
        FileInputStream fileIn =  new FileInputStream ("emp.txt");
        ObjectInputStream ois = new ObjectInputStream(fileIn);

        Employee emp = (Employee)ois.readObject();
        emp.display();

        ois.close();
        fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File Could not be found!");
            e.printStackTrace();
        }
    }

}
