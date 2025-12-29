public class WordReplacer {
    public static void main(String[] args) {
        String sentence = "the quick brown fox jumps over the lazy dog";
        String target = "fox";
        String replacement = "cat";

        String result = replaceWord(sentence, target, replacement);
        System.out.println("Result: " + result);
    }

    public static String replaceWord(String sentence, String target, String replacement) {
        // 1. Split the sentence into words using space as a delimiter
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            // 2. Check if the current word matches the target
            if (words[i].equals(target)) {
                sb.append(replacement);
            } else {
                sb.append(words[i]);
            }

            // 3. Add a space after each word except the last one
            if (i < words.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}