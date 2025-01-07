package Decorator;
// SimpleCoffee.java (Concrete Component)
public class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 5.0;  // Base price of simple coffee
    }
}

