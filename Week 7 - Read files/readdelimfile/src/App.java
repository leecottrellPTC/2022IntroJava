import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    private static Record recordList[] = new Record[9];
    private static int fillList(){
        int recordsRead = 0;
        File file = new File("C:\\Users\\lee_c\\source\\!JustPLaying\\readdelimfile\\records.csv");
        Scanner fileIn;
        

        try {
            fileIn = new Scanner(file);

            while (fileIn.hasNextLine()) {
                String data = fileIn.nextLine();
                //System.out.println(data);
                
                String[] records = data.split(",");//split on the comma
                //fill the array
                recordList[recordsRead] = new Record(records[0],records[1],Integer.parseInt(records[2]));
                
                recordsRead ++;
              }

              fileIn.close();
        } catch (FileNotFoundException e) {
            
            System.exit(-1);
        }
        
          



        return recordsRead;
    }

    private static void showRecords(){
        for(int r=0; r < recordList.length; r++){
            System.out.println(recordList[r].toString());
        }
    }
    private static void findYear(int year){
        for(int r=0; r < recordList.length; r++){
            if(recordList[r].getYear() == 1977){
                System.out.println(recordList[r].toString());
            }
        }
    }

    public static void main(String[] args) throws Exception {
        fillList();
        //showRecords();
        findYear(1977);
    }
}
