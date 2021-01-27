package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.CH_4;

import java.text.DecimalFormat; // Needed for DecimalFormat

/**
 * This program demonstrates the DecimalFormat class.
 */

public class Format2
{
   public static void main(String[] args)
   {
      double number1 = 0.166666666666667,
             number2 = 1.666666666666667,
             number3 = 16.666666666666667,
             number4 = 166.666666666666667;

      // Create a DecimalFormat object.
      DecimalFormat formatter = new DecimalFormat("000.00");

      // Format and display the variables.
      System.out.println(formatter.format(number1));
      System.out.println(formatter.format(number2));
      System.out.println(formatter.format(number3));
      System.out.println(formatter.format(number4));
   }
}
