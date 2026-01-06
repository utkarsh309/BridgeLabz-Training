package scenerioBased2;

//Create TextFormatter class to format text
public class TextFormatter {

    public static String formatText(String text) {

        // If text is empty, return empty string
        if (text == null || text.trim().isEmpty()) {
            return "";
        }

        // Remove extra spaces
        text = text.trim().replaceAll("\\s+", " ");

        // Add one space after punctuation
        text = text.replaceAll("([.!?])", "$1 ");

        // Convert text to character array
        char[] characters = text.toCharArray();
        boolean makeCapital = true;

        // Capitalize first letter of each sentence
        for (int i = 0; i < characters.length; i++) {

            if (makeCapital && Character.isLetter(characters[i])) {
                characters[i] = Character.toUpperCase(characters[i]);
                makeCapital = false;
            }

            if (characters[i] == '.' || characters[i] == '?' || characters[i] == '!') {
                makeCapital = true;
            }
        }

        return new String(characters).trim();
    }

    public static void main(String[] args) {

        String input = "   hello   world.this is   java!how are you?i am fine. ";
        //display result
        System.out.println(formatText(input));
    }
}

