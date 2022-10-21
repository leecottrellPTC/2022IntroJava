import java.util.*;
import javax.swing.*;
public class TriangleMath {
  
    static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //double base, height;
        double base = 5;
        double height = 3;
        double area;
        //input
        //GUI input
        String input;
        input = JOptionPane.showInputDialog(null,
             "Enter the Base");
       // JOptionPane.showInputDialog(null, args)
       base = Double.parseDouble(input);

       input = JOptionPane.showInputDialog(null,
             "Enter the Height");
       // JOptionPane.showInputDialog(null, args)
       height = Double.parseDouble(input);



        //command prompt input
        //System.out.println("Enter the height of the triangle ");
        //height = keyboard.nextDouble();

        //System.out.println("Enter the base of the triangle ");
        //base = keyboard.nextDouble();

        //processing
        //area = 1/2 * base * height;
        //area = .5 * base * height;
        area = 1/(float)2 * base * height;

        //output
        System.out.println("Area is " + area);


    }
}
