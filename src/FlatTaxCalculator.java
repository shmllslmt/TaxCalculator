public class FlatTaxCalculator extends TaxCalculator {
    private double flatTaxRate;

    protected FlatTaxCalculator() {
        this(0);
    }
    protected FlatTaxCalculator(double flatTaxRate) {
        this.flatTaxRate = flatTaxRate;
    }
    protected FlatTaxCalculator(String name, double annualIncome, double flatTaxRate) {
        super(name, annualIncome);
        this.flatTaxRate = flatTaxRate;
    }

    public double getFlatTaxRate() {
        return flatTaxRate;
    }

    public void setFlatTaxRate(double flatTaxRate) {
        this.flatTaxRate = flatTaxRate;
    }

    @Override
    public double calculateTax() {
        return super.getAnnualIncome() * flatTaxRate;
    }
}
