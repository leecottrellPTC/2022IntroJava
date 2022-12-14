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
        int aNum = 0;
        int total = 0;
        int min = 1999, max = -1099;
        int counter = 0;
        double avg = 0.0;
        try {
            File numbers = new File("c:\\data\\randnumbers.csv");

            Scanner data = new Scanner(numbers);
            // all logic here
            while (data.hasNextLine()) {
                // logic for each line
                //aLine = data.nextLine();
                //System.out.println(aLine);
            do{
                try{
                    aNum = data.nextInt();
                    //System.out.println(aNum);    
                }
                catch(Exception ex){
                    aNum = 0;//skip and set to 0
                    data.nextLine();//just skip this line
                    //counter --;//fix the count
                }
            }while(aNum == 0);
            //the do while loop keeps looping when there is a problem in the file
            
            
                //System.out.println(aNum);
                total += aNum;
                counter++;

                if(aNum < min){
                    min = aNum;
                    //set current value to min
                }
                if(aNum > max){
                    max = aNum;
                }


            }
            data.close();
            avg = total / (double)counter;
            System.out.println("Total = " + total);
            System.out.println("Count = " + counter);
            System.out.printf("Average = %.2f\n", avg);
            System.out.println("Smallest is " + min);
            System.out.println("Max is is " + max);

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
