class Driver extends Car {

    public void drive() {
        if (gas > 0) {
            gas -= 1;
            System.out.println("You drive the car.");
            status();
        } else {
            System.out.println("Not enough gas to drive.");
            status();
        }
    }

    public void boost() {
        if (gas >= 3) {
            gas -= 3;
            System.out.println("You use boosters.");
            status();
        } else {
            System.out.println("Not enough gas to use boosters.");
            status();
        }
    }

    public void refuel() {
        if (gas <= 8) {
            gas += 2;
            System.out.println("You refuel the car.");
            status();
        } else {
            System.out.println("Gas tank is too full to refuel.");
            status();
        }
    }
}