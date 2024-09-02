import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How much did you earn in a month? ");
        double monthlyIncome = input.nextDouble();
        double annualIncome = monthlyIncome * 12;

        ProgressiveTaxCalculator progressive = new ProgressiveTaxCalculator("Alex", annualIncome);

        progressive.addBracket(new TaxBracket(0, 5000, 0, 0));
        progressive.addBracket(new TaxBracket(5000, 20000, 0.01, 0));
        progressive.addBracket(new TaxBracket(20000, 35000, 0.03, 150));
        progressive.addBracket(new TaxBracket(35000, 50000, 0.06, 600));
        progressive.addBracket(new TaxBracket(50000, 70000, 0.11, 1500));
        progressive.addBracket(new TaxBracket(70000, 100000, 0.19, 3700));
        progressive.addBracket(new TaxBracket(100000, 400000, 0.25, 9400));
        progressive.addBracket(new TaxBracket(400000, 600000, 0.26, 84400));
        progressive.addBracket(new TaxBracket(600000, 2000000, 0.28, 136400));
        progressive.addBracket(new TaxBracket(2000000, 999999999, 0.30, 528400));

        System.out.println(progressive.getName() + " earns " + progressive.getAnnualIncome() + " per year.");
        System.out.println(progressive.getName() + " needs to pay " + progressive.calculateTax() + " in tax.");
    }
}