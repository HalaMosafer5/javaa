public class CafeJava {

    
    public static void main(String[] args) {

        // APP VARIABLES

        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        
        // Menu variables (add yours below)
        double mochaPrice = 5.0;
        double dripCoffeePrice = 4.0;
        double lattePrice = 4.0;
        double cappucinoPrice = 3.5;

        // Customer name variables (add yours below)
        String customer1 = "Ahmad";
        String customer2 = "Dana";
        String customer3 = "Sara";
        String customer4 = "Moataz";

        // Order completions (add yours below)
        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;


        // App interaction simulation (Add your code for the challenges below)
        
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        
        //     show her the status message.
        System.out.println(customer1 + pendingMessage);

        //     Check the status of his order and let him know. If it is ready, also tell him his total.
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappucinoPrice);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }
        
        //      Also tell them their order status.
        System.out.println(displayTotalMessage + lattePrice * 2);
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        }
        else {
            System.out.println(customer2 + pendingMessage);
        }


        //     Tell him his new total to make up the difference.
        System.out.println(displayTotalMessage + (lattePrice - dripCoffeePrice));

    }

}