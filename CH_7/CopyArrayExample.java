package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_7;

public class CopyArrayExample {

    public static void main(String[] args) {
        int[] array1 = { 2, 4, 6, 8, 10 };

        // we want to copy this!!
        int [] array2 = array1;
        System.out.println(array2);

        // setting an empty array of size of the array we want
        // 1. create an empty array of the same size
        int [] copiedContents = new int[array1.length];

        // 2. copy the contents
        for (int i = 0; i < array1.length; i++){
            // copying the contents
            copiedContents[i] = array1[i];
        }

        // check if they are actually copied
        for (int value: copiedContents){
            System.out.println(value);
        }





    }
}
