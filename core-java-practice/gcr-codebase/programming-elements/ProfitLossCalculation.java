//Create ProfitLossCalculation class to calculate profit and profit percentage

public class ProfitLossCalculation {
    public static void main(String[]args){
        //Create variable to store cost price and selling price
        double costPrice=129,sellingPrice=191;

        //Calculate profit
        double profit=sellingPrice-costPrice;

        //Calculate profit percentage
        double profitPercentage=(profit/costPrice)*100;

        //Display the result
        System.out.println("The Cost Price is INR " + costPrice+ " and selling Price is INR "+ sellingPrice+"\n"+
            "The Profit is INR " +profit+ "and the Profit Percentage is "+profitPercentage
        );
    }
}
