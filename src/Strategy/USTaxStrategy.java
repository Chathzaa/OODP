package Strategy;
// Step 2: Concrete Strategy for USA
public class USTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        // Let's assume USA tax rate is 10%
        return amount * 0.10;
    }
}


