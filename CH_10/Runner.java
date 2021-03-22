package CH_10;

public class Runner {
    /*
    Finally, create a Java class (runner).

You should declare an array of type SquareClass. Store two objects on the array and print the contents of the array.



SquareClass s1 = new SquareClass (10, 20.0);

SquareClass s2 = new  SquareClass  (5, 20.0);

// store these on an array and print their contents



     */
    public static void main(String[] args) {
        final int ourSquareArraySize = 2;
        // creating an empty array of size 2
        SquareClass [] squareClassArray = new SquareClass[ourSquareArraySize];

        // populating that array
        squareClassArray[0] = new SquareClass(10, 20.0);
        squareClassArray[1] = new SquareClass(5, 20.0);

        // print the contents of this array
        for (SquareClass s: squareClassArray){
            System.out.println("The conents of our array: AREA " + s.getArea() + " WIDTH " +  s.getWidth());
        }

    }
}
