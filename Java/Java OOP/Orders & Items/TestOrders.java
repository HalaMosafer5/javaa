import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        order1.name = mocha;
        order1.total = 22;
        order1.ready = yes;
        
        Order order2 = new Order();
        order2.name = latte;
        order2.total = 14;
        order2.ready = no;

        Order order3 = new Order();
        order3.name = drip coffee;
        order3.total = 18;
        order3.ready = yes;

        Order order4 = new Order();
        order4.name = capuccino;
        order4.total = 23;
        order4.ready = yes;
        
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);

        System.out.printf("Name: %s\n", order2.name);
        System.out.printf("Total: %s\n", order2.total);
        System.out.printf("Ready: %s\n", order2.ready);
    }
}