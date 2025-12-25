package arrays;

//Create ZaraEmployeeBonusCalculator class to calculate bonus and salaries of employees
import java.util.Scanner;

class ZaraEmployeeBonusCalculator {

 public static void main(String[] args) {

     // Create Scanner object to take input from keyboard
     Scanner input = new Scanner(System.in);

     // Define constant for total number of employees
     int totalEmployees = 10;

     // Create arrays to store salary, years of service, bonus, and new salary
     double[] salaries = new double[totalEmployees];
     double[] yearsOfService = new double[totalEmployees];
     double[] bonusAmounts = new double[totalEmployees];
     double[] newSalaries = new double[totalEmployees];

     // Variables to store totals
     double totalBonus = 0.0;
     double totalOldSalary = 0.0;
     double totalNewSalary = 0.0;

     // Take input for salary and years of service
     for (int index = 0; index < totalEmployees; index++) {

         double salary = input.nextDouble();
         double years = input.nextDouble();

         // Validate input
         if (salary <= 0 || years < 0) {
             System.out.println("Invalid input. Please enter again.");
             index--; // decrement index to re-enter data for the same employee
             continue;
         }

         salaries[index] = salary;
         yearsOfService[index] = years;
     }

     // Calculate bonus, new salary, and totals
     for (int index = 0; index < totalEmployees; index++) {

         double bonusPercentage;

         // Determine bonus percentage based on years of service
         if (yearsOfService[index] > 5) {
             bonusPercentage = 5.0;
         } else {
             bonusPercentage = 2.0;
         }

         // Calculate bonus and new salary
         bonusAmounts[index] = salaries[index] * bonusPercentage / 100;
         newSalaries[index] = salaries[index] + bonusAmounts[index];

         // Update totals
         totalBonus = totalBonus + bonusAmounts[index];
         totalOldSalary = totalOldSalary + salaries[index];
         totalNewSalary = totalNewSalary + newSalaries[index];
     }

     // Display final results
     System.out.println("Total Bonus Amount to be Paid: " + totalBonus);
     System.out.println("Total Old Salary of All Employees: " + totalOldSalary);
     System.out.println("Total New Salary of All Employees: " + totalNewSalary);

     // Close scanner
     input.close();
 }
}

