package Strategy;
public class MainSt {
    public static void main(String[] args) {
        // Customer wants to calculate tax for a purchase of $1000
        double amount = 1000.0;

        // Initially using the USA Tax Strategy
        TaxCalculator calculator = new TaxCalculator(new USTaxStrategy());
        System.out.println("Tax in USA: " + calculator.calculateTax(amount));  // Tax in USA: 100.0

        // Now, the customer changes their location to UK
        calculator.setTaxStrategy(new UKTaxStrategy());
        System.out.println("Tax in UK: " + calculator.calculateTax(amount));  // Tax in UK: 200.0

        // Customer moves to India
        calculator.setTaxStrategy(new IndiaTaxStrategy());
        System.out.println("Tax in India: " + calculator.calculateTax(amount));  // Tax in India: 180.0
    }
}

