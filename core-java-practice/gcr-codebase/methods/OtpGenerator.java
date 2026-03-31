// Create OtpGenerator class to generate and validate OTP numbers
public class OtpGenerator {

    public static void main(String[] args) {

        // Create array to store 10 OTP numbers
        int[] otpArray = new int[10];

        // Generate 10 OTPs
        for (int index = 0; index < otpArray.length; index++) {
            otpArray[index] = generateSixDigitOtp();
        }

        // Display generated OTPs
        System.out.println("Generated OTPs:");
        for (int index = 0; index < otpArray.length; index++) {
            System.out.println(otpArray[index]);
        }

        // Check if all OTPs are unique
        boolean isUnique = checkUniqueOtps(otpArray);

        // Display result
        System.out.println("All OTPs are unique: " + isUnique);
    }

    // Method to generate a 6-digit OTP using Math.random()
    public static int generateSixDigitOtp() {

        // Generates random number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to check whether all OTPs are unique
    public static boolean checkUniqueOtps(int[] otps) {

        // Compare each OTP with every other OTP
        for (int first = 0; first < otps.length; first++) {

            for (int second = first + 1; second < otps.length; second++) {

                if (otps[first] == otps[second]) {
                    return false;
                }
            }
        }
        return true;
    }
}
