/**
 *  This program demonstrates polymorphic behavior.
 */

public class Polymorphic
{
   public static void main(String[] args)
   {
      // Create an array of GradedActivity references.
      GradedActivity[] tests = new GradedActivity[3]; // array

      // The first test is a regular exam with a
      // numeric score of 95.
      tests[0] = new GradedActivity();
      tests[0].setScore(95);

      // The second test is a pass/fail test. The
      // student missed 5 out of 20 questions, and the
      // minimum passing grade is 60.
      // add our SUBCLASSES !
      tests[1] = new PassFailExam(20, 5, 60);

      // The third test is the final exam. There were
      // 50 questions and the student missed 7.
      // we are setting the third index of our array to an an object of Final Exam Type {50, 7}
      tests[2] = new FinalExam(50, 7);
      // {GRADED ACTIVITY, PASSFAIL_EXAM, FINAL_EXAM}
      // CHAMPLAIN PEOPLE
      // CHMAPLAIN_PEOPLE = {STUDENTS, TEACHERS, FACILITY}

      // Display the grades.
      for (int index = 0; index < tests.length; index++)
      {
         System.out.println("Test " + (index+ 1) + ": " +
                   "score " + tests[index].getScore() +
                   ", grade " + tests[index].getGrade());
      }
   }
}
