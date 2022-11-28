import java.util.*;

public class SwitchLecture {
    public static String hexValue(String color) {
        String hex = "";

        switch (color.toLowerCase()) {
            case "red":
                hex = "#FF0000";
                break;
            case "green":
                hex = "#00FF00";
                break;
            case "blue":
                hex = "#0000FF";
                break;
            default:
                hex = "#------";
                break;
        }// end of switch color

        // if(color.equalsIgnoreCase("RED"))
        /*
         * if(color.equals("red")){
         * hex = "#FF0000";
         * }
         * else if(color.equals("green")){
         * hex = "#00FF00";
         * }
         */

        return hex;
    }

    public static Month buildMonth(int monthNum) {
        Month theMonth = new Month();
        switch (monthNum) {
            case 1:
                theMonth.setNum(monthNum);
                theMonth.setDays(31);
                theMonth.setName("January");
                break;
            case 2:
                theMonth.setNum(monthNum);
                theMonth.setDays(28);
                theMonth.setName("February");
                break;
            case 3:
                theMonth.setNum(monthNum);
                theMonth.setDays(31);
                theMonth.setName("March");
                break;
            case 4:
                theMonth.setNum(monthNum);
                theMonth.setDays(30);
                theMonth.setName("April");
                break;
            case 5:
                theMonth.setNum(monthNum);
                theMonth.setDays(31);
                theMonth.setName("May");
                break;
            case 6:
                theMonth.setNum(monthNum);
                theMonth.setDays(30);
                theMonth.setName("June");
                break;
            case 7:
                theMonth.setNum(monthNum);
                theMonth.setDays(31);
                theMonth.setName("July");
                break;
            case 8:
                theMonth.setNum(monthNum);
                theMonth.setDays(31);
                theMonth.setName("August");
                break;
            case 9:
                theMonth.setNum(monthNum);
                theMonth.setDays(30);
                theMonth.setName("September");
                break;
            case 10:
                theMonth.setNum(monthNum);
                theMonth.setDays(31);
                theMonth.setName("October");
                break;
            case 11:
                theMonth.setNum(monthNum);
                theMonth.setDays(30);
                theMonth.setName("November");
                break;
            case 12:
                theMonth.setNum(monthNum);
                theMonth.setDays(31);
                theMonth.setName("December");
                break;
            default:
                theMonth.setNum(monthNum);
                theMonth.setDays(0);
                theMonth.setName("Error");
                break;
        }// end switch month num

        return theMonth;
    }

    public static void main(String[] args) throws Exception {
        Month theMonth = new Month();
        String hexColor = hexValue("RED");
        System.out.println("is " + hexColor);

        // int monthNum= (int) (Math.random()*6 + 1);
        Random rnd = new Random();

        int monthNum;
        for (int x = 1; x <= 100; x++) {
            monthNum = rnd.nextInt(12) + 1;
            theMonth = buildMonth(monthNum);
            System.out.println(theMonth.toString());
        }
    }
}
