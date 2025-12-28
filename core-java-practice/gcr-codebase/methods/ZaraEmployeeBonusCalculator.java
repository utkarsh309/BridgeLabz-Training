
// Create ZaraEmployeeBonusCalculator class
public class ZaraEmployeeBonusCalculator {

    public static void main(String[] args) {

        // Total number of employees
        int totalEmployees = 10;

        // Get salary and years of service for employees
        double[][] employeeData = generateSalaryAndService(totalEmployees);

        // Calculate bonus and new salary
        double[][] salaryAndBonus = calculateBonusAndNewSalary(employeeData);

        // Display final result
        displaySalaryDetails(employeeData, salaryAndBonus);
    }

    // Method to generate random salary and years of service
    public static double[][] generateSalaryAndService(int totalEmployees) {

        double[][] employeeData = new double[totalEmployees][2];

        for (int index = 0; index < totalEmployees; index++) {

            // Generate 5-digit salary (10000 to 99999)
            double salary = 10000 + Math.random() * 90000;

            // Generate years of service (1 to 10)
            double yearsOfService = 1 + Math.random() * 10;

            employeeData[index][0] = salary;
            employeeData[index][1] = yearsOfService;
        }

        return employeeData;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {

        double[][] salaryAndBonus = new double[employeeData.length][2];

        for (int index = 0; index < employeeData.length; index++) {

            double salary = employeeData[index][0];
            double yearsOfService = employeeData[index][1];
            double bonus;

            // Bonus logic
            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }

            double newSalary = salary + bonus;

            salaryAndBonus[index][0] = bonus;
            salaryAndBonus[index][1] = newSalary;
        }

        return salaryAndBonus;
    }

    // Method to display results in simple format
    public static void displaySalaryDetails(double[][] employeeData, double[][] salaryAndBonus) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        for (int index = 0; index < employeeData.length; index++) {

            double oldSalary = employeeData[index][0];
            double yearsOfService = employeeData[index][1];
            double bonus = salaryAndBonus[index][0];
            double newSalary = salaryAndBonus[index][1];

            totalOldSalary += oldSalary;
            totalBonus += bonus;
            totalNewSalary += newSalary;

            System.out.println("Employee " + (index + 1));
            System.out.println("Old Salary : " + (int) oldSalary);
            System.out.println("Years of Service : " + (int) yearsOfService);
            System.out.println("Bonus : " + (int) bonus);
            System.out.println("New Salary : " + (int) newSalary);
            System.out.println();
        }

        
        System.out.println("Total Old Salary : " + (int) totalOldSalary);
        System.out.println("Total Bonus Paid : " + (int) totalBonus);
        System.out.println("Total New Salary : " + (int) totalNewSalary);
    }
}
