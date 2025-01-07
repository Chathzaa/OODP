package Decorator;
// Main.java (Client)
public class MainD {
    public static void main(String[] args) {
        // Simple black coffee
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost of simple coffee: $" + simpleCoffee.cost());

        // Add milk to the coffee
        Coffee milkCoffee = new MilkDecorator(simpleCoffee);
        System.out.println("Cost of coffee with milk: $" + milkCoffee.cost());

        // Add sugar to the coffee with milk
        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println("Cost of coffee with milk and sugar: $" + milkSugarCoffee.cost());

        // Add sugar to the original simple coffee
        Coffee sugarCoffee = new SugarDecorator(simpleCoffee);
        System.out.println("Cost of coffee with sugar: $" + sugarCoffee.cost());
    }
}

