package ASSIGNMENTS.ASSINGMENT_2.Question2;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        String example1 = "What colour is the sky?";
        String [] possibleAnswers =  {"1) Blue", "2) green", "3) Yellow", "4 Unknown"};
        int correctAnswer = 1;
        Question [] allQuestions = new Question[1];
        //
        int playerOneScore = 0;
        int playerTwoScore = 0;


        Question demoQuestion = new Question(example1, possibleAnswers, correctAnswer);
        // all this to the array
        allQuestions[0] = demoQuestion;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What are the questions?");

        int whoseTurn = 0;
        for (Question q: allQuestions){


            System.out.println(q.getTriviaQuestion());
            System.out.println(q.getPossibleAnswers());
            System.out.println("What is the answer");
            if (whoseTurn % 2 == 0) {
                System.out.println("Player1 play!");
                int player1Response = keyboard.nextInt();
                if (q.getCorrectAnswer(player1Response)){
                    playerOneScore++;
                }
            }
            else {
                int player2Response = keyboard.nextInt();
                if (q.getCorrectAnswer(player2Response)){
                    playerTwoScore++;
                }
            }

            whoseTurn ++;



            // allows us to access the value scored inside that array

        }
        System.out.println("Score" + playerOneScore);


        //public static void passMyArray(array myArray)
//        public static void passMyArray (int[][] myArray){
//
//        }



    }
}
