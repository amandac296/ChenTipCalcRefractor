public class TipCalculator {

    //instance variables
    private int numPeople;
    private int tipPercentage;
    double totalBillBeforeTip;

    //constructor
    public TipCalculator(int numPeople, int tipPercentage) {
        this.numPeople = numPeople;
        this.tipPercentage = tipPercentage;
        totalBillBeforeTip = 0.0;
    }

    //methods that return values
    //total bill before tip
    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    //tip percentage
    public int getTipPercentage() {
        return tipPercentage;
    }

    //add meal
    public void addMeal(double cost) {
        totalBillBeforeTip = cost + totalBillBeforeTip;
        totalBillBeforeTip = totalBillBeforeTip;
    }

    //total tip
    public double tipAmount() {
        return totalBillBeforeTip * (tipPercentage/100.0);
    }

    //total bill
    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }

    //cost per person before tip
    public double perPersonCostBeforeTip() {
        return totalBillBeforeTip / numPeople;
    }

    //cost of tip per person
    public double perPersonTipAmount() {
        return tipAmount() / numPeople;
    }

    //total cost per person
    public double perPersonTotalCost() {
        return perPersonCostBeforeTip() + perPersonTipAmount();
    }
}







