public class TaxBracket {
    private double minIncome;
    private double maxIncome;
    private double minTax;
    private double taxRate;

    public TaxBracket(double minIncome, double maxIncome, double taxRate, double minTax) {
        this.minIncome = minIncome;
        this.maxIncome = maxIncome;
        this.taxRate = taxRate;
        this.minTax = minTax;
    }

    public double getMinIncome() {
        return minIncome;
    }

    public double getMaxIncome() {
        return maxIncome;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getMinTax() {
        return minTax;
    }
}
