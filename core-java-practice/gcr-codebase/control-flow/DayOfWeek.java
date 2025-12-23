package controlFlow;

//Create DayOfWeek class to find the day of the week for a given date


class DayOfWeek {

 public static void main(String[] args) {

     // Read command-line arguments
     int month = Integer.parseInt(args[0]);
     int day = Integer.parseInt(args[1]);
     int year = Integer.parseInt(args[2]);

     // Apply given formulas 
     int y0 = year - (14 - month) / 12;
     int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
     int m0 = month + 12 * ((14 - month) / 12) - 2;
     int d0 = (day + x + (31 * m0) / 12) % 7;

     // Print the day of the week
     System.out.println(d0);
 }
}
