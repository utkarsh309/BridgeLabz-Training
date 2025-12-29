public class RemoveChar {
    public static void main(String[] args) {
        String input = "Hello World";
        char target = 'l';
        
        StringBuilder result = new StringBuilder();

        // Loop through each character of the string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            
            // Append only if it is NOT the target character
            if (currentChar != target) {
                result.append(currentChar);
            }
        }

        System.out.println("Modified String: " + result.toString());
    }
}