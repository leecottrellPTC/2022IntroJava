public class LineItem {

    private static int counter = 0;
    public static final double PA_TAX = .06;

    private String item;
    private double price;
    private double tax;
    public String getItem() {
        return item;
    }
    public double getPrice() {
        return price;
    }
    public double getTax() {
        return tax;
    }

    public LineItem() {
        //default
        counter ++;
    }

    
    public static int getCounter() {
        return counter;
    }
    public static void setCounter(int counter) {
        LineItem.counter = counter;
    }
    public LineItem(String item, double price, double tax) {
        this.item = item;
        this.price = price;
        this.tax = tax;
        counter ++;
        this.tax = price * PA_TAX;
    }
    
    public LineItem(String item, double price) {
        this.item = item;
        this.price = price;
        counter ++;
        this.tax = price * PA_TAX;
    }
    @Override
    public String toString() {
        return "LineItem [item=" + item + ", price=" + price + ", tax=" + tax + "]";
    }
    public static double getPaTax() {
        return PA_TAX;
    }
    public void setItem(String item) {
        this.item = item;
    }
    public void setPrice(double price) {
        this.price = price;
        this.tax = price * PA_TAX;
    }
    public void setTax(double tax) {
        this.tax = tax;
    }

    

    
    
}
