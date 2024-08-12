import java.util.ArrayList;

public class Order {
    public String name;
    public boolean ready;
    public ArrayList<Item> items;

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
        this.ready = false;
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
        this.ready = false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public boolean isReady() {
        return ready;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready.";
        } else {
            return "Your order will be ready soon.";
        }
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        double total = 0;
        for (Item item : this.items) {
            System.out.println(item.getName() + " - $" + String.format("%.2f", item.getPrice()));
            total += item.getPrice();
        }
        System.out.println("Total: $" + String.format("%.2f", total));
    }


    public double getOrderTotal() {
        double total = 0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }
}