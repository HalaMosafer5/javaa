import java.util.ArrayList;

public class CafeClass {

    public int getStreakGoal(){
        int sum=0;
        for(int i=0; i<=10; i++){
            sum +=i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double total=0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0;i<=menuItems.size()-1;i++){
            System.out.println(i + " " + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> name){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println( "Hello, " + userName);
        int num=name.size();
        System.out.println("There are"+" "+ num +" "+"people in front of you");
        name.add(userName);

        System.out.println("Customers: " + name);

    }
}