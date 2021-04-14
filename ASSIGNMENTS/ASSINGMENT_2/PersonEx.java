package ASSIGNMENTS.ASSINGMENT_2;

/*
Design a class named Person with fields for holding a person’s name, address, and telephone number.
Write one or more constructors and the appropriate mutator and accessor methods for the class’s fields.
Next, design a class named Customer, which inherits from the Person class.
The Customer class should have a field for a customer number and
a boolean field indicating whether the customer wishes to be on a mailing list.
Write one or more constructors and the appropriate mutator and accessor methods for the class’s fields.
Demonstrate an object of the Customer class in a simple program. */



public class PersonEx {
    // these are the data attributes which represent our person
    public String name;
    public String address;
    public String telephoneNumber;

    public PersonEx(){
        this.name = "Default";
        this.address = "Default";
        this.telephoneNumber = "Default";
    }
    public PersonEx(String justName){
        this.name = justName;
    }


    public PersonEx(String inputName, String inputAddress, String inputTelephoneNumber){
// allowing us to setup our person
        this.name = inputName;
        this.address = inputAddress;
        this.telephoneNumber = inputTelephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

}