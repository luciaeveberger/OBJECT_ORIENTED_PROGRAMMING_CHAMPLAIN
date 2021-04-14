package CH_10;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class Unchecked {
    public static void displayFile(String name) {
        // Open the file.
        try {
            File file = new File(name);
            Scanner inputFile = new Scanner(file);
            // Read and display the file's contents.
            while (inputFile.hasNext()) {
                System.out.println(inputFile.nextLine());
            }
            // Close the file.
            inputFile.close();
        }

        catch (FileNotFoundException e){
            System.out.println(e);

        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Why don't u workkk?!!!");
        Unchecked.displayFile("myFile");

    }




}
