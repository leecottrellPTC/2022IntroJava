public class App {
    public static void main(String[] args) throws Exception {
        ParkingTicket ticket = new ParkingTicket(-1, "mini");
        //ticket.setHours(-1);
        //ticket.setFee(0);
       // ticket.calcFee();
        System.out.println(ticket.toString());
    }
}
