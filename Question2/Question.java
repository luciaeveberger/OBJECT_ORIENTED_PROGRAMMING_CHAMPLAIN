package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.Question2;

public class Question {
    /*
    The Question class should have fields for the following data:
 ● A trivia question
● Possible answer #1
● Possible answer #2
● Possible answer #3
● Possible answer #4
● The number of the correct answer (1, 2, 3, or 4)
     */

    public String triviaQuestion;
    public String [] possibleAnswers;
    public int correctAnswer; //map to an index of the array that we need


/*
“What colour is the sky?”
Possible answers:
a)	Blue
b)	Green
c)	Yellow
d)	Unknown
The correct answer: A: 0

 */

    public Question(String inputTriviaQuestion, String [] inputPossibleAnswers, int inputCorrectAnswer){
        this.triviaQuestion = inputTriviaQuestion;
        this.possibleAnswers = inputPossibleAnswers;
        this.correctAnswer = inputCorrectAnswer;
    }



    public String getTriviaQuestion() {
        return triviaQuestion;
    }

    public String [] getPossibleAnswers() {
        for (String s: possibleAnswers){
            System.out.println(s);
        }
      return  possibleAnswers;

    }
    public boolean getCorrectAnswer(int usersAnswer){
        if (usersAnswer == correctAnswer){
            return true;
        }
        return false;
    }



}
