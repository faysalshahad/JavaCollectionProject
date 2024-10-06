package SerializationProject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EmployeeMain {

    public static void main (String args []) {

        Employee emp = new Employee("David Mark", "8623923", "dm@gmail.com", "Manager");

        emp.display();

        System.out.println("==============================");
        System.out.println("");

        System.out.println("New Employee Details: ");
        System.out.println("");

        emp.setEmployee("Mary Jane");
        emp.setMobileNo("8236893");
        emp.setEmail("mj@gmail.com");
        emp.setDesignation("General Manager");

        emp.display();

        Employee emp2 = new Employee("Alan Smith", "13458623923", "as@gmail.com", "Assistant Manager");

        try {
            FileOutputStream file = new FileOutputStream("emp.txt");
            ObjectOutputStream  obs = new ObjectOutputStream(file);

            obs.writeObject(emp2);
            obs.close();
            file.close();

            System.out.println("Successfully Serialization has been completed.");

        } catch (IOException e) {
            System.out.println("Could not get the file.");
            e.printStackTrace();
        }




    
    }

}
