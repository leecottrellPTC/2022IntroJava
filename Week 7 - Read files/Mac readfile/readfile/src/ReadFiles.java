import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ReadFiles {
    static String aLine;

    public static void stats() {
        ArrayList<Integer> StatSheet = new ArrayList<>();

        try {

            File numbers = new File("./data/randnumbers.csv");
            Scanner frostRead = new Scanner(numbers);
            
            while (frostRead.hasNextLine()){
                StatSheet.add(frostRead.nextInt());
            }
            StatSheet.sort(Comparator.naturalOrder());
            System.out.println(StatSheet);
            frostRead.close();
        } catch (FileNotFoundException fex){
            System.out.println(fex.toString());
            System.exit(-1 );
        }
        

    }


    public static void poetryRead() {

        try {
            
           // File frost = new File("~/Desktop/JAVA/JAVA LECTURE/reafile/data/frost.txt");
            File frost = new File("./data/frost.txt");
            Scanner frostRead = new Scanner(frost);
            
            while (frostRead.hasNextLine()){
                aLine = frostRead.nextLine();
                System.out.println(aLine);

            }
            frostRead.close();
        } catch (FileNotFoundException fex){
            System.out.println(fex.toString());
            System.exit(-1 );
        }
        

    }

    public static void main(String[] args) throws Exception {
        //poetryRead();
        stats();
    }

    @Override
    public String toString() {
        return "ReadFiles []";
    }
}
