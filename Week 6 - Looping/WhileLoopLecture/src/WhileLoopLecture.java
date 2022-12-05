import java.util.Scanner;
import java.util.Random;

public class WhileLoopLecture
 {
    public static Scanner keyboard = new Scanner(System.in);
    public static int verifyInput(){
        int input = 0;
        do{
            System.out.println("Please enter a positive number");
            input = keyboard.nextInt();
        }while(input <= 0);
        return input;
    }

    public static void menu(){
        /*1, 2, 3 are valid menu choices, 9 is exit */
        int choice = 0;
        String yourOrder = "";
        while(choice != 9){
            System.out.println("Welcome to Wendys");
            System.out.println("1 for Single with cheese");
            System.out.println("2 for Double with cheese");
            System.out.println("3 for Chicken Sandwich");
            System.out.println("4 for Salad");
            System.out.println("9 to exit");
            choice = keyboard.nextInt();
            switch(choice){
                case 1:
                    yourOrder += "Single with cheese\n";
                    break;
                case 2:
                    yourOrder += "Double with cheese\n";
                    break;
                case 3:
                    yourOrder += "Chicken Sandwich\n";
                    break;
                case 4:
                    yourOrder += "Salad\n";
                    break;
                case 9:
                    System.out.println("Thank you for ordering");
                    System.out.println(yourOrder);
                    break;
                default:
                    System.out.println(choice + " is not on the menu");
                    break;
            }
        }
    }
    
    public static void breakEven(){
        double maintenance = 15;
        double cost = 1000;
        double savings = 100;
        double profit = -cost;
        int count = 0;
        Random rnd = new Random();

        while(profit < 0){
            savings = rnd.nextDouble(50, 150);
            System.out.println(count + " month we saved " + savings);
            profit += savings - maintenance;
            count ++;
        }//end while
        System.out.printf("After %d months, we make %.2f dollars\n", count, profit);
    }
    public static void main(String[] args) throws Exception {
        //verifyInput();
      //  menu();
      breakEven();
    }
}
