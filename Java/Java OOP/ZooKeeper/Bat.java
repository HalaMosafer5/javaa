public class Bat extends Mammal {
    public Bat() {
        this.energyLevel = 300; 
    }

    public void fly() {
        System.out.println("The bat takes off and flies away.");
        energyLevel -= 50;
    }

    public void eatHumans() {
        System.out.println("The bat eats a human and feels energized.");
        energyLevel += 25;
    }

    public void attackTown() {
        System.out.println("The sound of a town on fire echoes as the bat attacks.");
        energyLevel -= 100;
    }
}