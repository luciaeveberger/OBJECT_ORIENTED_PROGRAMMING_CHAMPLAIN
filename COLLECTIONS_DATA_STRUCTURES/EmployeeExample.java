package COLLECTIONS_DATA_STRUCTURES;


/*Problem 1:  Employee and ProductionWorker Classes
Design a class named Employee.
The class should keep the following information in fields:
● Employee name
● Employee number in the format XXX–L, where each X is a digit within the range 0–9
and the L is a letter within the range A–M. String String: {999-A}
● Hire date
Write one or more constructors and the appropriate accessor and mutator methods for the class.
Next, write a class named ProductionWorker that inherits from the Employee class. The
ProductionWorker class should have fields to hold the following information:
● Shift (an integer)
● Hourly pay rate (a double )
The workday is divided into two shifts: day and night. The shift field will be an integer value
representing the shift that the employee works. The day shift is shift 1 and the night shift is
shift 2. Write one or more constructors and the appropriate accessor and mutator methods for
the class. Demonstrate the classes by writing a program that uses a ProductionWorker object.
*/

public class EmployeeExample {
    // name, number & hire date
    public String name;
    public String number;
    public String hireDate; // "10/20/2020"

    //contructor
    public EmployeeExample(String inputName, String inputNumber, String inputHireDate){
        // allowing us to specify an object
        this.name = inputName;
        this.number = inputNumber;
        this.hireDate = inputHireDate;

    }
    // this is an unknwon employee
    public EmployeeExample(){
        this.name = "";
        this.number = "";
        this.hireDate = "";

    }

    public String getName() {
        return name;
    }

    public String getHireDate() {
        return hireDate;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static void main(String[] args) {
        // the constructor is just going let us set up this object
        EmployeeExample Anas = new EmployeeExample("Anas",
                "999-AA",
                "3/25/2021");

        EmployeeExample emptyEmployee = new EmployeeExample();
        System.out.println(emptyEmployee.getHireDate());

    }

}

