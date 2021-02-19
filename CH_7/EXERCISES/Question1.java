package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_7.EXERCISES;

public class Question1 {


    public static int[][] multiplyByAConstant(int [][] inputArray){
        // indicating to us that we will return an 2d array of type integer
        final int CONSTANT = 4;
        for (int row =0; row <2; row++) {
            for (int col = 0; col < 2; col++) {
                inputArray[row][col] = inputArray[row][col] * CONSTANT;
                System.out.println(inputArray[row][col]);
            }
        }
        return inputArray;
    }


    public static void main(String[] args) {

        int [][] tableOfValues = {{2,3}, {5,6}};
        // create an empty array of the same size OR LARGER
        double [][] doubletableOfValues = new double[2][2];
        System.out.println(doubletableOfValues[0][0]);
        // THIS DOES NOT COPY!!!
//        doubletableOfValues = tableOfValues;
      //  multiplyByAConstant(tableOfValues);
        // iterate through the contents of that array -> using a control structure
        for (int row =0; row <2; row++){
            for (int col=0; col<2; col++){
                // storing in a value of double!
                // I AM MOVING TYPES!!!! -> if someone new were to be like what's going on? I can see easily what is going on!
                double value = (double) tableOfValues[row][col];
                doubletableOfValues[row][col] = value;
                System.out.println(doubletableOfValues[row][col]);
            }
        }


    }


}
