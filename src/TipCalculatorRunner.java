import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat formatter = new DecimalFormat("#.##");

        //user input
        System.out.println("Welcome to the tip calculator!");
        System.out.print("How many people are in your group? ");
        int numPeople = scan.nextInt();
        scan.nextLine();
        System.out.print("What's the tip percentage? (0-100): ");
        int tipPercentage = scan.nextInt();
        scan.nextLine();
        while ( > -1) {
            System.out.print("Enter a cost in dollars and cents, e.g. 12.40 (type -1 to end): $");
            double addMeal = scan.nextDouble();
        }

        //output and results of required information after user input
        System.out.println("---------------------");
        System.out.println("Total Bill Before Tip: $" + ());
        System.out.println("Tip Percentage: $" + formatter.format(tipPercentage));
        System.out.println("Total Tip: $" + formatter.format();
        System.out.println("Total Bill With Tip: $" + formatter.format();
        System.out.println("Per Person Cost Before Tip: $" + formatter.format();
        System.out.println("Tip Per Person: $" + formatter.format();
        System.out.println("Total Cost Per Person: $" + formatter.format();

    }
}