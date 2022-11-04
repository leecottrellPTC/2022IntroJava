public class Food {

    //private data variables
    private String name;
    private int calories;
    private double price;

    //constructors
    //default
    public Food(){
        //you set the default values
        name = "no name";
        calories = -1;
        price = 0;
    }

    public Food(String Name, int Cal, double Price){
        name = Name;
        this.calories = Cal;
        price = Price;
    }

    public String toString(){
        String output = "";
        output = "Food " + name + " costs $" + price + " calories " + calories;
        return output;
    }

    //public methods
    //methods are the interface to the class
    /*
     * setters - change the value in the private variables
     * getters - return the value in the private variables
     * constructors - called when the class is instantiated
     * default constructor - no parameters, set values to a default state
     * parameterized constructor - set custom values to the variables
     * toString - returns a string for output
     * 
     * methods for functionality
     */

     //setters
     //public void setVarName(type param){}

     public void setName(String theName){
        name = theName;
     }

     public void setCalories(int Cal){
        calories = Cal;
     }

     public void setPrice(double price){
        this.price = price;
     }

     //getters
     //public type getVarName()
     public String getName(){
        return name;
     }
 
     public int getCalories(){
        return calories;
     }

     public double getPrice(){
        return price;
     }
    
}
