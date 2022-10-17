import java.util.*; //need for scanner
public class PayrollLecture {
    public static void main(String[] args) throws Exception {
        int hours = 20;
        double wage = 15.00;
        double salary;
        Scanner keyboard = new Scanner(System.in);
        //input
        System.out.print("How many hours did you work? ");
        hours = keyboard.nextInt();
        System.out.print("How much do you earn per hour? ");
        wage = keyboard.nextDouble();


        salary = wage * hours;
        System.out.println("Hours " + hours + 
        " wage " + wage +
        "= $" +salary);
        keyboard.close();
    }//end of main
}
