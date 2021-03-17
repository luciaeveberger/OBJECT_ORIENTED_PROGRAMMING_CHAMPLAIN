package CH_7;

import javax.crypto.spec.PSource;

public class ReviewClass {

    public static void main(String[] args) {
        int [] ourArray = {10, 20, 30, 40, 50};
        System.out.println(ourArray.length);

        // if we are interested in the contents of this array => we can use a for loop
        // traverse the conetns of the array
    // going up to 5 {which is the size of this array, we're saying go up to 6}

        System.out.println(ourArray[0]);
        System.out.println();
        System.out.println(ourArray[2]);
        System.out.println(ourArray[1000]);

        for (int i = 0; i< ourArray.length; i++){
            System.out.println("our array at " +  i + " is this value " + ourArray[i]);

        }
        // {where we're starting, where we end, and how we are iterating!}
        for(int j = ourArray.length; j > 0; j--){
            System.out.println("our array in the reverse order if we want to! ");
        }



    }
}
