package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.REVIEW;

public class whileLoop {

    public static void main(String[] args) {
        // while loop
        // starting condition
        int i = 5;
        int numberOfParticipants = 1000;


//        // condition we are chekcing
        while (i < numberOfParticipants){
            System.out.println("I will greet you!");
            // our incrementor!!
            i++;
            // this is totally equivilant => i=i+1;

        }
        // starting from 5
        // going up until the number of participants
        // print
        // then incremeent our value!
        // the language and name of the variable -> going to give some insight!
        // isOfDrinkingAge or isHigherIncome, hasNextLine =>
        boolean coldOutside = false;

        if (coldOutside){
            System.out.println("Wear a jacket!");
        }
        else {
            System.out.println("You are fine without!");
        }

        for (int j=5; j<8; j++){
            System.out.println("I will greet you!");
            if (j==7){
                System.out.println("skipping this condition!!!! ");
                continue;
            }

        }
        System.out.println("I am broken! SAD BOIIII ");


//        System.out.println("I will greet you!");
//        System.out.println("I will greet you!");
//        System.out.println("I will greet you!");
//        System.out.println("I will greet you!");
//        System.out.println("I will greet you!");
//        System.out.println("I will greet you!");

        System.out.println("I have met everyone in class");


    }
}
