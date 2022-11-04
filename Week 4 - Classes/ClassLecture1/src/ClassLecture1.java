public class ClassLecture1 {
    public static void main(String[] args) throws Exception {
        Food pizza  = new Food();
        Food cookie = new Food();
        Food beer = new Food("Edmund Fitzgerald", 250, 5);

       // System.out.println(cookie.getName() + " " + cookie.getCalories());
       // System.out.println(beer.getName() + " costs " + beer.getPrice() + 
       //     " cal " + beer.getCalories());
       System.out.println(cookie.toString());
       System.out.println(beer.toString());

        

        pizza.setName("Pepperoni Pizza");
        pizza.setCalories(400);
        pizza.setPrice(20.50);

        System.out.println(pizza.getName() + " costs " + pizza.getPrice());
      
   
        
    }
}
