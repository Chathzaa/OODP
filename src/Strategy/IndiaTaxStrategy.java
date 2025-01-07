package Strategy;
public class IndiaTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double amount) {
        // Let's assume India tax rate is 18%
        return amount * 0.18;
    }
}
