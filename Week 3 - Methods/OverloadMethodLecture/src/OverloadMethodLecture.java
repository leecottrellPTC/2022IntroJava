import javax.security.sasl.Sasl;
import javax.swing.JOptionPane;

public class OverloadMethodLecture {

    /*
     * overload = more than one definition/use in context
     * polymorphism 
     * poly morph
     * 
     * methods with multiple parameter sets
     * 
     * to overload you must write methods with either
     *  different number of parameters
     *  different types of parameters
     *  //cannot differ by return type only
     */
    
     static double salesTax(double saleAmount){
        double tax = 0;
        tax = saleAmount * .06;
        return tax;
     }

     static double salesTax(double saleAmount, double taxRate){
        double tax = 0;
        tax = saleAmount * taxRate;
        return tax;
     }

     static double salesTax(double saleAmount, int taxRate){
        double tax = 0;
        tax = saleAmount * taxRate/100.0;
        return tax;
     }
    
    static double velocity(double height){
        double velo;

        velo = Math.sqrt(2 * 9.8 * height);

        return velo;
    }

    static double force(double mass, double velocity){
        double ouch = 0;

        ouch = .5 * mass * velocity;

        return ouch;
    }


     public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //JOptionPane.showMessageDialog(null, args);

        System.out.println("FIrst call with just 100 " +
            salesTax(100));

       // System.out.println("Second call with 100 and .07 " +
       //     salesTax(100, .07));

       System.out.printf("Second call with %-10.2f and %.2f is %.2f\n",
            100.0, .07, salesTax(100, .07));

        System.out.printf("Third call with %-10.2f and %d is %.2f\n",
            100.0, 7, salesTax(100, 7));
    
    double forceOfImpact = force(100, velocity(30));

    double velo = velocity(30);
    forceOfImpact = force(100, velo);


    }
}
