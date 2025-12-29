public class LexicographicalStringCompare {

    public static void main(String[] args) {

        String str1 = "apple";
        String str2 = "banana";

        int result = compareStrings(str1, str2);

        if (result == 0) {
            System.out.println("Both strings are equal");
        } else if (result < 0) {
            System.out.println("String 1 comes before String 2");
        } else {
            System.out.println("String 1 comes after String 2");
        }
    }

    // Method to compare two strings lexicographically
    public static int compareStrings(String s1, String s2) {

        int minLength = Math.min(s1.length(), s2.length());

        for (int i = 0; i < minLength; i++) {
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if (ch1 != ch2) {
                return ch1 - ch2; // ASCII difference
            }
        }

        // If all characters are same till min length
        return s1.length() - s2.length();
    }
}
