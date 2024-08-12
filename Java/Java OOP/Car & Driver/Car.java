public class Car {
    public int gas = 10;

    public void status() {
        System.out.println("Gas remaining: " + gas + "/10");
        if (gas == 0) {
            System.out.println("Game over");
        }
    }
}