public class ParkingTicket {
    double hours;
    public String getCarType() {
        return carType;
    }
    public void setCarType(String carType) {
        this.carType = carType;
    }

    double fee;

    String carType="";

    public double getHours() {
        return hours;
    }
    public void setHours(double hours) {
        if(hours < 0 || hours >24){
            hours = 24;//force 24 hours
        }
        this.hours = hours;
        
        calcFee();
    }
    public double getFee() {
        return fee;
    }
    //set fee is read only
    public ParkingTicket() {
    }
    public ParkingTicket(double hours, String car) {
        //this.hours = hours;
        this.setHours(hours);
        carType = car;
        calcFee();

    }


    @Override
    public String toString() {
        return "ParkingTicket [hours=" + hours + ", fee=" + fee + ", carType=" + carType + "]";
    }
    public void calcFee(){
        fee = 0;
        if(hours >=0 && hours <= 3){
            fee = 5;
        }
        else if(hours > 3 && hours <= 9){
            fee = 6 * Math.ceil(hours);
            //ceil handles the +1 for all decimal values
        }
        else if((hours > 9 && hours <= 24)){
            fee = 60;
        }
        else{
            fee = 60;//full price on error
        }//end hours if
        
        if(carType.equalsIgnoreCase("mini")){
            fee -= 2;
        }//end cartype if
    }//end ccalcfee

    
    
}
