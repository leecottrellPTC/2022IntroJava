import javax.swing.JOptionPane;

public class App {

    static double salesTax(double saleAmount){
        double tax = 0;
        tax= saleAmount * .06;
        return tax;
    }

    static double salesTax(double saleAmount, double taxRate){
        double tax = 0;
        tax= saleAmount * taxRate;
        return tax;
    }

    static double salesTax(double saleAmount, int taxRate){
        double tax = 0;
        tax= saleAmount * taxRate/100.0;
        return tax;
    }

    static double salesTax(double saleAmount, double taxRate, double taxExempt){
        double tax = 0;
        tax= (saleAmount - taxExempt) * taxRate;
        return tax;
    }

    //calcualte velocity of falling object when it hits the floor
    //v = sqrt(2*g*h)
    //force = 1/2 * m * v^2

    //overload velocity
    //gravity on earth = 9.8m/s2
    /*gravity on Mercury = 3.77
     * Moon = 1.62
     * Venus = 8.87
     * Mars = 3.71
     * Saturn = 10.44 
     * 
     */

     static double velocity(double height){
        return Math.sqrt(2 * 9.8 * height);
     }

     static double velocity(double height, double gravity){
        return Math.sqrt(2 * gravity * height);
     }

     static double forceHit(double mass, double velocity){
        double force = 0;

        force = .5 * mass * velocity;

        return force;

     }


    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        JOptionPane.showMessageDialog(null, args, null, 0);          

        
        salesTax(100);
        salesTax(100, .07);
        int tax = 7;
        salesTax(100, tax);
        salesTax(100, .7, 10);


        forceHit(100, velocity(200));//function call in function call
        forceHit(100, velocity(200, 1.62));//function call in function call
    }
}
