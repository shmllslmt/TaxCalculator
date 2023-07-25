public class SingleTaxPayer extends TaxCalculator {
    private int numberOfDependents;

    protected SingleTaxPayer() {
        this(0);
    }
    protected SingleTaxPayer(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }
    protected SingleTaxPayer(String name, double annualIncome, int numberOfDependents) {
        super(name, annualIncome);
        this.numberOfDependents = numberOfDependents;
    }

    public int getNumberOfDependents() {
        return numberOfDependents;
    }

    public void setNumberOfDependents(int numberOfDependents) {
        this.numberOfDependents = numberOfDependents;
    }

    @Override
    public double calculateTax() {
        if(super.getAnnualIncome() > 100000)
            return 0.15 * getAnnualIncome();
        else if (super.getAnnualIncome() >= 50001 && super.getAnnualIncome() <= 100000)
            return 0.1 * getAnnualIncome();
        else
            return 0.05 * getAnnualIncome();
    }
}
