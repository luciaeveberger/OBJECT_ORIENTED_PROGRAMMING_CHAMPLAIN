package CH_10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Unchecked {
    public static void displayFile(String name) throws FileNotFoundException {
        // Open the file.
        File file = new File(name);
        Scanner inputFile = new Scanner(file);
        // Read and display the file's contents.
        while (inputFile.hasNext())
        {
            System.out.println(inputFile.nextLine());
        }
        // Close the file.
        inputFile.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Why don't u workkk?!!!");
        Unchecked.displayFile("myFile");


    }




}
