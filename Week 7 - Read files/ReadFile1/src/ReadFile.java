import java.util.Scanner;
import java.io.*;

public class ReadFile {

    /*
     * working with files
     * 1. open the file
     * 2. verify file opened - if not, either fix or kill the program
     * 3. read the contents of the file, one line at a time with while loop
     * 4. do something with the contents of the file
     * 5. close the file
     */

    public static void readPoetry() {
        String aLine;
        try {
            File frost = new File("c:\\data\\frost.txt");

            Scanner frostRead = new Scanner(frost);
            // all logic here
            while (frostRead.hasNextLine()) {
                // logic for each line
                aLine = frostRead.nextLine();
                System.out.println(aLine);
            }

            frostRead.close();
        } catch (FileNotFoundException fex) {
            System.out.println(fex.toString());
            System.exit(-1);
        }

    }

    public static void stats(){
        String aLine;
        try {
            File numbers = new File("c:\\data\\randnumbers.csv");

            Scanner data = new Scanner(numbers);
            // all logic here
            while (data.hasNextLine()) {
                // logic for each line
                aLine = data.nextLine();
                System.out.println(aLine);
            }
            data.close();
        } catch (FileNotFoundException fex) {
            System.out.println(fex.toString());
            System.exit(-1);
        }
    }
    public static void main(String[] args) throws Exception {
        // readPoetry();
        stats();
    }
}
