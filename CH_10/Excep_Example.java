package CH_10;

import java.io.FileNotFoundException;
import java.lang.reflect.MalformedParameterizedTypeException;

public class Excep_Example {

    public static void main(String[] args) {
        String input = "1";

        int ourInputAsAnInteger;
        try {
            // our plan A -> everything works!
            // we're saying => this is plan A!
            System.out.println("Here");
            double sum = 10.0 + 20.0;

            ourInputAsAnInteger = Integer.parseInt(input);

        }
        catch (NumberFormatException e){
            // our plan b
            // timestamp => log message -> actual error time.now -> log to a file -> write what type of exception
            System.out.println("This exception is thrown: ");
            System.out.println(e);
        }
        finally {
            System.out.println("finished up! ");
        }


    }
    // build them into the method header => showing that we are expecting an error
    public void readFile() throws Exception, FileNotFoundException, NumberFormatException, MalformedParameterizedTypeException {
    // my user or my file might be kind of crazy! -> will check for these exceptions!
    }


}
