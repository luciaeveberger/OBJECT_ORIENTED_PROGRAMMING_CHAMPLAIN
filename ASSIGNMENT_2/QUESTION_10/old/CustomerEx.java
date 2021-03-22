package ASSIGNMENT_2.QUESTION_10.old;

public class CustomerEx extends PersonEx {

    public int customerNumber;
    public boolean isOnMailingList; //hasSignedUpForMAilingList

    // constructor =>
    public CustomerEx(String inputName,
                      String inputAddress,
                      String inputTelephone,
                      int inputCustomerNumber,
                      boolean inputIsOnMailingList){

        super(inputName, inputAddress, inputTelephone);
        this.customerNumber = inputCustomerNumber;
        this.isOnMailingList = inputIsOnMailingList;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setOnMailingList(boolean onMailingList) {
        isOnMailingList = onMailingList;
    }

    public boolean isOnMailingList() {
        return isOnMailingList;
    }

    @Override
    public String toString() {
        return "CustomerEx{" +
                "name=" + getName() +
                " address = " + getAddress() +
                " telephone= " + getTelephoneNumber() +
                " customerNumber= " + customerNumber +
                ", isOnMailingList= " + isOnMailingList +
                '}';
    }
}
