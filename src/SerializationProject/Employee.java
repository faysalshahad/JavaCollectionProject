package SerializationProject;

import java.io.Serializable;

public class Employee implements Serializable {

    private String employee, email, mobileNo, designation;

    

public Employee() {
    }



public Employee(String employee, String email, String mobileNo, String designation) {
        this.employee = employee;
        this.email = email;
        this.mobileNo = mobileNo;
        this.designation = designation;
    }

    



public String getEmployee() {
    return employee;
}



public void setEmployee(String employee) {
    this.employee = employee;
}



public String getEmail() {
    return email;
}



public void setEmail(String email) {
    this.email = email;
}



public String getMobileNo() {
    return mobileNo;
}



public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
}



public String getDesignation() {
    return designation;
}



public void setDesignation(String designation) {
    this.designation = designation;
}



public void display () {
    System.out.println("Name: " + this.employee + " Mobile no :" + this.mobileNo + " Email : " + this.email + " Designation: " + this.designation);
}
    
}
