package Strategy;
public class UKTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        // Let's assume UK tax rate is 20%
        return amount * 0.20;
    }
}
