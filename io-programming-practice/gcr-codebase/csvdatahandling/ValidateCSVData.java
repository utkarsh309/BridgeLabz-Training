package csvdatahandling;

import java.io.*;

// Custom exception
class InvalidRowException extends Exception {
    public InvalidRowException(String message) {
        super(message);
    }
}

public class ValidateCSVData {

    public static void validateData(String filePath) {

        String line;
        int rowNumber = 1; // header row

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            // Skip header
            reader.readLine();

            while ((line = reader.readLine()) != null) {
                rowNumber++;

                try {
                    validateRow(line, rowNumber);
                    System.out.println("Valid Row: " + line);

                } catch (InvalidRowException e) {
                    System.out.println("Row " + rowNumber + " Error: " + e.getMessage());
                }
            }

        } catch (IOException e) {
            System.out.println("Error in reading CSV file.");
            e.printStackTrace();
        }
    }

    // Validate individual row
    private static void validateRow(String line, int rowNumber) throws InvalidRowException {

        String[] data = line.split(",");

        if (data.length != 3) {
            throw new InvalidRowException("Incorrect number of columns");
        }

        String name = data[0].trim();
        String email = data[1].trim();
        String phone = data[2].trim();

        String emailRegex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        String phoneRegex = "[1-9][0-9]{9}";

        if (name.isEmpty()) {
            throw new InvalidRowException("Name is empty");
        }

        if (!email.matches(emailRegex)) {
            throw new InvalidRowException("Invalid email: " + email);
        }

        if (!phone.matches(phoneRegex)) {
            throw new InvalidRowException("Invalid phone: " + phone);
        }
    }

    public static void main(String[] args) {
        String filePath = "data.csv";
        validateData(filePath);
    }
}