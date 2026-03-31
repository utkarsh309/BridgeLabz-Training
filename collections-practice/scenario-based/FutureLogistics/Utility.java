package scenario.FutureLogistics;

public class Utility {

    public static boolean validateTransportId(String transportId) {
        if (!transportId.matches("RTS\\d{3}[A-Z]")) {
            System.out.println("Transport id " + transportId + " is invalid");
            System.out.println("Please provide a valid record");
            return false;
        }
        return true;
    }

    public static GoodsTransport parseDetails(String input) {
        String[] data = input.split(":");

        String transportId = data[0];
        String date = data[1];
        int rating = Integer.parseInt(data[2]);
        String transportType = data[3];

        if (transportType.equalsIgnoreCase("BrickTransport")) {
            float brickSize = Float.parseFloat(data[4]);
            int brickQuantity = Integer.parseInt(data[5]);
            float brickPrice = Float.parseFloat(data[6]);

            return new BrickTransport(
                    transportId, date, rating,
                    brickSize, brickQuantity, brickPrice
            );
        }

        if (transportType.equalsIgnoreCase("TimberTransport")) {
            float timberLength = Float.parseFloat(data[4]);
            float timberRadius = Float.parseFloat(data[5]);
            String timberType = data[6];
            float timberPrice = Float.parseFloat(data[7]);

            return new TimberTransport(
                    transportId, date, rating,
                    timberLength, timberRadius, timberType, timberPrice
            );
        }

        return null;
    }

    public static String findObjectType(GoodsTransport goodsTransport) {
        if (goodsTransport instanceof TimberTransport) {
            return "TimberTransport";
        }
        if (goodsTransport instanceof BrickTransport) {
            return "BrickTransport";
        }
        return "Unknown";
    }

    public static float getVehiclePrice(String vehicleType) {
        if (vehicleType.equalsIgnoreCase("Truck")) {
            return 1000;
        } else if (vehicleType.equalsIgnoreCase("Lorry")) {
            return 1700;
        } else {
            return 3000;
        }
    }

    public static float calculateDiscount(float price, int rating) {
        if (rating == 5) {
            return price * 0.20f;
        } else if (rating == 3 || rating == 4) {
            return price * 0.10f;
        }
        return 0;
    }
}
