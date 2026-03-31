public class LeetCode345ReverseVowels {

    public static void main(String[] args) {

        String input = "hello";

        // Call method to reverse vowels
        String result = reverseVowels(input);

        // Display output
        System.out.println("Original String : " + input);
        System.out.println("After Reversing Vowels : " + result);
    }

    // Method to reverse vowels in a string
    public static String reverseVowels(String text) {

        // Convert string to character array
        char[] characters = text.toCharArray();

        int left = 0;
        int right = characters.length - 1;

        // Use two pointer approach
        while (left < right) {

            // Move left pointer until a vowel is found
            while (left < right && !isVowel(characters[left])) {
                left++;
            }

            // Move right pointer until a vowel is found
            while (left < right && !isVowel(characters[right])) {
                right--;
            }

            // Swap vowels
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;

            left++;
            right--;
        }

        return new String(characters);
    }

    // Method to check if a character is vowel
    public static boolean isVowel(char ch) {

        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
