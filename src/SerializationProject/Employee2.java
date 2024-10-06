package SerializationProject;

public class Employee2 {

    private String empName;
    private String mobileNo;
    private String email;
    private String designation;

    // Constructor
    public Employee2(String empName, String mobileNo, String email, String designation) {
        this.empName = empName;
        this.mobileNo = mobileNo;
        this.email = email;
        this.designation = designation;
    }

    // Getter and Setter for empName
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter and Setter for mobileNo
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Getter and Setter for designation
    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", email='" + email + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}

