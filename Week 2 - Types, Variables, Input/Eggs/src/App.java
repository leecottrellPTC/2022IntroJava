public class App {
    public static void main(String[] args) throws Exception {
        int eggs = 50;
        //convert eggs into dozens and left over
        int dozens = eggs / 12;
        int leftover = eggs % 12;//remainder 0 -11

        System.out.println(eggs + " eggs in the basket");
        System.out.println(dozens + " dozens");
        System.out.println(leftover + " eggs left in basket");

    }
}
