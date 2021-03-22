package ASSIGNMENT_2.QUESTION_10.old;

public class Main {


    public static void main(String[] args) {

        PersonEx Jacob = new PersonEx("Jacob", "120 address", "800");

        PersonEx genericPerson  = new PersonEx();

        CustomerEx customerExample = new CustomerEx("Jacob",
                "120 address", "800", 120, false);
        System.out.printf("Customer " + customerExample.toString());

    }
}
