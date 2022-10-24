import java.util.*;
public class MethodLecture1 {

    public static void myName(){    //method header
        //method body
        System.out.println("Hi, my name is Lee");
    }//end of myName

    public static int sum(int a, int b){
        int total = 0;

        total = a + b;

        return total;
    }
    
    public static void main(String[] args) throws Exception {
        /*double number = 3;
        double answer = Math.sqrt(number);
        System.out.println("The square root is "+ answer);
        */
        myName();//method call
        myName();
        myName();
        myName();
        myName();

        int a, b;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter two integers");
        a = keyboard.nextInt();
        b = keyboard.nextInt();

        int theSum = sum(a,b);//call - store return in a variable
        System.out.println("The sum is " + theSum);

        keyboard.close();
    }//end of main
}//end of class
