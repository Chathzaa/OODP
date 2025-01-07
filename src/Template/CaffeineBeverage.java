package Template;

// Abstract class defining the template method
public abstract class CaffeineBeverage {

    // Template Method defining the structure of the algorithm
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Concrete methods common to all drinks
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Abstract methods to be implemented by subclasses
    protected abstract void brew();       // Step that will vary
    protected abstract void addCondiments(); // Step that will vary
}
