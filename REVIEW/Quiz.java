package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.REVIEW;

public class Quiz {
    public static void main(String[] args) {

        String[] str = {"abc", "def", "ghi", "jkl"};
        System.out.println(str[2]);
        int[][] scores = { {88, 80, 79, 92},
                {75, 84, 93, 80},
                {98, 95, 92, 94},
                {91, 84, 88, 96}
        };

        System.out.println(scores[2][3]);

        int[] numbers = {40, 3, 5, 7, 8, 12, 10};
        int value = numbers[0];
        for (int i = 1; i < numbers.length; i++)
        {
            if (numbers[i] < value){
                value = numbers[i];
            }
        }
        System.out.println(value);



    }
}
