import java.util.Scanner;
import javax.swing.*;

public class JavaInput {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);
        String name, color;
        int age, favNumber;
        double salary;

        //input using Scanner
        System.out.print("what is your name? ");
        name = keyboard.nextLine();//get to the new line
        System.out.print(name + " how old are you? ");
        age = keyboard.nextInt();
        System.out.print(name + " how much do you make? ");
        salary = keyboard.nextDouble();
        System.out.printf("%s is %d years old and makes $%.2f\n",name, age, salary);
        
        //input using JOPtionPane
        color = JOptionPane.showInputDialog(null, 
        "What is your favorite color?", 
        "Data Input",
        JOptionPane.QUESTION_MESSAGE);

        //cannot directly input into int from JOptionPane
        //must input into a string and convert
        String input;
        input = JOptionPane.showInputDialog(null, 
            "What is your favorite number?", 
            "Data Input",
            JOptionPane.QUESTION_MESSAGE);

        //have to convert from string to integer 
        favNumber = Integer.parseInt(input);
        //Double.parseDouble(input);
        JOptionPane.showMessageDialog(null, 
            name + " likes " + color + " and " + favNumber, 
            "Favorites", 
            JOptionPane.INFORMATION_MESSAGE);

        
    }
}
