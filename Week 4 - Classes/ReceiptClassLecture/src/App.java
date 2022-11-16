import javax.sound.sampled.Line;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        LineItem item1 = new LineItem("Milk", 4.5);
        LineItem item2 = new LineItem("cookies", 3);
        LineItem item3 = new LineItem();

       // System.out.println("Created items " + item1.getCounter());

       System.out.println(item1.toString());
       System.out.println(item2.toString());

       item1.setPrice(500);
       System.out.println(item1.toString());
        
        
       // JOptionPane.showMessageDialog(null, "Hi", "Title", JOptionPane.QUESTION_MESSAGE);
    }
}
