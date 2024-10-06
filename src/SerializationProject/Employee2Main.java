package SerializationProject;

public class Employee2Main {

    public static void main(String[] args) {
        // Creating an instance of the Employee class
        Employee2 employee = new Employee2("John Doe", "1234567890", "john.doe@example.com", "Software Engineer");

        // Displaying initial employee details
        System.out.println("Initial Employee Details:");
        System.out.println(employee);

        // Modifying employee details using setter methods
        employee.setEmpName("Jane Smith");
        employee.setMobileNo("0987654321");
        employee.setEmail("jane.smith@example.com");
        employee.setDesignation("Senior Software Engineer");

        // Displaying updated employee details
        System.out.println("\nUpdated Employee Details:");
        System.out.println(employee);
    }
}


