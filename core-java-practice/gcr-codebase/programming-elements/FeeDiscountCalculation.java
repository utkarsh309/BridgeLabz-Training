// Create FeeDiscountCalculation class to calculate discount on fee
class FeeDiscountCalculation {

    public static void main(String[] args) {

        // Create variable to store course fee
        double fee = 125000;

        // Create variable to store discount percentage
        double discountPercent = 10;

        // Calculate discount amount
        double discountAmount = (fee * discountPercent) / 100;

        // Calculate final discounted fee
        double finalDiscountedFee = fee - discountAmount;

        // Display the result
        System.out.println("The discount amount is INR " + discountAmount +
            " and final discounted fee is INR " + finalDiscountedFee
        );
    }
}
