package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_7.EXERCISES;

public class CopiedArray {

    public static void main(String[] args) {
        // we have defined an array of all students
        String [] allStudents = {"Karl", "George", "Alex", "Victor"};
        System.out.println(allStudents.length);

        // copy this into another array -> this is creating an empty array of us to use
        String [] copiedArray = new String[allStudents.length]; // ''
        String [][] copiedAllStudents = new String[allStudents.length][allStudents.length];//3 row * 3 columns

        int count = 0;
        for (int i = 0; i< allStudents.length; i++){
           // System.out.println(allStudents[i]);
            copiedArray[i] = allStudents[i];


        }
        // read only iterating
        for (String studentName:copiedArray ){
            System.out.println(studentName);
        }
    }

}
