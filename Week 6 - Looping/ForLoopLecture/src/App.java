//import java.util.concurrent.CountDownLatch;

public class App {

    public static void countingLoop(int ending){
        int total = 0;//accumulator variable
        //    start     end    change
        int x;
        for(x=1; x <= ending; x++ )
        {
            System.out.println(x);
            total += x;
        }
        System.out.println("Total is " + total);
    }

    public static String buildLine(int length){
        String line = "";
        for(int x=1; x <= length; x++){
            line += "-";
        }
        return line;
    }

    public static void countdown(){
        for(int x=999; x >= 0; x--){
            System.out.printf("%4d", x);
            if(x % 10 == 0){
                System.out.println();
            }

        }
    }

    public static void printTimesTable(){
        final int NUM = 5;
        int product = 1;
        for(int row = 1; row <= NUM; row++){
            for(int col=1; col <= NUM; col++){
                //execute 25 times NUM * NUM
                product = row * col;
                System.out.printf("%4d", product);
            }//end col
            System.out.println();
        }//end row
    }
    public static void main(String[] args) throws Exception {
        //countingLoop(250);
        printTimesTable();
       /*  countdown();
        System.out.println(buildLine(10));
        System.out.println(buildLine(20));
        System.out.println(buildLine(30));
        System.out.println(buildLine(40));
        System.out.println(buildLine(30));
        System.out.println(buildLine(20));
        System.out.println(buildLine(10));
        int total = 1 + 2 + 3 + 4 + 5 + 6 + 7;
        */
    }
}
