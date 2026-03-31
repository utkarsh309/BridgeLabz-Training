package scenerioBased;

//Create DigitalWatchSimulation class to simulate a 24-hour digital watch
public class DigitalWatchSimulation {

 public static void main(String[] args) {

     // Loop for hours (0 to 23)
     for (int hour = 0; hour < 24; hour++) {

         // Loop for minutes (0 to 59)
         for (int minute = 0; minute < 60; minute++) {

             // Check for power cut at 13:00
             if (hour == 13 && minute == 0) {
                 System.out.println("Power cut at 13:00");
                 break;
             }

             // Print time in HH:MM format
             System.out.println(hour + ":" + (minute < 10 ? "0" + minute : minute));
         }

         // Stop outer loop as well when power cut occurs
         if (hour == 13) {
             break;
         }
     }
 }
}

