package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_7.EXERCISES;

public class Scores {
    public static void main(String[] args) {
        // our 2D array => [[0.0, 0.0]
        //                  [0.0, 0.0]]
        double [] [] scores = new double[2][2];

        double [][] prebuiltScores = {{10.0, 12.0},
                                    {3.0, 4.0}};

        String [] [] studentNames = {{"Amir", "Elessia"}, {"Jacob", "Nicholas"}};

        System.out.println(scores[0][0]);
        // row: 0, col: 0
        scores[0][0] = 10.0;
        // what is the row and what is the column?
        scores[0][1] = 12.0;
        System.out.println(scores[0][1]);

    }
}
