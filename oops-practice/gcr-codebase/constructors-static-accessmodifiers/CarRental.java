package constructor;

public class CarRental {

    // Attributes
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Cost per day (constant)
    private static final double COST_PER_DAY = 1000.0;

    // Default Constructor
    public CarRental() {
        this("Animesh", "Swift Dzire", 3);
    }

    // Parameterized Constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    // Method to display rental details
    public void displayDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model : " + carModel);
        System.out.println("Rental Days : " + rentalDays);
        System.out.println("Total Cost : " + calculateTotalCost());
    }

    // Main method
    public static void main(String[] args) {

        // Using parameterized constructor
        CarRental rental = new CarRental("Utkarsh", "Swift Dzire", 5);
        rental.displayDetails();
    }
}
