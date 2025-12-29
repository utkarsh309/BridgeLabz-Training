package scenerioBased;

// Create FitnessChallengeTracker class to track weekly push-ups
public class FitnessChallengeTracker {

    public static void main(String[] args) {

        // Push-up counts for 7 days (0 indicates rest day)
        int[] weeklyPushUps = {50, 0, 40, 60, 0, 70, 80};

        int totalPushUps = 0;
        int activeDays = 0;

        // Use for-each loop to calculate total and average
        for (int pushUps : weeklyPushUps) {

            // Skip rest days
            if (pushUps == 0) {
                continue;
            }

            totalPushUps += pushUps;
            activeDays++;
        }

        // Calculate average push-ups per active day
        double averagePushUps = 0;
        if (activeDays > 0) {
            averagePushUps = (double) totalPushUps / activeDays;
        }

        // Display results
        System.out.println("Total Push-Ups in the Week: " + totalPushUps);
        System.out.println("Active Workout Days: " + activeDays);
        System.out.println("Average Push-Ups per Active Day: " + averagePushUps);
    }
}
