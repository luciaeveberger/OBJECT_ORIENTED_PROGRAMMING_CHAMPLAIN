package CH_10;

/**
 *  This program demonstrates how the Integer.parseInt
 *  method throws an exception.   
 */

public class ParseIntError
{
   public static void main(String[] args)
   {
      String str = "ajakdjfkaj"; // -> an integer {abcd=-> integer}
      int number = 10;
    //  number = Integer.parseInt(str);

      try
      {
         // Try to convert str to an int.
         number = Integer.parseInt(str);
      }
      // always use the more general class as polymorphic reference!
      catch (Exception e)
      //catch (NumberFormatException e)
      {
         System.out.println("Conversion error: " +
                            e.getMessage());
      }
      // executed no matter what => the last thing that tells us what happened
      finally {
         System.out.println("We made it through! Wow that was soooo boringgggg!!!");
         System.out.println("My code was successful! ");
      }
   }
}