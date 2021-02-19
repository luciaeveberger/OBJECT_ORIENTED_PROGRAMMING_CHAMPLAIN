package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.REVIEW;

import java.util.Arrays;

public class copyArray {
    public static void main(String[] args) {
        int [] demoArray = {1,2,3};

        // you guys create an array of this size
        int [] copyBody = new int[demoArray.length];

        final double FINAL_TAX_RATE = 10.0;
        for (int i =0; i< copyBody.length; i++){
            copyBody[i] = demoArray[i];
        }
        // this is also acceptabe
        copyBody = Arrays.copyOf(demoArray, 3);

    }
}
