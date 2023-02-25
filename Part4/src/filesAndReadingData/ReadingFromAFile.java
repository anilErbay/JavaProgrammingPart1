package filesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class ReadingFromAFile {
    public static void main(String[] args) {
        /*
        Reading a file is done using the Scanner-class. When we want to read a file using the Scanner-class, we give the path for the file we want to read as a parameter to the constructor of the class. The path to the file can be acquired using Java's Paths.get command, which is given the file's name in string format as a parameter: Paths.get("filename.extension").

        When the Scanner-object that reads the file has been created, the file can be read using a while-loop. The reading proceeds until all the lines of the file have
        been read, i.e., until the scanner finds no more lines to read. Reading a file may result in an error, and it's for this reason that the process requires
        separate blocks - one for the try, and another to catch potential errors. We'll be returning to the topic of error handling later.
         */

        try (Scanner scanner = new Scanner(Paths.get("filesAndReadingData/file.txt"))) {

            // we read the file untill all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
