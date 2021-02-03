package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_7;

public class TwoDArrayExample {


    public static void main(String[] args) {

        final int COL = 3;
        final int ROW = 3; // when we are dealing with constants -> by notation these are going be capitized

        final double TAX_RATE = 0.28; // this notation =!!!

        int [] [] threeByThree = new int[ROW][COL];
        threeByThree[0][0]  = 1;

//
//        int[][] numbers = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };

        int[][] numbersOther = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // 2D arrays initiization will look like this

        int[][] numbers = {
                { 1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        int total;

        int [] allSums = new int[3];
        int count = 0;

        for (int row = 0; row < numbers.length; row++)
        {
            total = 0;
            for (int col = 0; col < numbers[row].length; col++) {
                total += numbers[row][col];

            }
            System.out.println(count);
            allSums[count] = total;
            count++;
            System.out.println(count);
        }

        for (int i: allSums){
            System.out.println(i);
        }



    }
}
