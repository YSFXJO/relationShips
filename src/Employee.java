/*
 * the Father class
 */


public class Employee {

    // instance variables - replace the example below with your own
    private int id;
    private double salary;
    private PersonalInformation personalInfo;
    private Department dept;

    public Employee(int id, double salary,
    String firstName, String middleName,String lastName, String bloodType, String accountNumber, String nationality, int yearOfBirth,Department dept) {
        // TODO Auto-generated constructor stub
        // initialize instance variables
        this.id = id;
        this.salary = salary;
        this.personalInfo =new PersonalInformation(firstName,middleName,lastName,bloodType,accountNumber,nationality,yearOfBirth) ;
        this.dept = dept;
    }
    @Override
    //public
    public String toString() {
        // TODO Auto-generated method stub, calling the method
        return "Employee [id= " + id + ", salary= " + salary + "\n, personalInfo= " + personalInfo +"Dept= " +dept+  "]";
    }
     

    
    
}
