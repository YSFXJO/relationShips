
// the below code fragment can be found in:
// the relationship associated with compsonation(has a relationship)

public class PersonalInformation{
    // instance variables

    private String firsrName,middleName,lastName,bloodType,accountNumber, nationality;
    private int yearOfBirth;

    public PersonalInformation(){
        //empty constructor
        
    }
    public PersonalInformation(String firstName, String middleName, String lastName, String bloodType, String accountNumber, String nationality, int yearOfBirth){
        // constractor method
        
        this.firsrName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.bloodType = bloodType;
        this.accountNumber = accountNumber;
        this.nationality = nationality;
        this.yearOfBirth = yearOfBirth;
    }
    @Override
    public String toString() {
        return "PersonalInformation{" +
                "firstName=' " + firsrName + '\'' +
                ", middleName=' " + middleName + '\'' +
                ", lastName=' " + lastName + '\'' +
                ", bloodType=' " + bloodType + '\'' +
                ", accountNumber=' " + accountNumber + '\'' +
                ", nationality=' " + nationality + '\'' +
                ", yearOfBirth= "  + yearOfBirth +
                '}';
    }
}