package exceptions;

public class ThrowVsThrowsDemo {
	
	// Method that propagates exception using throws
    public static double calculateInterest(double amount, double rate, int years)
            throws IllegalArgumentException {

        // If invalid input, throw exception
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException();
        }

        // Simple Interest formula
        return (amount * rate * years) / 100;
    }

	public static void main(String[] args) {
		
		try {
			double interest=calculateInterest(1000,5,2);
			System.out.println("Interest: "+interest);
		}catch(IllegalArgumentException e) {
			System.out.println("Invalid input: Amount and rate must be positive");
		}

	}

}
