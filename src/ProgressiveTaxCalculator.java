import java.util.ArrayList;

public class ProgressiveTaxCalculator extends TaxCalculator {
    private ArrayList<TaxBracket> taxBrackets;

    public ProgressiveTaxCalculator() {
        taxBrackets = new ArrayList<>();
    }
    public ProgressiveTaxCalculator(String name, double annualIncome) {
        super(name, annualIncome);
        taxBrackets = new ArrayList<>();
    }

    public void addBracket(TaxBracket bracket) {
        taxBrackets.add(bracket);
    }

    @Override
    public double calculateTax() {
        double tax = 0.0;

        TaxBracket userBracket = new TaxBracket(0, 0, 0, 0);
        for (TaxBracket bracket : taxBrackets) {
            if (super.getAnnualIncome() > bracket.getMinIncome() && super.getAnnualIncome() <= bracket.getMaxIncome()) {
                userBracket = bracket;
            }
        }

        tax = userBracket.getMinTax() + (userBracket.getTaxRate() * (super.getAnnualIncome() - userBracket.getMinIncome()));

        return tax;
    }
}
