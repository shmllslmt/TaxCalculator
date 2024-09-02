public class TaxCalculator {
    private String name;
    private double annualIncome;
    public TaxCalculator() {
        this("John Doe", 150000);
    }
    public TaxCalculator(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double calculateTax() { return 0; }
}
