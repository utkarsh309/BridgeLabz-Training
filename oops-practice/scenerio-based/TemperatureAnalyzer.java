package scenerioBased2;

// Create TemperatureAnalyzer class to find average, hottest, and coldest day
public class TemperatureAnalyzer {

    public static void main(String[] args) {

        // Create a 2D array to store hourly temperature for 7 days
        float[][] temperatures = new float[7][24];

        // Generate random temperature values
        for (int day = 0; day < temperatures.length; day++) {
            for (int hour = 0; hour < temperatures[day].length; hour++) {
                int minTemperature = -10;
                int maxTemperature = 30;
                temperatures[day][hour] =
                        (float) (Math.random() * (maxTemperature - minTemperature + 1) + minTemperature);
            }
        }

        // Array to store average temperature of each day
        float[] dailyAverages = new float[temperatures.length];

        // Calculate average temperature for each day
        for (int day = 0; day < temperatures.length; day++) {
            float dailyTemperatureSum = 0;

            for (int hour = 0; hour < temperatures[day].length; hour++) {
                dailyTemperatureSum += temperatures[day][hour];
            }

            dailyAverages[day] = dailyTemperatureSum / temperatures[day].length;
            System.out.println("Average temperature of Day " + (day + 1) + " is " + dailyAverages[day]);
        }

        // Variables to find hottest and coldest day
        float hottestTemperature = Float.MIN_VALUE;
        float coldestTemperature = Float.MAX_VALUE;
        int hottestDay = -1;
        int coldestDay = -1;

        // Determine hottest and coldest day based on averages
        for (int index = 0; index < dailyAverages.length; index++) {

            if (dailyAverages[index] > hottestTemperature) {
                hottestTemperature = dailyAverages[index];
                hottestDay = index + 1;
            }

            if (dailyAverages[index] < coldestTemperature) {
                coldestTemperature = dailyAverages[index];
                coldestDay = index + 1;
            }
        }

        // Display result
        System.out.println("Hottest day is Day " + hottestDay);
        System.out.println("Coldest day is Day " + coldestDay);
    }
}
