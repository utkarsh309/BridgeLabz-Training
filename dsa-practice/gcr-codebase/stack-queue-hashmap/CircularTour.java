package dsa;

class CircularTour {

    public static int findStartingPoint(int[] petrol, int[] distance) {

        int totalSurplus = 0;
        int currentSurplus = 0;
        int startIndex = 0;

        for (int i = 0; i < petrol.length; i++) {

            int difference = petrol[i] - distance[i];

            totalSurplus += difference;
            currentSurplus += difference;

            // If surplus becomes negative, change starting point
            if (currentSurplus < 0) {
                startIndex = i + 1;
                currentSurplus = 0;
            }
        }

        // If totalSurplus is negative, no solution exists
        if (totalSurplus < 0) {
            return -1;
        }

        return startIndex;
    }

    public static void main(String[] args) {

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int result = findStartingPoint(petrol, distance);

        if (result == -1) {
            System.out.println("No possible circular tour");
        } else {
            System.out.println("Start from petrol pump index: " + result);
        }
    }
}

