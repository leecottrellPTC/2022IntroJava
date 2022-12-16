import java.net.SocketTimeoutException;
import java.util.Random;
import java.util.Scanner;
//install github repositories extension

public class DiceGame {

    public static int bank = 100;
    public static int bet = 10;
    public static int point = 0;
    public static Random die1 = new Random();
    public static Random die2 = new Random();
    public static int total;

    public static int rollDice() {
        int d1Value = die1.nextInt(6) + 1;
        int d2Value = die2.nextInt(6) + 1;
        total = d1Value + d2Value;
        System.out.printf("%d and %d equals %d\n", d1Value, d2Value, total);
        return total;
    }

    public static void FirstRoll() {
        // int d1Value, d2Value;
        do {
            total = rollDice();
            // total = 2;//cheat for testing

            switch (total) {
                case 2:
                case 3:
                case 12:
                    System.out.println(total + " you lose :(");

                    bank -= bet;
                    System.out.printf("%d in your bank\n", bank);
                    break;
                case 7:
                case 11:
                    System.out.println(total + " you win :)");

                    bank += bet;
                    System.out.printf("%d in your bank\n", bank);
                    break;
                default:

                    point = -total;
                    System.out.println("Point " + point);
                    break;
            }
        } while (point == 0);

    }

    public static void TheGame() {
        do {
            total = rollDice();
            if (total == 7) {
                System.out.println("7 - you lose :(");
                bank -= bet;
                // System.out.printf("%d in your bank\n", bank);
                return;// quit the rolling
            } else if (total == point) {
                System.out.println("POINT - you win!! :)");
                bank += bet;
                // System.out.printf("%d in your bank\n", bank);
                return;// quit the rolling
            } else {
                System.out.println("Keep Rolling");
                try {
                    Thread.sleep(500);// cheesy pause
                } catch (InterruptedException e) {

                }
            }
        } while (point != total);
    }

    public static void main(String[] args) throws Exception {
        String keepPlaying = "yes";
        Scanner keyboard = new Scanner(System.in);
        while (keepPlaying.equalsIgnoreCase("yes")) {
            FirstRoll();
            System.out.println("The point is " + point);
            TheGame();
            System.out.printf("%d in your bank\n", bank);
            System.out.print("Do you want to keep playing? yes/no ");
            keepPlaying = keyboard.nextLine();
        }
        keyboard.close();
        System.out.println("Thank you for playing craps, I hope you won");
        System.out.printf("%d left in your bank\n", bank);
    }
}
