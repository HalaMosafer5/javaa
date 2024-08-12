public class Test {
    public static void main(String[] args) {
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Razan");
        Order order4 = new Order("Ahmad");
        Order order5 = new Order("Jumana");

        Item item1 = new Item("Drip Coffee", 1.50);
        Item item2 = new Item("Cappuccino", 3.50);
        Item item3 = new Item("Latte", 4.00);
        Item item4 = new Item("Espresso", 2.50);
        Item item5 = new Item("Mocha", 4.50);

        order1.addItem(item1);
        order1.addItem(item2);

        order2.addItem(item3);
        order2.addItem(item4);

        order3.addItem(item2);
        order3.addItem(item5);

        order4.addItem(item1);
        order4.addItem(item3);

        order5.addItem(item4);
        order5.addItem(item5);

        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        order1.setReady(true);
        order2.setReady(false);
        order3.setReady(true);
        order4.setReady(false);
        order5.setReady(true);

        System.out.println(order1.getStatusMessage());
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());
    }
}