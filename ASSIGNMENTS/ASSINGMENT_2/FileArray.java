package ASSIGNMENTS.ASSINGMENT_2;

import java.io.*;
import java.io.FileWriter;
import java.io.PrintWriter;

/* Design a class that has a static method
 named writeArray. The method should take two arguments:
 the name of a file and a reference to an int array.
 The file should be opened as a file,
 the contents of the array should be written to the file,
 and then the file should be closed.

 Write a second method in the class named readArray.
 The method should take two arguments:
 the name of a file and a reference to an int array.
 The file should be opened, data should be read from the file and stored
 in the array, and then the file should be closed.
 Demonstrate both methods in a program.
 */
public class FileArray {

    public static void writeArray(String filename, int [] referenceArray){
        try{
            //open our files
            PrintWriter outputFile =
                    new PrintWriter(new FileWriter(filename));

            for (int i=0;i<referenceArray.length;i++){
                //print and println {contents + \n} {contents + \n}
                outputFile.println(referenceArray[i]);

            }
            // closing the stream and knowing it's done!
            outputFile.close();
        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        // i don't care if we were successful or if we failed => we're still going to do this stuff!!
        // finally we'll do something => always going to do this!
        finally {
            System.out.println("Your script has finnihed!");
        }


    }
    public static void readArray(String filename, int [] referenceArray){
        try{
            FileReader reader = new FileReader(filename);
            BufferedReader inputFile = new BufferedReader(reader);
            String input;
            int [] ourArray = new int[referenceArray.length];

            // Read and display the file's contents.
            input = inputFile.readLine();
            int j = 0;
            while (input != null)
            {
                System.out.println(input);
                input = inputFile.readLine();
                try {
                    ourArray[j] = Integer.parseInt(input);

                }
                catch(NumberFormatException e){
                    System.out.println(e);
                }
                j++;

            }
            for (int a : ourArray){
                System.out.println(a);
            }

            // Close the file.
            inputFile.close();

        }
        catch (IOException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            System.out.println("reading finally! ");
        }

    }

    public static void main(String[] args) {

        int [] myArray = {1,4,10};
        String newFileName = "ASSIGNMENTS/ASSINGMENT_2/new_file.txt";

        FileArray.writeArray(newFileName, myArray);
        FileArray.readArray(newFileName, myArray);
    }
}
