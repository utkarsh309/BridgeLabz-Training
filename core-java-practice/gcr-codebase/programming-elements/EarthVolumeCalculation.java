// Create EarthVolumeCalculation class to compute volume of Earth
class EarthVolumeCalculation {

    public static void main(String[] args) {

        // Create variable to store radius of Earth in kilometers
        double radiusInKilometers = 6378;

        // Create variable to store value of pi
        double piValue = 3.142;

        // Calculate volume of Earth in cubic kilometers
        double volumeInCubicKilometers =
                (4.0 / 3.0) * piValue * radiusInKilometers * radiusInKilometers * radiusInKilometers;

        // Create conversion factor from kilometer to miles
        double kilometerToMilesFactor = 0.621;

        // Convert radius to miles
        double radiusInMiles = radiusInKilometers * kilometerToMilesFactor;

        // Calculate volume of Earth in cubic miles
        double volumeInCubicMiles =
                (4.0 / 3.0) * piValue * radiusInMiles * radiusInMiles * radiusInMiles;

        // Display the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeInCubicKilometers +
                " and cubic miles is " + volumeInCubicMiles
        );
    }
}
