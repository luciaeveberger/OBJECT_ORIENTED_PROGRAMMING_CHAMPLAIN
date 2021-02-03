package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_7;

public class TwoDArrayMoreExamples {
    public static void main(String[] args) {

        int [][] tableOfValues = {{2,3}, {5,6}};

        for (int row =0; row <2; row++){
            for (int col=0; col<2; col++){
                System.out.println(tableOfValues[row][col]);
            }
        }


    }
}
