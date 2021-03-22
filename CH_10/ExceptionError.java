package CH_10;

public class ExceptionError {
    public static void main(String[] args) {

        //int number; => larger scope of these variables and then use them with our conditional logic
        // same idea as with the if statements the -> same scoping is going to be present !
        String str = "10";
        int number = 0;
        try
        {
            // we have defined a local variable which only has the {} scope
            number = Integer.parseInt(str);
            // is only scoped ffrom the curly brakets{it's only life is between these brakets}

        }
       // this a specific error were looking at
        // we catch multiple exceptions -> they will take the form more specific {sub-classed}, to more general
        // a polymorphic reference => being able to take many forms!~
        catch (NumberFormatException e) // remember exceptions are OBJECTS data type {exception} {variable name}
        {
            System.out.println("Bad number format.");
        }
        // this is a specific exception we're looking at !

        catch (Exception e) // ERROR!!!
        {
            System.out.println(str + " is not a number.");

        }


        finally {
            // we tried, we may have failed, we don't know, but execute what's in here regarldess!
            System.out.println("My process is over!");
            System.out.println(number);
            // we don't know about this ! this doesn't exist for us
        }



    }
}
