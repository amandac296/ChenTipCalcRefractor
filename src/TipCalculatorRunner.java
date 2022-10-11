import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //user input
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int people = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();

        TipCalculator calc = new TipCalculator(people, tipPercentage);
        System.out.print("Enter a cost in dollars and cents, e.g. 12.40 (type -1 to end): $");
        double cost = scan.nextDouble();

        while (cost > -1) {
            calc.addMeal(cost);
            System.out.print("Enter a cost in dollars and cents, e.g. 12.40 (type -1 to end): $");
            cost = scan.nextDouble();
        }

        //output and results of required information after user input
        System.out.println("---------------------");
        System.out.println("Total Bill Before Tip: $" + formatter.format(calc.getTotalBillBeforeTip()));
        System.out.println("Tip Percentage: $" + formatter.format(calc.getTipPercentage()));
        System.out.println("Total Tip: $" + formatter.format(calc.tipAmount()));
        System.out.println("Total Bill With Tip: $" + formatter.format(calc.totalBill()));
        System.out.println("Per Person Cost Before Tip: $" + formatter.format(calc.perPersonCostBeforeTip()));
        System.out.println("Tip Per Person: $" + formatter.format(calc.perPersonTipAmount()));
        System.out.println("Total Cost Per Person: $" + formatter.format(calc.perPersonTotalCost()));

    }
}