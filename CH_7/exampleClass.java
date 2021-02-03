
// our package first
package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_7;
// our dependencies
import java.util.ArrayList;
public class exampleClass {

    public static void main(String[] args){
//        double [] defaultArray = new double [5]; // this will be a null array! null -> an empty value
//        int [] nullArray = null;
//
//        int [] unsureSize;
//
//        // declare later
//        String message = "Hello";
//        System.out.println(message.charAt(0));
//
//        String [] students = {"victor", "chris", "elessia"};
//
//        for (int i = 0; i< students.length; i++){
//            System.out.println(students[i]);
//            System.out.println("the length of each students name " + students[i].length());
//        }

        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("chris");
        nameList.add("clement");
        nameList.add("Nicholas");
        nameList.add("victor");
        nameList.add("angelica");

        System.out.println(nameList.size());

        System.out.println(nameList.get(4));
        System.out.println(nameList);
        nameList.remove(4);



    }

}
