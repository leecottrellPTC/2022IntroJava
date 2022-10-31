import java.util.Scanner;

public class BMICalc {

    public static double convertInches(double feet, double inches){
        double height = 0;
       // System.out.println("..In convertInches now..");
        height = feet * 12 + inches;

        return height;
    }//end of convertInches

    public static double calcBMI(double height, double weight){
        double BMI = 0;
        double numerator = 703 * weight;
        double denominator = Math.pow(height, 2);
                            //height * height
        BMI =numerator/denominator;
        return BMI;
    }//end of calcBMI

    public static void main(String[] args) throws Exception {
        double BMI, height, feet, inches, weight;
        Scanner keyboard = new Scanner(System.in);
        BMI = 0;
        //input
        System.out.print("Enter your height in feet ");
        feet = keyboard.nextDouble();
        System.out.print("Enter your height in inches ");
        inches = keyboard.nextDouble();
        System.out.print("Enter your weight in pounds ");
        weight = keyboard.nextDouble();
        //processing
        height = convertInches(feet, inches);
        BMI = calcBMI(height, weight);
        //output
        System.out.println(feet + "ft " + inches + "in " + weight + "lbs ");
        System.out.println("Your height in inches = " + height);
        System.out.println("Your BMI is " + BMI);
        
    }//end of main
}
