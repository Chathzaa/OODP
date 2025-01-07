package Template;

// Main class (Client)
public class MainT {
    public static void main(String[] args) {
        // Create a Tea and Coffee object
        CaffeineBeverage tea = new Tea();
        CaffeineBeverage coffee = new Coffee();

        // Make tea and coffee
        System.out.println("Making Tea:");
        tea.prepareRecipe();

        System.out.println("\nMaking Coffee:");
        coffee.prepareRecipe();
    }
}

