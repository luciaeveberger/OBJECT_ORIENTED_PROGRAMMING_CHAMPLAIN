package OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.REVIEW;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileManipulation {
    public static void main(String[] args) throws FileNotFoundException {
        // we are creating a new object
        // new -> allocate us new memory for our object
        String path = "C:\\Users\\Lucia\\OneDrive - Champlain Regional College\\SEMESTER_2\\JAVA_2\\CODE\\IN_CLASS_EXAMPLES\\src\\OBJECT_ORIENTED_PROGRAMMING_CHAMPLAIN.REVIEW\\students1.txt";
        File f  = new File(path);
        PrintWriter pw = new PrintWriter(f);
        pw.println("new line");
    }

}
