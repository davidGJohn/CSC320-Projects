import java.util.Scanner;

public class TaxWithholdingCalculator {
    public static void main(String[] args) {
    
        Scanner scnr = new Scanner(System.in);
        int income;
        double taxRate;
        double taxWithholding;

        System.out.print("Please enter your weekly income: $"); 
        income = scnr.nextInt();

        if (income < 500) {
            taxRate = 0.10;
        } else if (income >= 500 && income < 1500) {
            taxRate = 0.15;
        } else if (income >= 1500 && income < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        taxWithholding = income * taxRate;
        System.out.println("For a weekly income of $" + income);
        System.out.println("Your tax withholding is $" + taxWithholding);
        scnr.close();
    }
}