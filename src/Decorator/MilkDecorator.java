package Decorator;
// MilkDecorator.java (Concrete Decorator)
public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double cost() {
        return decoratedCoffee.cost() + 1.5;  // Adding cost for milk
    }
}

