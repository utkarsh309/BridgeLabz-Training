public class MostFrequentChar {
    public static void main(String[] args) {
        String input = "success";
        
        // 1. Array to store counts of 256 ASCII characters
        int[] freq = new int[256];
        
        // 2. Increment counts for each character in the string
        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }
        
        // 3. Find the character with the highest count
        int max = -1;
        char result = ' ';
        
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (max < freq[currentChar]) {
                max = freq[currentChar];
                result = currentChar;
            }
        }
        
        System.out.println("Most Frequent Character: '" + result + "'");
        System.out.println("Frequency: " + max);
    }
}