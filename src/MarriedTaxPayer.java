public class MarriedTaxPayer extends TaxCalculator {
    private double spouseAnnualIncome;
    protected MarriedTaxPayer() {
        this(100000);
    }
    protected MarriedTaxPayer(double spouseAnnualIncome) {
        this.spouseAnnualIncome = spouseAnnualIncome;
    }
    protected MarriedTaxPayer(String name, double annualIncome, double spouseAnnualIncome) {
        super(name, annualIncome);
        this.spouseAnnualIncome = spouseAnnualIncome;
    }
    @Override
    public double calculateTax() {
        double combinedIncome = getAnnualIncome() + spouseAnnualIncome;

        if(combinedIncome > 150000)
            return 0.15 * getAnnualIncome();
        else if (combinedIncome >= 75001 && combinedIncome <= 150000)
            return 0.1 * getAnnualIncome();
        else
            return 0.05 * getAnnualIncome();
    }
}
