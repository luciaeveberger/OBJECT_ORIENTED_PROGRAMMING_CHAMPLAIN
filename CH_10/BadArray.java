package CH_10;

/**
 *  This program causes an error and crashes. 
 */

public class BadArray
{
   // our main method here
   public static void main(String[] args)
   {
      // Create an array with three elements.
      int[] numbers = { 1, 2, 3 };

      // Attempt to read beyond the bounds
      // of the array. => ok maybe.. but it's going to have a faulty logical point
      for (int index = 0; index <= numbers.length; index++)
         System.out.println(numbers[index]);
      // our code crashes!!
      // if I have logic after here -- i will never get ther !

      System.out.println("Whats actually going on?");
      int [] goodArrayProcess = {10,20,30};
      for(int j=0; j<goodArrayProcess.length; j++){
         System.out.println(goodArrayProcess[j]);
      }

   }

}
