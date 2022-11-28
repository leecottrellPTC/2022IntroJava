import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class App {
    public static JLabel ageLabel= new JLabel("How old are you?");
    public static JTextField ageField = new JTextField("", 5);
    public static JFrame frame = new JFrame();
    public static JLabel lblDrink = new JLabel("No drink ordered");
    public static JButton orderButton = new JButton("Order a drink");
    public static void main(String[] args) throws Exception {
        frame.setSize(200,300);
        frame.setTitle("Moes Bar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.add(ageLabel);
        frame.add(ageField);

        orderButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                theButton(e);
            }
        });

        frame.add(orderButton);
        frame.add(lblDrink);

        frame.setVisible(true);

    }//end of main
    public static void theButton(ActionEvent e){
        //JOptionPane.showMessageDialog(null, "It works");
        /*
        get items from the screen - strip from the screen
        validate the data from the screen
        do something with the data
        create output and put onto the form
         */
        int age = 0;
        try{
            age = Integer.parseInt(ageField.getText());
        }
        catch (NumberFormatException nex){
            //handle the error
            age = 0;
        }
        if(age >= 21){
            lblDrink.setText("Have an alcoholic beverage");
        }
        else if(age >=10 && age < 21){
            lblDrink.setText("Have some pop");
        }
        else if(age >0 && age < 10){
            lblDrink.setText("Have some milk");
        }
        else{
            lblDrink.setText("No drink for you:(");
        }

    }
}
