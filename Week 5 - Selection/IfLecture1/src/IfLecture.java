public class IfLecture {

    public double calcInsuranceRate(int age, String genderAtBirth) {
        double cost = 0;

        if (genderAtBirth.equalsIgnoreCase("male")) {
            if (age >= 16 && age < 25) {
                cost = 200;
            } else if (age >= 25 && age < 40) {
                cost = 150;
            } else if (age >= 40 && age < 55) {
                cost = 130;
            } else if (age >= 55) {
                cost = 145;
            } else {
                // error
                cost = -1;
            }//end of male if age

        } else if (genderAtBirth.equalsIgnoreCase("female")) {
            if (age >= 16 && age < 20) {
                cost = 200;
            } else if (age >= 20 && age < 35) {
                cost = 150;
            } else if (age >= 35 && age < 50) {
                cost = 130;
            } else if (age >= 50) {
                cost = 145;
            } else {
                // error
                cost = -1;
            }//end of female if age
        }//end of male-female if
        return cost;
    }//end of function calcCost

    public static void main(String[] args) throws Exception {
        System.out.println("Moes Bar");
        int age = 17;

        // if-elseif ladder
        // series of related tests
        // series of different conditions

        if (age >= 21) {
            System.out.println("Have a beer");
        } else if (age >= 18 && age < 21) {
            System.out.println("Have a pop");
        } else if (age >= 6 && age < 18) {
            System.out.println("Have some juice");
        } else if (age >= 0 && age < 6) {
            System.out.println("Have some water");
        } else {
            System.out.println("Age is wrong, get out");
        }

        /*
         * if(age >= 21){
         * System.out.println("Have a beer");
         * }
         * else{
         * System.out.println("Have a Pepsi");
         * }
         */

    }
}
