package Strategy;
// Step 5: Context (TaxCalculator) class
public class TaxCalculator {

    private TaxStrategy taxStrategy;

    // Constructor to set the strategy
    public TaxCalculator(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }

    // Method to calculate the tax using the current strategy
    public double calculateTax(double amount) {
        return taxStrategy.calculateTax(amount);
    }

    // Method to change the strategy at runtime
    public void setTaxStrategy(TaxStrategy taxStrategy) {
        this.taxStrategy = taxStrategy;
    }
}
