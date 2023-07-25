import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaxCalculator payer;
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.print("How much do you earn annually? ");
        double income = input.nextDouble();

        System.out.print("Are you single (1) or married (2)? ");
        int category = input.nextInt();

        if(category == 1) {
            System.out.print("How many people is depending on you? ");
            int dependent = input.nextInt();

            payer = new SingleTaxPayer(name, income, dependent);
        } else {
            System.out.print("How much do your spouse earn annually? ");
            double spouseIncome = input.nextDouble();

            payer = new MarriedTaxPayer(name, income, spouseIncome);
        }

        System.out.println("Name: " + payer.getName());
        System.out.println("Annual Income: " + payer.getAnnualIncome());
        if(payer instanceof SingleTaxPayer)
            System.out.println("Number of Dependents: " + ((SingleTaxPayer)payer).getNumberOfDependents());
        System.out.println("Income Tax: " + payer.calculateTax());
    }
}