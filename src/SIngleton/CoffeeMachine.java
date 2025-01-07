package SIngleton;
// CoffeeMachine.java
public class CoffeeMachine {

    // The single instance of CoffeeMachine (private and static)
    private static CoffeeMachine instance;

    // Private constructor to prevent instantiation from outside
    private CoffeeMachine() {
        // Simulating some setup when the coffee machine is initialized
        System.out.println("CoffeeMachine: Initialized and ready to brew coffee!");
    }

    // Public method to access the singleton instance
    public static CoffeeMachine getInstance() {
        if (instance == null) {
            // Create the instance only if it doesn't exist
            instance = new CoffeeMachine();
        }
        return instance;
    }

    // Method to simulate brewing coffee
    public void brewCoffee() {
        System.out.println("Brewing coffee...");
    }
}


