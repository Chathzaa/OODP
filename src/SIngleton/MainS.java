package SIngleton;
public class MainS {
    public static void main(String[] args) {
        // The first time we call getInstance(), it creates the CoffeeMachine
        CoffeeMachine coffeeMachine1 = CoffeeMachine.getInstance();
        coffeeMachine1.brewCoffee();  // Brewing coffee...

        // Trying to get another CoffeeMachine instance
        CoffeeMachine coffeeMachine2 = CoffeeMachine.getInstance();
        coffeeMachine2.brewCoffee();  // Brewing coffee...

        // Check if both instances are the same (they should be)
        System.out.println("Are both coffee machines the same instance? " + (coffeeMachine1 == coffeeMachine2));
    }
}

