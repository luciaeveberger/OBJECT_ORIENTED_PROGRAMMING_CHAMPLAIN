package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_7;

import java.util.Scanner;

/**
 * This program shows values being read into an array's
 * elements and then displayed.
 */

public class ArrayDemo1
{
   public static void main(String[] args)
   {
      // constant variable number of employees = 3
      final int NUM_EMPLOYEES = 4;  // Number of employees {0,1,2} => the third element doesn't exist!!
      
      // Create an array to hold employee hours.
      int[] hours = new int[NUM_EMPLOYEES];
      
      // Create a Scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter the hours worked by " +
                         NUM_EMPLOYEES + " employees.");

      // Get employee 1's hours.
      System.out.print("Employee 1: ");
      hours[0] = keyboard.nextInt();

      // Get employee 2's hours.
      System.out.print("Employee 2: ");
      hours[1] = keyboard.nextInt();

      // Get employee 3's hours.
      System.out.print("Employee 3: ");
      hours[2] = keyboard.nextInt();

      // Display the values in the array.
      System.out.println("The hours you entered are:");
      System.out.println(hours[0]);
      System.out.println(hours[1]);
      System.out.println(hours[2]);
      System.out.println(hours[3]);

      // when we're interested in iterating over an array -> reading the contents
      // enhanced for loop -> READ ONLY!! {processing a database, processing a collection, just looking at the values!}
//      for (int hour: hours){
//         System.out.println("The employees " + hour);
//      }
      // referencing an index that is not there -> one-off-error!!!
      for (int j=0; j < hours.length; j++){ //[0.1.2.3.4]
         // if want to set all values in the hours array to being 0 => reinitializing this array
         // we are setting the contents of the array!!
         hours[j] = 0; // -> hours[0] = 0, hours[1] => 0, hours[2] => 0
      }

      for (int hour: hours){
         System.out.println("The employees " + hour);
      }



   }
}
